package LinkedList_Examples;

import java.util.*;

public class Merging_of_Two_Sorted_Lists 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(20);
        ll.add(4);
        
        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(1);
        ll2.add(3);
        ll2.add(4);
        
//        ll2.add(0);
        
//        mergeTwoLists(ll.start, ll2.start);
        
//        /*
        Node mg = mergeTwoLists(ll.start, ll2.start);
        Node t =mg;
        while(t!=null)
        {
            System.out.print(t.val+" ");
            t = t.next;
        }
//        */
    }
    
    static Node mergeTwoLists(Node start1, Node start2) 
    {
        Node start3 = null;
        
        ArrayList<Integer> al = new ArrayList<>();
        
        Node t1 = start1;
        Node t2 = start2;
        
        while(t1!=null)
        {
            al.add(t1.val);
            t1 = t1.next;
        }
        
        while(t2!=null)
        {
            al.add(t2.val);
            t2 = t2.next;
        }
        
        Collections.sort(al);
        
        for(int i=0; i<al.size(); i++)
        {
            if(isEmpty(start3))     // add First Node
            {
                Node nd = new Node(al.get(i));
                start3 = nd;
            }
            
            else                         // add more Nodes
            {
                Node t = start3;
                while(t.next != null)
                {
                    t = t.next;
                }
                
                Node nd = new Node(al.get(i));
                
                t.next = nd;
            }
        }
        
//        System.out.println(al);
        
        return start3;
    }
    
    static boolean isEmpty(Node start)
    {
        if(start == null)
            return true;
        else
            return false;
    }
    
    static Node mergeTwoLists2(Node start1, Node start2)
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        // copy elements from 1st list to al
        Node t1 = start1;
        while(t1!=null)
        {
            al.add(t1.val);
            t1 = t1.next;
        }
        
        // copy elements from 2nd list to al
        Node t2 = start2;
        while(t2!=null)
        {
            al.add(t2.val);
            t2 = t2.next;
        }
        
        Collections.sort(al);
        
        Node start3 = null;
        
        for(int p : al)     // Enhanced for loop
        { 
            Node nd = new Node(p);
            
            if(start3==null)    // add as First node
            {
                start3 = nd;
            }
            else                // add more nodes
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