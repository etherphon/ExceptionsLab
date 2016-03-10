package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */

public class NameService {
   
    private static final int LAST_NAME_IDX = 0;
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
       // check to make sure there is a space in the name, if there is no space in the name
        // we don't know if there is a first and a last name
        
        if (fullName == null || fullName.isEmpty() || fullName.indexOf(" ") < LAST_NAME_IDX) {
            throw new IllegalArgumentException("Name cannot be null, empty, and must contain a space.");
        }
        //String lastName = null;
        
        int spaceIndex = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(spaceIndex, fullName.length());
        
        // alternative
//        String[] parts = fullName.split(" ");
        
        // Your code goes here. Assign your value to lastName
        return lastName;
    }
    

    
    
}
