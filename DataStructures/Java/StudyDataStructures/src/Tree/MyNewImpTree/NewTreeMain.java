package Tree.MyNewImpTree;

public class NewTreeMain {
    public static void main(String[] args) {

        NewTreeNode root = new NewTreeNode(9);
        root.insert(7);
        root.insert(16);
        root.insert(8);
        root.insert(4);
        root.insert(10);
        root.insert(27);

        System.out.println("---------- DFS InOrder ----------");
        root.printDFSInOrder();
        System.out.println("\n---------- DFS PreOrder ----------");
        root.printDFSPreOrder();
        root.remove(16);
        System.out.println("\n---------- DFS PostOrder ----------");
        root.printDFSPostOrder();
        System.out.println("\n-----------  BFS  -----------------");
        root.printBFS();

    }
}
