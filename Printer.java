package electronics;

/**
 * Printer inherits from HomeAppliance, showing a is a relationship.
 * Class contains data about a printer and its features.
 *
 * @author jason
 *
 */
public class Printer extends HomeAppliance
{
    protected int dotsPerInch;
    protected boolean paperLoaded;
    protected boolean inkLoaded;

    /**
    * Constructor for the Printer class, contains members of the parent class,
    * HomeAppliance.
    *
    * @param manufacturer String company which produced the printer.
    * @param price double price of the printer.
    * @param weight double weight of the printer.
    * @param room String room which the printer is in.
    */

    public Printer(String manufacturer, double price, double weight, String room, int dotsPerInch, boolean paperLoaded, boolean inkLoaded)
    {
        super(manufacturer, price, weight, room);
        this.dotsPerInch = dotsPerInch;
        this.paperLoaded = paperLoaded;
        this.inkLoaded = inkLoaded;
    }

    /**
    * Method which returns a boolean of whether the printer has its paper
    * and ink loaded.
    *
    * @return boolean true or false for the printer's status.
    */
    public boolean printerStatus()
    {
        if (paperLoaded && inkLoaded == true)
            return true;
        else
            return false;
    }

    /**
    * Method to load the paper in the printer and display it.
    *
    */
    public void loadPaper(boolean status)
    {
        if (status == true)
            System.out.print("Loading paper...");
        else
            System.out.print("Paper already loaded");
    }
    /**
    * Method which loads the ink in the printer and then displays if it has.
    *
    */
    public void loadInk(boolean status)
    {

        if (status == true)
            System.out.print("Loading ink...");
        else
            System.out.print("Ink already loaded");
    }

    /**
    * Method which returns the room that the printer is in.
    *
    * @return room String the room which the printer is in.
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
        String msg1;
        String msg2;

        if (paperLoaded == true)
            msg1 = "Printer has paper";
        else
            msg1 = "Printer has no paper";

        if (inkLoaded == true)
            msg2 = "Printer has ink";
        else
            msg2 = "Printer has no ink";

        return super.toString() + "\nDots per inch: " + dotsPerInch + "\n" + msg1
                + "\n" + msg2;
    }
}
