package LinkedList_Examples;

public class Check_LinkedList_Is_Palindrome_Leetcode 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        
        ll.add(1);
        ll.add(3);
        ll.add(3);
        ll.add(1);
        
        System.out.println(isPalindrome(ll.start));
    }
    
    public static boolean isPalindrome(Node start) 
    {
        Node start2 = reverse(start);
        
        return isEqual(start, start2);
        
//        if(isEqual(start, start2))  // original == reverse
//        {
//            return true;    // isPalindrome
//        }
//        else
//        {
//            return false;
//        }
    }
    
    public static Node reverse(Node start)
    {
        Node start2 = null;
        Node t = start;
        
        while(t!=null)
        {
            // USE t.val;
            Node nd = new Node(t.val);
            nd.next = start2;
            start2 = nd;
            
            t = t.next;
        }
        
        return start2;
    }
    
    public static boolean isEqual(Node start1, Node start2)
    {
//        Node t1 = start1;
//        Node t2 = start2;
//        boolean flag = true;
        
        if(size(start1) != size(start2))
            return false;
        else
        {
            Node t1 = start1;
            Node t2 = start2;
            boolean flag = true;
            
            while(t1!=null && t2!=null)
            {
                if(t1.val == t2.val)
                {
                    t1 = t1.next;
                    t2 = t2.next;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            
            return flag;
        }
        
//        return flag;
    }
    
    public static int size(Node start)
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