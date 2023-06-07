public class demo 
{
    public static void main(String[] args) 
    {
        int m = 2;
        int n = 5;
        
//        addTail(n, 0);
//        System.out.println(addHead(n));
//        factTail(n, 1);
//        System.out.println(factHead(n));
//        powerTail(m, n, 1);
//        System.out.println(powerHead(m, n));
        System.out.println(powerLoop(m, n));
    }
    
    static void addTail(int n, int sum)
    {
        if(n==1)
        {
            sum = sum + n;
            System.out.println(sum);
        }
        else
        {
            addTail(n-1, sum+n);
        }
    }
    
    static int addHead(int n)
    {
        if(n==1)
            return 1;
        else
            return n+addHead(n-1);
    }
    
    static void factTail(int n, int prod)
    {
        if(n==1)
        {
            prod = prod * n;
            System.out.println(prod);
        }
        else
        {
            factTail(n-1, prod*n);
        }
    }
    
    static int factHead(int n)
    {
        if(n==1)
            return 1;
        else
            return n*factHead(n-1);
    }
    
    static void powerTail(int m, int n, int prod)
    {
        if(n==1)
        {
            prod = prod * m;
            System.out.println(prod);
        }
        else
        {
            powerTail(m, n-1, prod*m);
        }
    }
    
    static int powerHead(int m, int n)
    {
        if(n==1)
            return m;
        else
            return powerHead(m, n-1)*m;
    }
    
    static int powerLoop(int m, int n)
    {
        int prod = 1;
        
        for(int i=1; i<=n; i++)
        {
            prod = prod * m;
        }
        
        return prod;
    }
}