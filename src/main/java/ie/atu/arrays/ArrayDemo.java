package ie.atu.arrays;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(100);
       list.add(200);
       list.add(300);

       for(Integer i : list)
       {
           System.out.println("The value is " + i);
       }
    }
}
