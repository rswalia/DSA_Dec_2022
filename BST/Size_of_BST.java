package BST;

public class Size_of_BST 
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
        
        System.out.println("-- SIZE --");
        int size = size(bst.root);
        System.out.println(size);
    }
    
    static int size(TNode t)
    {
        if(t==null)
        {
            return 0;
        }
        else
        {
            return 1 + size(t.left) + size(t.right);
        }
    }
}
