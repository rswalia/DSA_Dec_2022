package LinkedList_Examples;

import java.util.Arrays;

public class Minimum_Element_In_List 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        
        ll.add(12);
        ll.add(23);
        ll.add(15);
        ll.add(10);
        
//        System.out.println("Minimum = "+ findMinimum(ll.start));
//        System.out.println("Minimum = "+ findMinimum2(ll.start));
        System.out.println("Minimum = "+ findMinimum3(ll.start));
    }
    
    static int findMinimum(Node start)
    {
        Node t = start;
        int min = Integer.MAX_VALUE;
        
        while(t!=null)
        {
            if(t.val < min)
                min = t.val;
            t = t.next;
        }
        
        return min;
    }
    
    static int findMinimum2(Node start)
    {
        Node t = start;
        int small = t.val; // 12
        
        while(t!=null)
        {
            if(t.val < small)
                small = t.val;
            t = t.next;
        }
        
        return small;
    }
    
    static int findMinimum3(Node start)
    {
        Node t = start;
        int a[] = new int[4];   // size()
        int i = 0;
        
        while(t!=null)
        {
            a[i] = t.val;
            i++;
            t = t.next;
        }
        
        Arrays.sort(a);
        
        return a[0];
    }
}