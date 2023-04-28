package LinkedList_Examples;

import java.util.LinkedList;

public class Testing_MyLinkedList 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        LinkedList ll2 = new LinkedList();
        
//        ll.makeList();
        
        ll.add(15);
        ll.add(30);
        ll.add(45);
        ll.add(60);
        
        System.out.println("SIZE OF LIST = "+ ll.size());
        
        System.out.println("INDEX OF 45 = "+ ll.indexOf(45));
        
//        ll.clear();
        
        ll.printList();
        
        System.out.println("\n\n-----------ADD FIRST--------------");
        ll.addFirst(100);
        ll.printList();
        
        System.out.println("\nELEMENT AT INDEX 1 = "+ ll.getElementAt(1));
        
        System.out.println("\n-----------UPDATE(45,200)--------------");
        ll.update(45, 200);
        ll.printList();
        
        System.out.println("\n\n----------------RECURSION--------------------------");
        ll.printRec(ll.start);
        
        System.out.println("\n\n----------------REVERSE-------------------------");
        ll.clear();
        ll.makeList();
        ll.printList();
        System.out.println();
        
        
        System.out.println("\n\n----------------MINIMUM-------------------------");
        ll.clear();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(4);
        
        ll.printList();
        System.out.println("\nMINIMUM ELEMENT = "+ ll.findMinimum());
        
        System.out.println("\n\n----------------DELETE NODE-------------------------");
        ll.clear();
        
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printList(); 
        
        ll.delete(3);
        
        System.out.println();
        ll.printList();
        System.out.println();
    }
}