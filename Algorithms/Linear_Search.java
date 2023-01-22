package Algorithms;

public class Linear_Search 
{
    public static void main(String[] args) 
    {
        int a[] = {5,3,6,7,8,9,67,54,32,43};
        int num = 32;
        linearSearch(a,num);
    }
    
    static void linearSearch(int a[], int num)
    {
        boolean found = false;
        int i;
        
        for(i=0; i<a.length; i++)
        {
            if(a[i]==num)
            {
                found = true;
                break;
            }
        }
        
        if(found)
            System.out.println("Index = "+ i);
        else
            System.out.println("Not Found");
    }
}