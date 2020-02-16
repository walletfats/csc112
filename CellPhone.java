/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronics;

/**
 *
 * @author jason
 */
public class CellPhone extends PortableElectronics
{
    private String phoneNumber;
    private boolean hasCamera;
    
    public CellPhone(String manufacturer, double price, double weight, String number, boolean camera, String batteryType)
    {
        super(manufacturer, price, weight,batteryType);
        camera = hasCamera;
        number = phoneNumber;
    }
    
    public String batteryType()
    {
        return batteryType;
    }
    
    public String getNumber()
    {
        return phoneNumber;
    }
    
    public boolean takesPicture()
    {
        if (hasCamera == true)
            return true;
        
        else
           return false;   
    }
    
    public String toString()
    {
        String msg;
        
        if (hasCamera == true)
            msg = "Can take pictures";
        else
            msg = "Cannot take pictures";
        
        return super.toString() + "\nPhone number: " + "\n" + msg;
    }
}
