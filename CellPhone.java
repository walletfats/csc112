package electronics;

/**
* CellPhone class, contains some attributes from PortableElectronics.
* Parent and child.
*
 * @version 1.1.1.1.1
 * @author jason
 *
 */
public class CellPhone extends PortableElectronics
{
    private String phoneNumber;
    private boolean hasCamera;

    /**
    * Constructor for CellPhone, adds two private variables to this class.
    *
    * @param manufacturer String company which produced the phone.
    * @param price double the price of the phone.
    * @param weight double the weight of the phone.
    * @param number String number of the phone.
    * @param camera boolean states whether the phone has a camera.
    * @param batteryType String the batteries of the phone.
    *
    */
    public CellPhone(String manufacturer, double price, double weight, String number, boolean camera, String batteryType)
    {
        super(manufacturer, price, weight,batteryType);
        camera = hasCamera;
        number = phoneNumber;
    }

    /**
    * Method which returns the type of battery in the phone.
    *
    * @return String battery type of the phone.
    *
    */
    public String batteryType()
    {
        return batteryType;
    }

    /**
    * Getter for the number of the phone.
    *
    * @return String number of the phone.
    *
    */
    public String getNumber()
    {
        return phoneNumber;
    }

    /**
    * Method which returns whether the phone can take pictures.
    *
    * @return boolean tells whether the phone has a camera.
    *
    */
    public boolean takesPicture()
    {
        if (hasCamera == true)
            return true;

        else
           return false;
    }

    /**
    * This method returns a formatted string to use for output.
    *
    * @return String the formatted string for output.
    *
    */
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
