package Tree.practice;

public class MyFirstTreeMain {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.insert(2);
        root.insert(7);
        root.insert(1);
        root.insert(3);
        root.insert(6);
        root.insert(9);
        root.printBFS();
    }
}
