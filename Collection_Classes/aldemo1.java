package Collection_Classes;

import java.util.*;

public class aldemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        
//        al.remove(1);

        al.set(1,200);
        
        System.out.println(al);
        System.out.println("Size = "+ al.size());
    }
}
