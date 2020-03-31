package stack;

/**
 *
 * @author jasonsteiger
 */
public class StackADT<T> implements StackInterface
{
    private final int ARRAY_CAP = 5;
    private int stack[];
    private int top;
    
    public StackADT()
    {
        top = 0;
        stack = new int[ARRAY_CAP];
        
    }
    
    @Override
    public void push(int element) 
    {
        if(top == stack.length)
        {
            increaseSize();
            System.out.println("Stack is full bitch");
        }
        stack[top] = element;
        top++;
    }
    
    private void increaseSize()
    {
        int temp[] = new int[top * 2];
        int index = 0;
        
        for(int item : stack)
        {
            temp[index] = item;
            index++;
        }
        
        stack = temp;
    }
    
    @Override
    public int pop() 
    {
        int temp = 0;
        
        if(!isEmpty())
        {
            top--;
            temp = stack[top];
        }
        
        return temp;
    }

    @Override
    public int peek() 
    {
        int value = 0;
        
        if(!isEmpty())
            value = stack[top-1];
        else
            /* should throw an exception 
            *  so the calling code knows the stack is empty
            */
            System.out.println("Stack is empty");
        
        return value;
    }

    @Override
    public boolean isEmpty() 
    {
        boolean result = false;
        
        if(top == 0)
            result = true;
        
        return result;
    }

    @Override
    public int size() 
    {
        return top;
    }
    
}
