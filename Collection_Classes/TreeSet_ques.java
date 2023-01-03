package Collection_Classes;

import java.util.TreeSet;
import java.util.Scanner;

public class TreeSet_ques 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> ts = new TreeSet<>();
        
        int n;
        
        System.out.println("Start entering numbers....");
        while(true)
        {
            n = sc.nextInt();
            
            if(n == 0)
            {
                break;
            }
            ts.add(n);
        }
        
        System.out.println(ts);//automatic arrange


//        TreeSet<String> ts = new TreeSet<>();
//        String s;
//        
//        System.out.println("Start entering names....");
//        while(true)
//        {
//            s = sc.nextLine();
//            
//            if(s.equals(""))
//            {
//                break;
//            }
//            ts.add(s);
//        }
//        
//        System.out.println(ts);//automatic arrange
    }
}