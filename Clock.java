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
public class Clock extends HomeAppliance
{
    protected String currentTime;
    
    public Clock(String manufacturer, double price, double weight, String room, String currentTime)
    {
        super(manufacturer, price, weight, room);
        this.currentTime = currentTime;
    }
    
    public String getTime()
    {
        return currentTime;
    }
    
    public void setTime(String time)
    {
        time = currentTime;
    }
    
    public String room()
    {
        return room;
    }
    
    public String toString()
    {
        return super.toString() + "\nTime: " + currentTime;
    }
}
