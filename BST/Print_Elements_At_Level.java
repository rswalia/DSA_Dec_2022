package BST;

public class Print_Elements_At_Level 
{
    public static void main(String[] args) 
    {
        MyBST bst = new MyBST();
        
        bst.add(50);
        bst.add(40);
        bst.add(60);
        bst.add(30);
        bst.add(80);
        bst.add(65);
        bst.add(45);
        bst.add(55);
        
        System.out.println("-- LEVEL 2 --");
        printElementAt(bst.root, 2);
    }
    
    static void printElementAt(TNode t, int level)
    {
        printElementAt(t, level, 0);
    }
    
    static void printElementAt(TNode t, int level, int i)
    {
        if(t==null)
        {
            
        }
        else
        {
            printElementAt(t.left, level, i+1);
            
            if(i==level)
                System.out.print(t.val+" ");
            
            printElementAt(t.right, level, i+1);
        }
    }
}