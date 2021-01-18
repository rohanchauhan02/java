public class client{
    public static void main(String[] args){
        int []arr={1,2,3,-1,-1,4,-1,-1,5,6,-1,-1,7,-1,-1};
        binaryTree bt=new binaryTree(arr);
        bt.display();
        System.out.println("Size: "+bt.size());
    }
}