package BST;

public class Insert_Node_GFG 
{
    public static void main(String[] args) 
    {
        MyBST bst = new MyBST();
        
        bst.add(2);
        bst.add(1);
        bst.add(3);
        
        insert(bst.root, 4);
    }
    
    static TNode insert(TNode t, int v) 
    {
        TNode nd = new TNode(v);
        
        while(true)
        {
            if(v < t.val)       // Go Left
            {
                if(t.left==null)
                {
                    t.left = nd;
                    break;
                }
                else
                {
                    t = t.left;
                }
            }
            else if(v > t.val)  // Go Right
            {
                if(t.right==null)
                {
                    t.right = nd;
                    break;
                }
                else
                {
                    t = t.right;
                }
            }
            else                // Found
            {
                break;
            }
        }
        
        return nd;
    }
}