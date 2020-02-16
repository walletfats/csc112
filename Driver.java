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
public class Driver
{
    public static void main(String[] args)
    {
        IPod bar = new IPod("apple", 100, 5, "double a", "iphone 2", 4);
        CellPhone f = new CellPhone("apple", 5, 5, "222", true, "AA");

        System.out.print(f);
        System.out.println(bar);
    }
}
