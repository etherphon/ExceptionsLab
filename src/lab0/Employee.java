package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    private static final int MAX_VACATION_DAYS = 28;
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 24;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;


    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
        this.setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }

    // vacation days can not be more than max days
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < 0 || daysVacation > MAX_VACATION_DAYS) {
            throw new IllegalArgumentException("Vacation days are out of range.");
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }
    
    // first name cannot be null, cannot be empty, cannot be less than 2 characters,
    // cannot be more than 15 characters
    public final void setFirstName(String firstName) throws IllegalArgumentException {
       if (firstName == null || firstName.isEmpty() ||
               firstName.length() < MIN_NAME_LENGTH || firstName.length() > MAX_NAME_LENGTH) {
           throw new IllegalArgumentException("First name can't be empty, and must be in valid range.");
       }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    // last name cannot be null, cannot be empty, cannot be less than 2 characters,
    // cannot be more than 15 characters
    public final void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.isEmpty() ||
               lastName.length() < MIN_NAME_LENGTH || lastName.length() > MAX_NAME_LENGTH) {
           throw new IllegalArgumentException("First name can't be empty, and must be in valid range.");
       }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        // this really should be validated somehow but we're not going to do that
        this.ssn = ssn;
    }
    
    
    
}
