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
public class PortableElectronics extends Electronics
{
    protected String batteryType;
    
    PortableElectronics(String manufacturer, double price, double weight, String batteryType)
    {
        super(manufacturer, price, weight);
        this.batteryType = batteryType;
    }
    
    public String batteryType()
    {
        return batteryType;
    }
    
    public String toString()
    {
        return super.toString() + "\nBattery type: " + batteryType;
    }
}
