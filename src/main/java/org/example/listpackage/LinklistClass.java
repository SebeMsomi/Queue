package org.example.listpackage;

public class LinklistClass {
    private String[] arr;
    private int size;
    private int top1, top2;

    // Constructor
    public LinklistClass(int n)
    {
        size = n;
        arr = new String[n];
        top1 = -1;
        top2 = n;
    }

    // Function to insert a given element into the first stack
    public void push1(String key)
    {
        // check if the array is full
        if (top1 + 1 >= top2)
        {
            System.out.println("Stack Overflow");
            System.exit(-1);
        }
        top1++;
        arr[top1] = key;
    }

    // Function to insert a given element into the second stack
    public void push2(String key)
    {
        // check if the array is full
        if (top1 + 1 == top2)
        {
            System.out.println("Stack Overflow");
            System.exit(-1);
        }

        top2--;
        arr[top2] = key;
    }

    // Function to pop an element from the first stack
    public String pop1()
    {
        // if no elements are left in the array
        if (top1 < 0)
        {
            System.out.println("Stack UnderFlow");
            System.exit(-1);
        }

        String top = arr[top1];
        top1--;
        return top;
    }

    // Function to pop an element from the second stack
    public String pop2()
    {
        // if no elements are left in the array
        if (top2 >= size)
        {
            System.out.println("Stack UnderFlow");
            System.exit(-1);
        }
        String top = arr[top2];
        top2++;
        return top;
    }
}
