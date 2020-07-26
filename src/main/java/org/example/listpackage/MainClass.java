package org.example.listpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MainClass {
    public static void main(String[] args)
    {

        List<String> list1 = Arrays.asList("jan", "feb", "mar", "apr", "may");
        List<String> list2 = Arrays.asList("jun", "jul", "aug", "sep", "oct","Nov");

        LinklistClass stack = new LinklistClass(list1.size() + list2.size());
        for(int i = 0; i<list1.size(); i--) {
            for (String k : list1) {
                stack.push1(k);
             //   System.out.println("stack : " + k);
            }
            System.out.println("Popping element from the first stack : " + stack.pop1());

        }
        for(int i = 0; i<list2.size(); i++){
            for(String j : list2){
                stack.push2(j);
              //  System.out.println("stack : " + j);
            }
            System.out.println("Popping element from the first stack on push2 method : " + stack.pop2());
}
        System.out.println(list1.size() + list2.size());
    }
}
