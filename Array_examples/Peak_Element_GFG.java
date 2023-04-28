package Array_examples;

public class Peak_Element_GFG 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3 };
        System.out.println(peakElement(a, a.length));
    }
   
    // return Index of peak element
    static int peakElement(int[] a,int n)
    {
        int flag = 0;
        
        for(int i=0; i<=n-2; i++)
        {
           if(a[i] > a[i+1])
           {
               flag = i;
               break;
           }
           else
           {
               flag = n-1;
           }
        }
        
        return flag;
    }
}