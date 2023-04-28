package LinkedList_Examples;

import java.util.ArrayDeque;

public class Alternate_Nodes_LinkedList_JOSH_TECH 
{
    public static void main(String[] args) 
    {
       MyLinkedList ll1 = new MyLinkedList();
       
       ll1.add(10);
       ll1.add(20);
       ll1.add(30);
       ll1.add(40);
       ll1.add(50);
       ll1.add(60);
       
       Node start2 = alternate(ll1.start);
       
       // print LinkedList
       
        Node t = start2;
        
        while(t!=null)
        {
            System.out.print(t.val+"-->");
            t = t.next;
        }
    }
    
    static Node alternate(Node start)
    {
        Node start2 = null;
        
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        Node t = start;
        
        while(t!=null)
        {
            dq.add(t.val);
            t = t.next;
        }
        
//        System.out.println(dq);
        
        while(! dq.isEmpty())
        {
//            System.out.println(dq);
            
            int f = dq.removeFirst();   // 10
            
            addToList(start2, f);
            
            if(dq.isEmpty())
            {
                break;
            }
            
            int r = dq.removeLast();
            
            addToList(start2, r);
            
            if(dq.isEmpty())
            {
                break;
            }
        }
        
        return start2;
    }
    
    static void addToList(Node start2, int f)
    {
        Node nd = new Node(f);
        
        if(start2==null)           // add as first node
        {
            start2 = nd;
        }
        else                       // add more nodes
        {
            Node t2 = start2;
            
            while(t2.next!=null)
            {
                t2 = t2.next;
            }
                
            t2.next = nd;
        }
    }
}