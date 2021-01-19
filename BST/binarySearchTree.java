import java.util.Arrays;
public class binarySearchTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static Node create(int []arr,int si,int li){
        if(si>li) return null;
        if(si==li){
            Node node= new Node(arr[si],null,null);
            return node;
        }

        int mid=(si+li)>>1;
        Node node=new Node(arr[mid],null,null);
        node.left=create(arr,si,mid);
        node.right=create(arr,mid+1,li);
        return node;

    }
    public static void display(Node node){
        if(node==null) return;
        String ans=(node.left!=null?Integer.toString(node.left.data):".");
        ans+="->"+Integer.toString(node.data)+"<-";
        ans+=(node.right!=null?Integer.toString(node.right.data):".");
        System.out.println(ans);
        display(node.left);
        display(node.right);

    }
    public static int maximum(Node node){
        if(node==null) return -1;
        if(node.right==null) return node.data;
        return maximum(node.right);
    }
    public static int minimum(Node node){
        if(node==null) return -1;
        return node.left==null?node.data:minimum(node.left);
    }
    public static boolean find(Node node,int data){
        if(node==null) return false;
        if(node.data==data) return true;
        else return node.data>data?find(node.left,data):find(node.right,data);
    }
    public static void rootToNodePath(Node node,int data,String ans){
        if(node==null){
            System.out.println("Not found");
            return;
        }
        ans+=Integer.toString(node.data)+" ";
        if(node.data==data){
            System.out.println(ans);
            return;
        }
        if(node.data>data) rootToNodePath(node.left,data,ans);
        else rootToNodePath(node.right,data,ans);
        
    }

    public static void main(String []args){
        int []arr={10,20,30,40,50,60,70,80,90,100,120,130,140};
        Arrays.sort(arr);
        Node root=create(arr,0,arr.length-1);
        // display(root);
        // System.out.println(maximum(root));
        // System.out.println(minimum(root));
        System.out.println(find(root,130));
        rootToNodePath(root,14,"");
    }
    
    
}
