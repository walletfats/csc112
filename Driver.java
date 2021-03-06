package electronics;

/**
 * Driver class for Electronics classes. Instantiates and calls each objects
 * methods.
 *
 * @author jason
 *
 */
public class Driver
{
    public static void main(String[] args)
    {
        IPod ipodTouch = new IPod("apple", 100, 5, "AA", "ipod 2", 4);
        CellPhone iphone = new CellPhone("apple", 5, 5, "222", true, "AA");
        AlarmClock loud = new AlarmClock("occ", 5, 3, "bedroom", "1:50PM", "1:51PM");
        Clock louder = new Clock("occ", 5, 3, "kitchen", "2:50PM");
        WallClock foo = new WallClock("unknown", 50, 8, "bathroom", "2:14PM");
        Printer print = new Printer("HP", 30, 5, "computer room", 900, true, true);

        System.out.println("IPod\n" + ipodTouch);         //Ipod
        System.out.print("\n\n");
        System.out.println("Cell phone\n" + iphone);      //cell phone
        System.out.print("\n\n");
        System.out.println("Alarm Clock\n" + loud);       //alarm clock
        System.out.print("\n\n");
        System.out.println("Clock\n" + louder);           //clock
        System.out.print("\n\n");
        System.out.println(foo);        //wall clock
        System.out.print("\n\n");
        System.out.println(print);      //printer
        System.out.print("\n\n");
    }
}
