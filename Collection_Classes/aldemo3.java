package Collection_Classes;

import java.util.*;

public class aldemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> al = new ArrayList<>();
        
        System.out.println("Start entering names....");
        String s;
        
        while(true)
        {
            s = sc.nextLine();
            
            if(s.equals("")) 
            {
                break;
            } 
            else 
            {
                al.add(s);
            }
        }
        
        System.out.println(al);
    }
}
