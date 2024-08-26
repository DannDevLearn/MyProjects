package Tree.practice;

public class AnotherExampleTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(17);
        root.insert(20);
        root.insert(26);
        root.insert(9);
        root.insert(7);
        root.insert(8);
        root.insert(12);
        root.insert(4);
        root.insert(1);
        root.insert(25);
        root.insert(97);

        System.out.println("-----In order Asc------");
        root.printInOrderAsc(root);
        System.out.println("\n------ DFS InOrder -------");
        root.printInOrder(root);
        System.out.println("\n------- DFS PreOrder -------");
        root.printPreOrder(root);
        System.out.println("\n------ DFS PostOrder --------");
        root.printPostOrder(root);

        root.remove(root, 7);
        System.out.println("\n-----In order Asc------");
        root.printPostOrder(root);


    }
}
