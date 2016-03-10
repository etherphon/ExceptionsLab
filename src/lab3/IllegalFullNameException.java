/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author jhedding
 */
public class IllegalFullNameException extends IllegalArgumentException {

    private static final String ERROR_MSG = "Sorry full name must consist of first and last name.";
    
    public IllegalFullNameException() {
        super(ERROR_MSG);
    }

    public IllegalFullNameException(String s) {
        super(ERROR_MSG);
    }

    public IllegalFullNameException(String message, Throwable cause) {
        super(ERROR_MSG, cause);
    }

    public IllegalFullNameException(Throwable cause) {
        super(cause);
    }
    
}