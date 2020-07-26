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
        list.isEmpty();
        list.size();
        list.front();
    }

}
