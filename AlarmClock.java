package electronics;

/**
 * AlarmClock class which inherits attributes from Clock.
 *
 * @version 1.1.1.1.1
 * @author jason
 *
 */
public class AlarmClock extends Clock
{
    protected String alarmTime;

    /**
    * Constructor for the AlarmClock class, has alarmTime which is unique
    * to its class.
    *
    * @param manufacturer String name of who produced this alarm clock.
    * @param price double price of the alarm clock.
    * @param weight double weight of the alarm clock.
    * @param room String room where alarm clock is located.
    * @param currentTime String time for the alarm clock to display.
    * @param alarmTime String time which the alarm clock will go off at.
    *
    */
    public AlarmClock(String manufacturer, double price, double weight, String room, String currentTime, String alarmTime)
    {
        super(manufacturer, price, weight, currentTime, room);
        this.alarmTime = alarmTime;
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
    * Setter for the alarm clock's time which it will go off at.
    *
    */
    public void setAlarm(String time)
    {
        time = alarmTime;
    }

    /**
   * This method returns a formatted string to use for output.
   *
   * @return String the formatted string for output.
   *
   */
    public String toString()
    {
        return super.toString() + "\nAlarm Time: " + alarmTime;
    }
}
