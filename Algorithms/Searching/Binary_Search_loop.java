package Algorithms.Searching;

public class Binary_Search_loop 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};   // sorted array in Binary Search
        int num = 6;
        binarySearch(a,num);
    }
    
    static void binarySearch(int a[], int num)
    {
        int l=0, u=a.length-1, M = 0;
        boolean found = false;
        
        while(l<=u)
        {
            M = (l+u)/2;
            if(num==a[M])
            {
                found = true;
                break;
            }
            else if(num < a[M])
            {
                u = M-1;
            }
            else if(num > a[M])
            {
                l = M+1;
            }
        }
        
        if(found)
            System.out.println("Index = "+ M);
        else
            System.out.println("*** Not Found ***");
    }
}