package BST;

public class Search_in_BST_Leetcode_700 
{
    public static void main(String[] args) 
    {
        MyBST bst = new MyBST();
        
        bst.add(4);
        bst.add(2);
        bst.add(7);
        bst.add(1);
        bst.add(3);
        
        searchBST(bst.root, 2);
    }
    
    static TNode searchBST(TNode t, int v) 
    {
        if(t==null)
        {
            
        }
        while(true)
        {
            if(v < t.val)       // Go Left
            {
                t = t.left;
            }
            else if(v > t.val)  // Go Right
            {
                t = t.right;
            }
            else                // Found
            {
                TNode nd = new TNode(v);
                return nd;
            }
        }
    }
}