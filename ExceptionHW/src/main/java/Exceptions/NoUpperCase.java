package Exceptions;

/**
 *
 * @author jasonsteiger
 */
public class NoUpperCase extends Exception
{
    private String msg;
    
    public NoUpperCase(String msg)
    {
        super(msg);
    }
}
