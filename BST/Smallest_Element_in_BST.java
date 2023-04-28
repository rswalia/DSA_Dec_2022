package BST;

public class Smallest_Element_in_BST 
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
        
        int min = minValue(bst.root);
        System.out.println("\nSMALLEST = "+ min);
    }
    
    static int minValue(TNode t) 
    {
        if(t==null)
        {
            return -1;
        }
        
        while(t.left != null)
        {
            t = t.left;
        }
        
        return t.val;
    }
}