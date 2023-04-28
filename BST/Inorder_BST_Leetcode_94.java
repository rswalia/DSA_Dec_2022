package BST;

import java.util.*;

public class Inorder_BST_Leetcode_94 
{
    public static void main(String[] args) 
    {
        MyBST bst = new MyBST();
        
        bst.add(50);
        bst.add(40);
        bst.add(60);
        
        List<Integer> al = new ArrayList<>();
        
        al = inorderTraversal(bst.root);
        
        System.out.println(al);
    }
    
    static List<Integer> inorderTraversal(TNode t) 
    {
        List<Integer> al = new ArrayList<>();
        inorder(t, al);
        return al;
    }
    
    static void inorder(TNode t, List<Integer> al)
    {
        if(t==null)
        {
            
        }
        else
        {
            inorder(t.left, al);
            
            al.add(t.val);
            
            inorder(t.right, al);
        }
    }
}