package Algorithms;

public class Tower_Of_Hanoi 
{
    public static void main(String[] args) 
    {
        int n = 3;
        move(n, "A", "B", "C");
        System.out.println("Steps = "+count);
    }
    
    static int count = 0;
    
    static void move(int n, String src, String temp, String dest)
    {
        if(n==1)
        {
            System.out.println("Move Disk 1 from "+src+" to "+dest);
            count++;
        }
        else
        {
            move(n-1, src, dest, temp);
            
            System.out.println("Move Disk "+n+" from "+src+" to "+dest);
            count++;
            
            move(n-1, temp, src, dest);
        }
    }
}