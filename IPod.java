package electronics;

/**
 * IPod class which allows other CellPhone to have a capacity and
 * modelType. Parent and child class.
 *
 * @author jason
 * @version 1.1.1.1.1
 */
public class IPod extends PortableElectronics
{
    protected int capacity;
    protected String modelType;

    /**
    * Constructor for IPod, inherits some of its attributes from
    * PortableElectronics. Adds modelType and capacity for the other classes
    * down the tree.
    *
    * @param manufacturer String company which produced the Ipod.
    * @param price double the price of the Ipod.
    * @param weight double the weight of the Ipod.
    * @param batteryType String the batteries of the Ipod.
    * @param modelType String model of the Ipod.
    * @param capacity int the amount of storage the Ipod has.
    *
    */
    IPod(String manufacturer, double price, double weight, String batteryType, String modelType, int capacity)
    {
        super(manufacturer, price, weight, batteryType);
        this.modelType = modelType;
        this.capacity = capacity;
    }

    /**
    * This method returns the batteryType of the Ipod.
    *
    * @return String battery type of Ipod.
    */
    public String batteryType()
    {
        return batteryType;
    }

    /**
    * This method is a setter for the capacity of the Ipod.
    *
    */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    /**
    * This method is a setter for the model type of the Ipod.
    *
    */
    public void setModelType(String modelType)
    {
        this.modelType = modelType;
    }

   /**
   * This method returns a formatted string to use for output.
   *
   * @return String the formatted string for output.
   *
   */
    public String toString()
    {
        return super.toString() + "\nModel type: " + modelType;
    }
}
