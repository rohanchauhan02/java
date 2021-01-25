public class client{
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        // ll.display();
        ll.addFirst(5);
        ll.addFirst(1);
        ll.display();
        // // System.out.println(ll.getFirst());
        // // System.out.println(ll.getAt(6));
        // ll.addAt(3,99);
        // ll.display();
        // System.out.println(ll.removeFirst());
        // ll.display();
        // System.out.println(ll.size());
        // ll.removeLast();
        // ll.display();
        // System.out.println(ll.removeAt(0));
        // ll.display();
        // System.out.println(ll.size());
        // ll.reverseOrder01();
        // ll.reverseDataOrder();
        // ll.display();
        ll.reverseRecursion();
        ll.display();
        // ll.reverseDataRecursively();
        // ll.display();

        
    }
}