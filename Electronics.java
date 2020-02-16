/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronics;

/**
 * 2/12/20 Tues/Thurs 4PM
 * @version 2.0
 * @author jason steiger
 */
public class Electronics
{
    protected String manufacturer;
    protected double price;
    protected double weight;

    public Electronics(String manufacturer, double price, double weight)
    {
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
    }

    public String toString()
    {
        return "Manufacturer: " + manufacturer + "\nPrice: " + price + "\nWeight: " + weight;
    }
    
    
}
