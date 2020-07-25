package org.example;
import java.util.Stack;
public class QueueClass {
    Stack<String> stack1 = new Stack();
    Stack<String> stack2 = new Stack();

    public void enqueue(String e)
    {
        stack1.push(e);
    }

    public String dequeue()
    {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public String front()
    {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty())
            {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public Boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size(){
        return stack1.size() + stack2.size();
    }

}
