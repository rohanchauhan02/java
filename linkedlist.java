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
        if(size==0 || idx<0 || idx>size) throw new NullPointerException();
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public Node NodeAt(int idx){
        if(size==0 || idx<0 || idx>size) throw new NullPointerException();
        Node temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addAt(int idx,int data){
        if(size==0||idx>size || idx<0) throw new NullPointerException();
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
    public void removeLast(){
        if(size==0){
            System.out.println("list Not existed");
            throw new NullPointerException();
        }
        if(size==1){
            head=null;
            tail=null;
            System.out.println(head.val);
        }
        Node temp=tail;
        tail=NodeAt(size-2);
        tail.next=null;
        size--;
        System.out.println(temp.val);
    }
}