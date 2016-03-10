package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    private static final int LAST_NAME_IDX = 0;
    private static final String SPACE = " ";
    
    public String extractLastName(String fullName) throws IllegalArgumentException {
        
        String lastName = null;
        if (fullName == null || fullName.isEmpty() || fullName.indexOf(SPACE) < LAST_NAME_IDX) {
            throw new IllegalFullNameException();
        }
        //String lastName = null;
        
        int spaceIndex = fullName.lastIndexOf(SPACE);
        lastName = fullName.substring(spaceIndex, fullName.length());
        
        // alternative
//        String[] parts = fullName.split(" ");
        
        return lastName;
    }
    
}
