package Recursion_Level1;

//import java.util.Arrays;

public class Sum_of_Elements_of_Array_Tail 
{
    public static void main(String[] args)
    {
        ////////////// Using Loops //////////////////
        /*
        int a[] = {10,20,30,40,50};
        System.out.println(Arrays.toString(a));
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);
        */
        //////////////////////////////////////////
        ////////////// Using Recursion //////////////////
        int a[] = {10,20,30,40,50};
        
        fun(a,4,0);
    }
    
    static void fun(int[] a, int i, int sum)
    {
        if(i==0)
        {
            sum = sum + a[i];
            System.out.println(sum);
        }
        else
        {
            fun(a, i-1, sum+a[i]);
        }
    }
}