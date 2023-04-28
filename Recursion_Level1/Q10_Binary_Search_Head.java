package Recursion_Level1;

public class Q10_Binary_Search_Head
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int num = 6;
        System.out.println(binarySearch(a, num, 0, a.length-1));
    }
    
    static boolean binarySearch(int a[], int num, int L, int U)
    {
        int M = (L+U)/2;
        
        if(L > U)               // Base Case 1
        {
            return false;
        }
        else if(num == a[M])    // Base Case 2
        {
            return true;
        }
        else
        {
            if(num < a[M])
            {
                U = M-1;
                return binarySearch(a, num, L, U);  // answer in Tail, only forward to Head without any calculations...
            }
            else if(num > a[M])
            {
                L = M+1;
                return binarySearch(a, num, L, U);
            }
        }
        return false;
    }
}