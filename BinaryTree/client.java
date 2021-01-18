public class client{
    public static void main(String[] args){
        int []arr={10,20,40,80,-1,-1,90,-1,-1,50,-1,100,-1,-1,30,60,-1,110,-1,-1,70,-1,120,-1,-1};
        binaryTree bt=new binaryTree(arr);
        // bt.display();
        // System.out.println("Size: "+bt.size());
        // System.out.println("Max: "+bt.maximum());
        // System.out.println("Min: "+bt.minimum());
        // System.out.println("Height: "+bt.height());
        // System.out.println("data is present in tree: "+bt.find(0));
        bt.rootToNodePath(110);
        System.out.println();
        bt.lca01(120,110);
    }
}