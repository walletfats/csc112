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
public class HomeAppliance extends Electronics
{
    protected String room;
    
    public HomeAppliance(String manufacturer, double price, double weight, String room)
    {
        super(manufacturer, price, weight);
        this.room = room;
    }
            
    public String room()
    {
        return room;
    }
    
    public String toString()
    {
        return super.toString() + "\nRoom: " + room;
    }
}
