package BST;

public class Testing_MyBST 
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
        
        bst.preorder(bst.root);System.out.println();
        bst.inorder(bst.root);System.out.println();
        bst.postorder(bst.root);
        
        System.out.println("\n-- LEAVES --");
        bst.leaves(bst.root);
        
        System.out.println("\n-- SIZE --");
        int size = bst.size(bst.root);
        System.out.println(size);
    }
}