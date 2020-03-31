/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author jasonsteiger
 */
public interface StackInterface 
{
    public void push(int element);
    public int pop();
    public int peek();
    public boolean isEmpty();
    public int size();
}
