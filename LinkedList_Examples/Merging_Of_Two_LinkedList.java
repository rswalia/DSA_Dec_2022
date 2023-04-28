package LinkedList_Examples;

public class Merging_Of_Two_LinkedList 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll1 = new MyLinkedList();
        MyLinkedList ll2 = new MyLinkedList();
        
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        
        ll2.add(40);
        ll2.add(50);
        ll2.add(60);
        
        Node start3 = merge(ll1.start, ll2.start);
        
        Node t = start3;
        
        while(t != null)
        {
            System.out.print(t.val+" --> ");
            t = t.next;
        }
    }
    
    static Node merge(Node start1, Node start2)
    {
        Node t = start1;
        
        while(t.next != null)
        {
            t = t.next;
        }
        
        t.next = start2;
        
        return start1;
    }
    
    static Node merge2(Node start1, Node start2)
    {
        Node t = start1;
        
        while(t.next != null)
        {
            t = t.next;
        }
        
        t.next = start2;
        
        return start1;
    }
}