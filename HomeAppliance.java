package electronics;

/**
 * Abstract class of Electronics, adds the room trait to child classes.
 *
 * @version 1.0
 * @author jason steiger
 */
public abstract class HomeAppliance extends Electronics
{
    protected String room;

    /**
    * Constructor for HomeAppliance, gets some of its attributes from
    * Electronic, the parent class.
    *
    * @param manufacturer String name of the company who produced the product.
    * @param price double the price of the product.
    * @param weight double the weight of the product.
    * @param room String the room which the product is in.
    *
    */
    public HomeAppliance(String manufacturer, double price, double weight, String room)
    {
        super(manufacturer, price, weight);
        this.room = room;
    }

    /**
    * This method returns the room which the object is in.
    *
    * @return String the name of the room
    *
    */
    public abstract String room()
    {
        return room;
    }

    /**
   * This method returns a formatted string to use for output.
   *
   * @return String the formatted string for output.
   *
   */
    public String toString()
    {
        return super.toString() + "\nRoom: " + room;
    }
}
