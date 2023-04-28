package LinkedList_Examples;

import java.util.*;

public class Union_of_Two_Lists 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
//        ll.printList();
        
//        System.out.println();
        
        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(20);
        ll2.add(40);
        ll2.add(60);
        ll2.add(80);
        ll2.add(100);
//        ll2.printList();
        
//        findUnion(ll.start, ll2.start);
        
///*
        Node un = findUnion(ll.start, ll2.start);
        Node t = un;
        while(t!=null)
        {
            System.out.print(t.val+" ");
            t = t.next;
        }
//*/
    }
    
    static Node findUnion(Node start1, Node start2)
    {
        Set<Integer> ts = new TreeSet<>();
        
        // copy elements from 1st list to ts
        Node t1 = start1;
        while(t1!=null)
        {
            ts.add(t1.val);
            t1 = t1.next;
        }
        
        // copy elements from 2nd list to ts
        Node t2  = start2;
        while(t2!=null)
        {
            ts.add(t2.val);
            t2 = t2.next;
        }
        
//        System.out.println(ts);
        
        Node start3 = null;
        
        for(int p : ts)
        {
            Node nd = new Node(p);
            
            if(start3 == null)      // add as First node
            {
                start3 = nd;
            }
            else                    // add more nodes
            {
                Node t = start3;
                while(t.next != null)
                    t = t.next;
                
                t.next = nd;
            }
        }
        
        return start3;
    }
}