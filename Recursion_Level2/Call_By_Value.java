package Recursion_Level2;

public class Call_By_Value
{
    public static void main(String[] args)
    {
        int a = 10;
        change(a);
        System.out.println(a);
    }
    static void change(int p)
    {
        p = 20;
    }
}
// changes made in FORMAL ARGUMENTS are not reflected in ACTUAL ARGUMENTS...