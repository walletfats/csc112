/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackExample;

import stack.StackADT;

/**
 *
 * @author jasonsteiger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        StackADT myStack = new StackADT();
        
        myStack.push(5);
        myStack.push(16);
        myStack.push(5);
        myStack.push(16);
        myStack.push(5);
        myStack.push(16);
        myStack.pop();
        myStack.peek();
    }
    
}
