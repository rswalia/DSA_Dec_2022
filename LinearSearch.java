public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int a[] = {7,6,1,3,4};
        int key = 4;
        int i, j, n=a.length;
        boolean found = false;
        
        for(i=0; i<n; i++)
        {
            if(a[i] == key)
            {
                found = true;
                break;
            }
        }
        
        if(found)
        {
            System.out.println("Index = "+ i);
        }
        else
        {
            System.out.println("not found");
        }
    }
}