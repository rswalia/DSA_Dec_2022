package LinkedList_Examples;

public class Print_LinkedList 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        
        ll.makeList();
        
        printList(ll.start);
    }
    
    static void printList(Node t)
    {
        while(t != null)
        {
            System.out.print(t.val+" --> ");
            t = t.next;
        }
    }
}