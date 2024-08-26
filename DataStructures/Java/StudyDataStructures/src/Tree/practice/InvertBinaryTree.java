package Tree.practice;

/**
 *  226. Invert Binary Tree
 *  Given the root of a binary tree, invert the tree, and return its root.
 * */
public class    InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.insert(2);
        root.insert(7);
        root.insert(1);
        root.insert(3);
        root.insert(6);
        root.insert(9);
        root.printBFS();
        TreeNode result = solution(root);
        System.out.println(" ");
        result.printBFS();
    }

    private static TreeNode solution(TreeNode root){
        if(root == null)
            return null;
        TreeNode aux = root.left;
        root.left = root.right;
        root.right = aux;
        solution(root.left);
        solution(root.right);
        return root;
    }

}
