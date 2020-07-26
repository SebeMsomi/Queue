package org.example;

import java.util.Stack;

public class QueueMain {
    public static void main( String[] args )
    {
        QueueClass list = new QueueClass();
       list.enqueue("Red");
       list.enqueue("Green");
       list.enqueue("Blue");

        list.dequeue();
        list.enqueue("Yellow");
        list.enqueue("Pink");
        list.enqueue("maroon");
        list.dequeue();
        list.isEmpty();
        list.size();
        list.front();

        for(int i = 0; i<list.size(); i++){
            System.out.println("The list is: " + list.size() + " "  +list.isEmpty()+ " "+
                    list.dequeue());
        }

    }

}
