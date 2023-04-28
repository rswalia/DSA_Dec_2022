package Recursion_Level2;

import java.util.Arrays;

public class Call_By_Reference
{
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40};
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int b[])
    {
        b[0] = 17;
    }
}
// changes made in FORMAL ARGUMENTS are Reflected in ACTUAL ARGUMENTS...