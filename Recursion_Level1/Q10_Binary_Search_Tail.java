package Recursion_Level1;

public class Q10_Binary_Search_Tail
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int num = 10;
        binarySearch(a,num,0,a.length-1);
    }
    
    static void binarySearch(int a[], int num, int L, int U)
    {
        int M = (L+U)/2;
        
        if(L > U)               // Base Case 1
        {
            System.out.println("*** Not Found ***");
        }
        else if(num == a[M])    // Base Case 2
        {
            System.out.println("Index = "+ M);
        }
        else
        {
            if(num < a[M])
            {
                U = M-1;
                binarySearch(a, num, L, U);
            }
            else
            {
                L = M+1;
                binarySearch(a, num, L, U);
            }
        }
    }
}