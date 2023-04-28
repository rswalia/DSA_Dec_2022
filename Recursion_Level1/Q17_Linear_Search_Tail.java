package Recursion_Level1;

public class Q17_Linear_Search_Tail 
{
    public static void main(String[] args) 
    {
        int a[] = {10,20,30,40,50};
        int num = 50;
        linearSearch(a, num, 0);
    }
    
    static void linearSearch(int a[], int num, int i)
    {
        if(i==a.length)     // Base Case 1
            System.out.println("Not Found");
        else if(a[i]==num)  // Base Case 2
            System.out.println("Index = "+ i);
        else
            linearSearch(a, num, i+1);
    }
}