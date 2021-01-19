public class client{
    public static void main(String[] args){
        int []arr={10,20,40,80,-1,-1,90,-1,-1,50,-1,100,-1,-1,30,60,-1,110,-1,-1,70,-1,120,-1,-1};
        binaryTree bt=new binaryTree(arr);
        // bt.display();
        // System.out.println("Size: "+bt.size());
        // System.out.println("Max: "+bt.maximum());
        // System.out.println("Min: "+bt.minimum());
        // System.out.println("Height: "+bt.height());
        // bt.inOrder();
        // System.out.println();
        // bt.postOrder();
        // System.out.println();
        // bt.preOrder();
        // System.out.println();
        // System.out.println("data is present in tree: "+bt.find(0));
        // bt.rootToNodePath(110);
        // System.out.println();
        // long t1=System.currentTimeMillis();
        // bt.lca01(120,110);
        // long t2=System.currentTimeMillis();
        // bt.lca02(120,110);
        // long t3=System.currentTimeMillis();
        // System.out.println(t2-t1);
        // System.out.println(t3-t2);
        // bt.leafNodes();
        // bt.levelOrder();
        // bt.levelOrder01();
        bt.levelOrder02();
        
    }
}