package BST;

public class Left_Side_of_BST 
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
        
        System.out.println("-- LEFT SIDE --");
        leftSide(bst.root);
    }
    
    static void leftSide(TNode t)
    {
        inorder(t.left);
    }
    
    static void inorder(TNode t)
    {
        if(t==null)
        {
            
        }
        else
        {
            inorder(t.left);
            
            System.out.print(t.val+" ");
            
            inorder(t.right);
        }
    }
}