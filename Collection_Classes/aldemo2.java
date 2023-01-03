package Collection_Classes;

import java.util.*;

public class aldemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> al = new ArrayList<>();
        
        System.out.println("Start entering numbers....");
        int n;
        
        while(true)
        {
            n = sc.nextInt();
            
            if(n == 0)
            {
                break;
            }
            else
            {
                al.add(n);
            }
        }

//        Collections.sort(al, Collections.reverseOrder()); //Descending
        System.out.println(al);
    }
}