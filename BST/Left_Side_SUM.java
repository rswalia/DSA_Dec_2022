package BST;

public class Left_Side_SUM 
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
        
        System.out.println("-- LEFT SIDE SUM --");
        int sum = leftSUM(bst.root);
        System.out.println("\nSUM = "+sum);
    }
    
    static int leftSUM(TNode t)
    {
        int sum[] = {0};
        inorder(t.left, sum);
        return sum[0];
    }
    
    static void inorder(TNode t, int sum[])
    {
        if(t==null)
        {
            
        }
        else
        {
            inorder(t.left, sum);
            
            System.out.print(t.val+" ");
            sum[0] = sum[0] + t.val;
            
            inorder(t.right, sum);
        }
    }
}