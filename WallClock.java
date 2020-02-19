package electronics;

/**
 * Class inheriting attributes from Clock. WallClock is a class which has
 * an is a relationship to Clock. Class data pertains to information about
 * a clock.
 *
 * @author jason steiger
 */
public class WallClock extends Clock
{
    /**
    * The constructor of WallClock class.
    *
    * @param manufacturer String name of who produced this wall clock.
    * @param price double price of the wall clock.
    * @param weight double weight of the wall clock.
    * @param room String room where wall clock is located.
    * @param currentTime String time for the wall clock to display.
    *
    */
    public WallClock(String manufacturer, double price, double weight, String room, String currentTime)
    {
        super(manufacturer, price, weight, room, currentTime);
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
        return super.toString();
    }
}
