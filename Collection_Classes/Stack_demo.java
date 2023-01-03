package Collection_Classes;

import java.util.*;

public class Stack_demo {
    public static void main(String[] args) 
    {
        // LIFO
        Stack<Integer> st = new Stack<>();
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        System.out.println("Element on top = "+ st.peek());
        
        while(!st.isEmpty())
        {
            System.out.println(st.pop());
        }
        
    }
}