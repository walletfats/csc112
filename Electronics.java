package electronics;

/**
 * Abstract class for all of the electronics, gives behvaior and attributes.
 *
 * @version 2.0
 * @author jason steiger
 */
public abstract class Electronics
{
    protected String manufacturer;
    protected double price;
    protected double weight;

    /**
    * Constructor for the Electronics abstract class.
    *
    * @param manufacturer String name of manufacturer.
    * @param price double price of product.
    * @param weight double weight of product.
    *
    */
    public Electronics(String manufacturer, double price, double weight)
    {
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
    }

    /**
   * This method returns a formatted string to use for output.
   *
   * @return String the formatted string for output.
   *
   */
    public String toString()
    {
        return "Manufacturer: " + manufacturer + "\nPrice: " + price + "\nWeight: " + weight;
    }


}
