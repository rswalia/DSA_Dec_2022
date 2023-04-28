package BST;

public class Range_Sum_BST_Leetcode_938 
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
        
        System.out.println("-- MIN & MAX --");
        int sum = rangeSumBST(bst.root, 35, 50);
        System.out.println(sum);
    }
    
    static int rangeSumBST(TNode t, int min, int max) 
    {
        int sum[] = {0};
        inorder(t, min, max, sum);
        return sum[0];
    }
    
    static void inorder(TNode t, int min, int max, int sum[])
    {
        if(t==null)
        {
            
        }
        else
        {
            inorder(t.left, min, max, sum);
            
            sum[0] = sum[0] + t.val;
            
            inorder(t.right, min, max, sum);
        }
    }
}