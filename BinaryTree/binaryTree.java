import java.util.ArrayList;
import java.util.LinkedList;
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
    public int maximum(){
        return maximum(root);
    }
    private int maximum(Node node){
        if(node==null) return Integer.MIN_VALUE;
        int lm=maximum(node.left);
        int rm=maximum(node.right);
        return Math.max(node.data,Math.max(lm,rm));
    }
    public int minimum(){
        return minimum(root);
    }
    private int minimum(Node node){
        if(node==null) return Integer.MAX_VALUE;
        int lm=minimum(node.left);
        int rm=minimum(node.right);
        return Math.min(node.data,Math.min(lm,rm));
    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node==null) return 0;
        int lh=height(node.left);
        int rh=height(node.right);
        return Math.min(lh,rh)+1;
    }
    public boolean find(int data){
        return find(root,data);
    }
    private boolean find(Node node, int data){
        if(node==null) return false;
        if(node.data==data) return true;
        return find(node.left,data)|| find(node.right,data);
    }
    public void rootToNodePath(int data){
        ArrayList<Node>ans=rootToNodePath(root, data);
        for(Node node: ans){
            System.out.print(node.data+"->");
        }

    }
    private ArrayList<Node> rootToNodePath(Node node,int data){
        if(node==null) return null;
        if(node.data==data){
            ArrayList<Node>base=new ArrayList<>();
            base.add(node);
            return base;
        }
        ArrayList<Node>ls=rootToNodePath(node.left,data);
        if(ls!=null){
            ls.add(node);
            return ls;
        }
        ArrayList<Node>rs=rootToNodePath(node.right,data);
        if(rs!=null){
            rs.add(node);
            return rs;
        }
        return null;

    }
    public void lca01(int data1,int data2){
        System.out.println("LCA: "+lca01(root,data1,data2).data);
    }
    private Node lca01(Node node,int data1,int data2){
        ArrayList<Node>ls=rootToNodePath(node,data1);
        ArrayList<Node>rs=rootToNodePath(node, data2);
        if(ls==null || rs==null) return null;
        Node ans=null;
        int i=0,j=0;
        while(i<ls.size() && j<rs.size()){
            if(ls.get(i).data==rs.get(j).data){
                ans=ls.get(i);
                break;
            }
            i++;
            j++;
        }
        return ans;
    }
    Node lca=null;
    public void lca02(int data1,int data2){
        System.out.println(lca02(root,data1,data2));
    }
    private boolean lca02(Node node,int data1,int data2){
        if(node==null) return false;

        boolean selfDone=
        boolean ls=lca02(node.left, data1, data2);
        boolean rs=lca02(node.right, data1, data2);


        return ls||rs||selfDone;
    }
}