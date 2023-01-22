package Recursion_Level1;

public class practice 
{
    public static void main(String[] args) 
    {
//        fun1(3);
//        fun2(3);
//        fun3(3);
//        fun4(1);
//        fun5(5,0);
//        System.out.println(fun6(5));
//          fun7(5,1);
//        System.out.println(fun8(5));
        
        int a[] = {5,3,6,7,8,9,67,54,32,43};
        int num = 67;
        linearSearch(a,num);
    }
    
    static void fun1(int n)
    {
        if(n==0)
        {
            
        }
        else
        {
            System.out.print(n+" ");
            fun1(n-1);
        }
    }
    
    static void fun2(int n)
    {
        if(n==0)
        {
            
        }
        else
        {
            fun2(n-1);
            System.out.print(n+" ");
        }
    }
    
    static void fun3(int n)
    {
        if(n==0)
        {
            System.out.print("Stop ");
        }
        else
        {
            System.out.print(n+" ");
            fun3(n-1);
            System.out.print(n+" ");
        }
    }
    
    static void fun4(int n)
    {
        if(n==3)
        {
            System.out.print("Stop ");
        }
        else
        {
            System.out.print(n+" ");
            fun4(n+1);
        }
    }
    
    static void fun5(int n, int sum)
    {
        if(n==1)
        {
            sum = sum + n;
            System.out.println(sum);
        }
        else
        {
            fun5(n-1, sum+n);
        }
    }
    
    static int fun6(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+fun6(n-1);
        }
    }
    
    static void fun7(int n, int prod)
    {
        if(n==1)
        {
            prod = prod * n;
            System.out.println(prod);
        }
        else
        {
            fun7(n-1, prod*n);
        }
    }
    
    static int fun8(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*fun8(n-1);
        }
    }

    static void fun9(int n, int small)
    {
        if(n==0)
        {
            System.out.println(small);
        }
        else
        {
            int r = n%10;
            if(small>r)
                small=r;
            fun9(n/10, small);
        }
    }

    static void linearSearch(int[] a, int num)
    {
        int i;
        boolean found = false;
        
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