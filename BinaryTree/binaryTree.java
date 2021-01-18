public class binaryTree{
    Node root;
    static int idx=0;
    private class Node{
        private int data;
        private Node left;
        private Node right;
        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public binaryTree(int []arr){
        root=construct(arr);
    }
    public Node construct(int []arr){
        if(idx>=arr.length || arr[idx]==-1) {
            idx++;
            return null;
        }
        Node node=new Node(arr[idx],null,null);
        idx++;
        node.left=construct(arr);
        node.right=construct(arr);
        return node;
    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null) return;
        String ans=(node.left!=null?Integer.toString(node.left.data):".");
        ans+="->"+Integer.toString(node.data)+"<-";
        ans+=(node.right!=null?Integer.toString(node.right.data):".");
        System.out.println(ans);
        display(node.left);
        display(node.right);

    }
    public int size(){
        return size(root);
    }
    private int size(Node node){
        if(node==null) return 0;
        return size(node.left)+size(node.right)+1;
    }
}