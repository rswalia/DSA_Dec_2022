package LinkedList_Examples;

public class MyLinkedList
{
    Node start;
    Node t;
   
    // static List
    public void makeList()
    {
        // Create nodes
        Node nd1 = new Node(10);
        Node nd2 = new Node(20);
        Node nd3 = new Node(30);
        
        // Link all nodes
        start = nd1;
        nd1.next = nd2;
        nd2.next = nd3;
//        nd3.next = null;
    }
    
    // Dynamic List
    void add(int v)
    {
        if(isEmpty())
        {
            /* add as First node */
            Node nd = new Node(v);
            start = nd;
//            System.out.println(v+" added as First node");
        }
        else
        {
            /* add more nodes */
            
            // Traverse and reach last node
            t = start;
            while(t.next != null)
            {
                t = t.next;
            }
            
            // Create nodes
            Node nd = new Node(v);
            
            // Link t.next with nd
            t.next = nd;
            
//            System.out.println(v+" added to List");
        }
    }
    
    boolean isEmpty()
    {
        if(start == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    int size()
    {
        int count = 0;
        t = start;
        
        while(t!=null)
        {
            t = t.next;
            count++;
        }
        
        return count;
    }

    int indexOf(int k)
    {
        int i = 0;
        t = start;
        
        while(t!=null)
        {
            if(t.val == k)
            {
                return i;
            }
            else
            {
                t = t.next;
                i++;
            }
        }
        
        return -1;
    }
    
    void addFirst(int v)
    {
        Node nd = new Node(v);
        
        nd.next = start;
        start = nd;
    }
    
    void clear()
    {
        start = null;
    }
    
    int getElementAt(int index)
    {
        t = start;
        int i = 0;
        
        while(t != null)
        {
            if(i == index)
                return t.val;
            else
            {
                t = t.next;
                i++;
            }
        }
        
        return -1;
    }
    
    void update(int oldVal, int newVal)
    {
        t = start;
        
        while(t != null)
        {
            if(t.val == oldVal)
            {
                t.val = newVal;
            }
            else
            {
                t = t.next;
            }
        }
    }
    
    void printList()
    {
        t = start;
        System.out.print("start --> ");
        while(t!=null)
        {
            System.out.print(t.val+" --> ");
            t = t.next;
        }
        System.out.print("x");
    }

    void printRec(Node t)
    {
        if(t == null)
        {
            
        }
        else
        {
            printRec(t.next);   // Print Reverse Linked List
            System.out.print(t.val+ " --> ");
//            printRec(t.next);
        }
    }
      
    int findMinimum()
    {
        // Assume 1st element is small
        t = start;
        int small = t.val;
        
//        t = t.next;

        while(t != null)
        {
            if(t.val < small)
                small = t.val;
            t = t.next;
        }
        
        return small;
    }
    
    int findMinimum2()
    {
        int min = Integer.MAX_VALUE;
        t = start;
        
        while(t!=null)
        {
            if(t.val < min)
                min = t.val;
            t = t.next;
        }
        
        return min;
    }
    
    void delete(int v)
    {
        
    }
}