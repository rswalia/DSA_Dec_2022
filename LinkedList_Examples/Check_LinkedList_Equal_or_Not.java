package LinkedList_Examples;

public class Check_LinkedList_Equal_or_Not 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        MyLinkedList ll2 = new MyLinkedList();
        
        ll.add(10);
        ll.add(220);
        ll.add(30);
        
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        
        System.out.println(equals(ll.start, ll2.start));
    }
    
    static boolean equals(Node start1, Node start2)
    {
        Node t1 = start1;
        Node t2 = start2;
        boolean same = true;
        
        if(size(start1) != size(start2))
            return false;
        else
        {
            while(t1!=null && t2!=null)
            {
                if(t1.val == t2.val)
                {
                    t1 = t1.next;
                    t2 = t2.next;
                }
                else
                {
                    same = false;
                    break;
                }
            }
            
        }
            return same;
    }
    
    static int size(Node start)
    {
        Node t = start;
        int count = 0;
        
        while(t!=null)
        {
            count++;
            t = t.next;
        }
        
        return count;
    }
}