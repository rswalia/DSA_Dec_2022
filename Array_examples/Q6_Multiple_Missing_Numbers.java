package Array_examples;

public class Q6_Multiple_Missing_Numbers 
{
    public static void main(String[] args) 
    {
        int a[] = {2,8,7,1,5,6,4,9,7,1};
        missingNumbers(a);
    }
    
    static void missingNumbers(int a[])
    {
        int l = a.length;
        boolean b[] = new boolean[l+1];
        
//        for(int i=0; i<l; i++)
//        {
//            b[a[i]] = true;
//        }
        
        for(int p : a)
        {
            b[p] = true;
        }
        
        for(int i=1; i<l+1; i++)
        {
            if(b[i]==false)
            {
                System.out.print(i+" ");
            }
        }
    }
}