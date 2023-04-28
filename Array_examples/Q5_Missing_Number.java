package Array_examples;

import java.util.Arrays;

public class Q5_Missing_Number 
{
    public static void main(String[] args) 
    {
        int a[] = {3,1,5,4};
        missingNumber(a);
    }
    
    static void missingNumber(int a[])
    {
        int n = a.length + 1;
        
        int expectedSum = n*(n+1)/2;
        
        int realSum = Arrays.stream(a).sum();
        
        System.out.println(expectedSum - realSum);
    }
}