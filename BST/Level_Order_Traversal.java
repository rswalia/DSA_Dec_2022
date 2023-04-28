package BST;

public class Level_Order_Traversal 
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
        
        for(int i=0; i<height(bst.root); i++)
        {
            printElementAt(bst.root, i);
            System.out.println("");
        }
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
    
    static int height(TNode t)
    {
        if(t==null)
        {
            return 0;
        }
        else
        {
            int left = 1 + height(t.left);
            int right = 1 + height(t.right);
            
            return Math.max(left, right);
        }
    }
}