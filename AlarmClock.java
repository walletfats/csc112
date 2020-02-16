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
public class AlarmClock extends Clock
{
    protected String alarmTime;
    
    public AlarmClock(String manufacturer, double price, double weight, String room, String currentTime, String alarmTime)
    {
        super(manufacturer, price, weight, currentTime, room);
        this.alarmTime = alarmTime;
    }
    
    public String room()
    {
        return room;
    }
    
    public void setAlarm(String time)
    {
        time = alarmTime;
    }
    
    public String toString()
    {
        return super.toString() + "\nAlarm Time: " + alarmTime;
    }
}
