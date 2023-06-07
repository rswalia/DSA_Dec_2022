package Matrix;

public class basic 
{
    public static void main(String[] args) 
    {
        //declaration
//        int a[][] = new int[3][3];
        int a[][] = {{1,2,3}, {4,5,6,2,3}, {7,8,9}};
        
//        System.out.println(a.length);
//        System.out.println(a[0].length);
//        System.out.println(a[1].length);
//        System.out.println(a[2].length);
        
        //printing
        int i,j;
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}