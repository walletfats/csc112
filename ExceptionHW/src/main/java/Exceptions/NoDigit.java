package Exceptions;

/**
 * No Digit is a class for checking whether or not the
 * password contains at least one digit.
 * 
 * @version 1.1.1.1.1.1
 * @author jasonsteiger
 * 
 */
public class NoDigit extends Exception
{
    private String msg;
    
    public NoDigit(String msg)
    {
        super(msg);
    }
}
