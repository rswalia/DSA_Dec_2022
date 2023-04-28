package LinkedList_Examples;

import java.util.ArrayList;

public class Intersection_of_Two_Lists 
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
        
//        findIntersection(ll.start, ll2.start);
        
///*
        Node in = findIntersection(ll.start, ll2.start);
        Node t = in;
        while(t!=null)
        {
            System.out.print(t.val+" ");
            t = t.next;
        }
//*/
    }
    
    static Node findIntersection(Node start1, Node start2)
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        
        // copy elements from List1 to al1
        Node t1 = start1;
        while(t1!=null)
        {
            al1.add(t1.val);
            t1 = t1.next;
        }
        
        // copy elements from List2 to al2
        Node t2 = start2;
        while(t2!=null)
        {
            al2.add(t2.val);
            t2 = t2.next;
        }
        
        al1.retainAll(al2);
        
//        System.out.println(al1);
        
        Node start3 = null;
        
        // copy from al1 to new Node start3
        for(int p : al1)
        {
            Node nd = new Node(p);
            
            if(start3 == null)      // add as First node
            {
                start3 = nd;
            }
            else
            {
                Node t = start3;
                while(t.next != null)
                {
                    t = t.next;
                }
                
                t.next = nd;
            }
        }
        
        return start3;
    }
}