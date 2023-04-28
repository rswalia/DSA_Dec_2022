package extras;

import java.util.Scanner;

public class Scanner_error 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int rollno;
        String name;
        int marks;
        
        System.out.println("Enter rollno");
        rollno = sc.nextInt();
        
        System.out.println("Enter name");
        sc.nextLine();          // this input will be skipped
        name = sc.nextLine();
        
        System.out.println("Enter marks");
        marks = sc.nextInt();
        
        System.out.println("Rollno = "+ rollno);
        System.out.println("Name = "+ name);
        System.out.println("Marks = "+ marks);
    }
}