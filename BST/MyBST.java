package BST;

public class MyBST 
{
    TNode root, t;
    
    void add(int v)
    {
        TNode nd = new TNode(v);
        if(root==null)
        {
            root = nd;
            System.out.println(v+" added as First node");
        }
        else
        {
            t = root;
            while(true)
            {
                if(v < t.val)       // Go Left
                {
                    if(t.left == null)
                    {
                        t.left = nd;
                        System.out.println(v+" added left to "+t.val);
                        break;
                    }
                    else
                    {
                        t = t.left;
                    }
                }
                else if(v > t.val)  // Go Right
                {
                    if(t.right == null)
                    {
                        t.right = nd;
                        System.out.println(v+" added right to "+t.val);
                        break;
                    }
                    else
                    {
                        t = t.right;
                    }
                }
                else
                {
                    System.out.println("Duplicate");
                    break;
                }
            }
        }
    }
    
    void inorder(TNode t)
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
    
    void preorder(TNode t)
    {
        if(t==null)
        {
            
        }
        else
        {
            System.out.print(t.val+" ");
            
            preorder(t.left);
            
            preorder(t.right);
            
        }
    }
    
    void postorder(TNode t)
    {
        if(t==null)
        {
            
        }
        else
        {
            postorder(t.left);
            
            postorder(t.right);
            
            System.out.print(t.val+" ");
        }
    }
    
    void leaves(TNode t)
    {
        if(t==null)
        {
            
        }
        else
        {
            leaves(t.left);
            
            if(t.left==null && t.right==null)
                System.out.print(t.val+" ");
            
            leaves(t.right);
        }
    }
    
    int size(TNode t)
    {
        int count[] = {0};
        inorderSize(t, count);
        return count[0];
    }
    
    void inorderSize(TNode t, int count[])
    {
        if(t==null)
        {
            
        }
        else
        {
            inorderSize(t.left, count);
            
            count[0]++;
            
            inorderSize(t.right, count);
        }
    }
}