/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author jasonsteiger
 */
public class NoLowerCase extends Exception
{
    private String msg;
    
    public NoLowerCase(String msg)
    {
        super(msg);
    }
}
