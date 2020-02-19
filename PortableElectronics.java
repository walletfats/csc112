package electronics;

/**
 * Abstract class which lays out a template for the derived classes.
 * PortableElectronics also is a derived class of Electronics.
 * Gives the derived classes key data.
 *
 * @author jason
 *
 */

public abstract class PortableElectronics extends Electronics
{
    protected String batteryType;

    /**
    * Constructor for the abstract class PortableElectronics.
    *
    * @param manufacturer String company which produced the product.
    * @param price double the price of the product.
    * @param weight double the weight of the product.
    * @param batteryType String the batteries of the product.
    *
    */
    PortableElectronics(String manufacturer, double price, double weight, String batteryType)
    {
        super(manufacturer, price, weight);
        this.batteryType = batteryType;
    }

    /**
    * Method to return the batteryType the product has.
    *
    * @return String the batteries of the product.
    */
    public String batteryType()
    {
        return batteryType;
    }

    /**
   * This method returns a formatted string to use for output.
   *
   * @return String the formatted string for output.
   *
   */
    public String toString()
    {
        return super.toString() + "\nBattery type: " + batteryType;
    }
}
