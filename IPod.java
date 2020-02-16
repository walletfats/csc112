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
public class IPod extends PortableElectronics
{
    protected int capacity;
    protected String modelType;
    
    IPod(String manufacturer, double price, double weight, String batteryType, String modelType, int capacity)
    {
        super(manufacturer, price, weight, batteryType);
        this.modelType = modelType;
        this.capacity = capacity;
    }
    
    public String batteryType()
    {
        return batteryType;
    }
    
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public void setModelType(String modelType)
    {
        this.modelType = modelType;
    }
    
    public String toString()
    {
        return super.toString() + "\nModel type: " + modelType;
    }
}
