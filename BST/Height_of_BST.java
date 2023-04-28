package BST;

public class Height_of_BST 
{
    public static void main(String[] args) 
    {
        MyBST bst = new MyBST();
        
        bst.add(50);
        bst.add(40);
        bst.add(60);
        bst.add(20);
        bst.add(70);
        bst.add(80);
        bst.add(35);
        bst.add(45);
        bst.add(55);
        
        System.out.println("-- HEIGHT --");
        int height = height(bst.root);
        System.out.println(height);
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
