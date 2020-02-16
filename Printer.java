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
public class Printer extends HomeAppliance
{
    protected int dotsPerInch;
    protected boolean paperLoaded;
    protected boolean inkLoaded;
    
    public Printer(String manufacturer, double price, double weight, String room, int dotsPerInch, boolean paperLoaded, boolean inkLoaded)
    {
        super(manufacturer, price, weight, room);
        this.dotsPerInch = dotsPerInch;
        this.paperLoaded = paperLoaded;
        this.inkLoaded = inkLoaded;
    }
    
    public boolean printerStatus()
    {
        if (paperLoaded && inkLoaded == true)
            return true;
        else
            return false;
    }
    
    public void loadPaper(boolean status)
    {
        if (status == true)
            System.out.print("Loading paper...");
        else
            System.out.print("Paper already loaded");
    }
    
    public void loadInk(boolean status)
    {
        
        if (status == true)
            System.out.print("Loading ink...");
        else
            System.out.print("Ink already loaded");
    }
            
    public String room()
    {
        return room;
    }
    
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
