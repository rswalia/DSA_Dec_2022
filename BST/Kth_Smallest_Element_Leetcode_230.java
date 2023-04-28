package BST;

import java.util.ArrayList;

public class Kth_Smallest_Element_Leetcode_230 
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
        
        int small = kthSmallest(bst.root, 3);
        System.out.println("\n3rd Smallest = "+ small);
    }
    
    static int kthSmallest(TNode t, int k) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        inorder(t, al);
        
        return al.get(k-1);
    }
    
    static void inorder(TNode t, ArrayList<Integer> al)
    {
        if(t==null)
        {
            
        }
        else
        {
            inorder(t.left, al);
            
//            System.out.print(t.val+" ");
            al.add(t.val);
            
            inorder(t.right, al);
        }
    }
}