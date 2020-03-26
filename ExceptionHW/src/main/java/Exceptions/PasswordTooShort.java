package Exceptions;

/**
 * Class to check whether or not the password has an equal or greater value than
 * 8 tokens in the input.
 * 
 * @author jasonsteiger
 */
public class PasswordTooShort extends Exception
{
    private String msg;
        
    public PasswordTooShort(String msg)
    {
        super(msg);
    }
    
    public PasswordTooShort()
    {
        super("Too short of a password");
    }
    
}
