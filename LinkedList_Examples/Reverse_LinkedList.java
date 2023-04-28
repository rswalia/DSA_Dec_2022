package LinkedList_Examples;

public class Reverse_LinkedList 
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
        
        Node rev = reverseList(ll.start);
        // print reverse list
        Node t = rev;
        
        while(t != null)
        {
            System.out.print(t.val+" --> ");
            t = t.next;
        }
    }
    
    public static Node reverseList(Node start) 
    {
        Node start2 = null;
        Node t = start;
        
        while(t != null)
        {
            // Create a new Node and add as First element
            Node nd = new Node(t.val);
            nd.next = start2;
            start2 = nd;
            
            t = t.next;
        }
        
        return start2;
    }
}