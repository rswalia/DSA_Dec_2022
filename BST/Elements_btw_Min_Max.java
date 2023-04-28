package BST;

public class Elements_btw_Min_Max 
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
        filter(bst.root, 30, 50);
    }
    
    static void filter(TNode t, int min, int max)
    {
        if(t==null)
        {
            
        }
        else
        {
            filter(t.left, min, max);
            
            if(t.val>=min && t.val<=max)
                System.out.print(t.val+" ");
            
            filter(t.right, min, max);
        }
    }   
}