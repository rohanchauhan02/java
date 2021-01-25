import java.lang.NullPointerException;
public class linkedlist{
    public class Node{
        int val;
        Node next; 
    }
    private Node head;
    private Node tail;
    private int size;
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public void addLast(int data){
        if(this.size==0){
            Node node=new Node();
            node.val=data;
            node.next=null;
            head=node;
            tail=node;
            size++;
        }else{
            Node node=new Node();
            node.val=data;
            node.next=null;
            tail.next=node;
            tail=node;
            size++;
        }
    }
    public void display(){
        if(size==0) throw new NullPointerException();
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        if(size==0){
            Node node=new Node();
            node.val=data;
            node.next=null;
            head=node;
            tail=node;
            size++;
        }else{
            Node node=new Node();
            node.val=data;
            node.next=head;
            head=node;
            size++;
        }
    }
    public int getFirst(){
        if(size==0) throw new NullPointerException();
        return head.val;
    }
    public int getLast(){
        if(size==0) throw new NullPointerException();
        return tail.val;
    }
    public int getAt(int idx){
        if(size==0 || idx<0 || idx>=size) throw new NullPointerException();
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public Node NodeAt(int idx){
        if(size==0 || idx<0 || idx>=size) throw new NullPointerException();
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addAt(int idx,int data){
        if(size==0||idx>=size || idx<0) throw new NullPointerException();
        Node node=new Node();
        node.val=data;
        Node temp1=NodeAt(idx-1);
        Node temp2=NodeAt(idx);
        temp1.next=node;
        node.next=temp2;
        size++;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("list Not existed");
            throw new NullPointerException();
        }
        if(size==1){
            head=null;
            tail=null;
            return head.val;
        }
        Node temp=head;
        head=head.next;
        size--;
        return temp.val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("list Not existed");
            throw new NullPointerException();
        }
        if(size==1){
            head=null;
            tail=null;
            return head.val;
        }
        Node temp=tail;
        tail=NodeAt(size-2);
        tail.next=null;
        size--;
        return temp.val;
    }
    public int removeAt(int idx){
        if(size==0 || idx>size ||idx<0) throw new NullPointerException();
        if(idx==0) return removeFirst();
        if(idx==size-1) return removeLast();
        int ans=NodeAt(idx).val;
        Node temp1=NodeAt(idx-1);
        temp1.next=NodeAt(idx+1);
        size--;
        return ans;
    }
    public void reverseOrder01(){
        recursivePrint(head);
        System.out.println();
    }
    private void recursivePrint(Node head){
        if(head==null) return;
        recursivePrint(head.next);
        System.out.print(head.val+"->");
    }
    public void reverseDataOrder(){
        int l=0;
        int r=size-1;
        while(l<r){
            Node left=NodeAt(l);
            Node right=NodeAt(r);
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
            l++;
            r--;
        }
    }
    public void reverseWithPointer(){
        Node pre=head,curr=head.next;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
    }
    //********** */
    public void reverseRecursion(){
        reverseRecursionHelper(head);
        Node temp=head;
        head=tail;
        tail=temp;
        tail.next=null;
    }
    public void reverseRecursionHelper(Node node){
        if(node==tail) return;
        reverseRecursionHelper(node.next);
        node.next.next=node;

    }
    private class HeapMover{
        Node node;
    }
    public void reverseDataRecursively(){
        HeapMover left=new HeapMover();
        left.node=head;
        reverseDatarecursion(left,head,0);
    }
    public void reverseDatarecursion(HeapMover left,Node right,int idx){
        if(right==null) return ;
        System.out.println(right.val);
        reverseDatarecursion(left, right.next, idx+1);
        if(idx>=size/2){
            int temp=right.val;
            right.val=left.node.val;
            left.node.val=temp;
            left.node=left.node.next;
        }
    }
    public void isPalindrome(){
        HeapMover left=new HeapMover();
        left.node=head;
        System.out.println(palindrome(left,head));
    }
    private boolean palindrome

}