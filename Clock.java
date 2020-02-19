package electronics;

/**
 * Class for clocks inheriting some attributes from HomeAppliance.
 *
 * @version 1.1.1.1.1
 * @author jason
 *
 */
public class Clock extends HomeAppliance
{
    protected String currentTime;

    /**
    * Constructor for Clock class.
    *
    * @param manufacturer String name of manufacturer.
    * @param price double price of product.
    * @param weight double weight of product.
    * @param room String room the product is in.
    * @param currentTime String time on the clock.
    *
    */
    public Clock(String manufacturer, double price, double weight, String room, String currentTime)
    {
        super(manufacturer, price, weight, room);
        this.currentTime = currentTime;
    }

    /**
    * Getter for the time on the clock.
    *
    * @return String time on the clock.
    */
    public String getTime()
    {
        return currentTime;
    }

    /**
    * Setter for the time on the clock.
    *
    * @param time String current time.
    *
    */
    public void setTime(String time)
    {
        time = currentTime;
    }

    /**
    * This method returns the room which the object is in
    *
    * @return String the name of the room
    *
    */
    public String room()
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
        return super.toString() + "\nTime: " + currentTime;
    }
}
