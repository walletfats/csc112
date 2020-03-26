package ExceptionHW;
import Exceptions.NoDigit;
import Exceptions.PasswordTooShort;
import java.util.Scanner;

/**
 * Driver to check the exceptions making sure they work properly to ensure
 * a strong password for the user.
 * 
 * @version 1.2
 * @author jasonsteiger
 * 
 */
public class ExceptionClasses 
{           
    /**
     * 
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) 
    {
        boolean valid = false;
        
        while(!valid)
        {
           try 
           {
               lengthCheck();
               valid = true;    
           } 
           catch (PasswordTooShort e) 
           {
               
               valid = false;
           }   
        }
    }
    private static boolean digitCheck() throws NoDigit
    {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter password: ");
        //String pw = scan.nextLine();
        boolean numeric = true;
        String pw = "f";
        
        
        try
        {
            Integer num = Integer.parseInt(pw);
        }
        catch (NumberFormatException ex)
        {
            numeric = false;
        }
        if(numeric)
            System.out.println(pw + " is a number");
        else
        {
            System.out.println(pw + " is not a number");
            throw new NumberFormatException();
        }
        return numeric;
    }
    
    private static boolean lengthCheck() throws PasswordTooShort
    {
        boolean has8 = false;
        String msg = "eee";
        
        int pwLength = msg.length();
        
        if (pwLength >= 8)
        {
            has8 = true;
            System.out.println("Password is long enough");
        }
        else
        {
            System.out.println("Password is too short");
            throw new PasswordTooShort();
        }
        
        return has8;
    }
}
    