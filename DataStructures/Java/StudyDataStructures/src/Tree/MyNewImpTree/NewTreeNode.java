package Tree.MyNewImpTree;

import java.util.LinkedList;
import java.util.Queue;

public class NewTreeNode {

    private int value;
    private NewTreeNode left;
    private NewTreeNode right;

    public NewTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void insert(int value){
        if ( value <= this.value )
            if ( left == null )
                left = new NewTreeNode(value);
            else
                left.insert(value);
        else
            if (right == null)
                right = new NewTreeNode(value);
            else
                right.insert(value);
    }

    public void printDFSInOrder(){
        printDFSInOrder(this);
    }

    private static void printDFSInOrder(NewTreeNode root){
        if ( root == null ) return;
        printDFSInOrder(root.left);
        System.out.printf("%s ", root.value);
        printDFSInOrder(root.right);
    }

    public void printDFSPreOrder(){
        printDFSPreOrder(this);
    }

    private static void printDFSPreOrder(NewTreeNode root){
        if ( root == null ) return;
        System.out.printf("%s ", root.value);
        printDFSPreOrder(root.left);
        printDFSPreOrder(root.right);
    }

    public void printDFSPostOrder(){
        printDFSPostOrder(this);
    }

    private static void printDFSPostOrder(NewTreeNode root){
        if ( root == null ) return;
        printDFSPostOrder(root.left);
        printDFSPostOrder(root.right);
        System.out.printf("%s ", root.value);
    }

    public void remove(int value){
        this.remove(value, this);
    }

    private NewTreeNode remove(int value, NewTreeNode root) {
        if (root == null)
            return null;
        else if (value < root.value) {
            root.left = remove(value, root.left);
            return root;
        } else if (value > root.value) {
            root.right = remove(value, root.right);
            return root;
        } else {
            if ( root.left == null )
                return root.right;
            else if ( root.right == null )
                return root.left;
            else {
                root.right = lift(root.right, root);
                return root;
            }
        }
    }

    private NewTreeNode lift(NewTreeNode root, NewTreeNode nodeToRemove){
        if ( root.left == null ) {
            nodeToRemove.value = root.value;
            return root.right;
        }
        root.left = lift(root.left, nodeToRemove);
        return root;
    }

    public void printBFS(){
        printBFS(this);
    }

    private void printBFS(NewTreeNode root){
        if (root == null)
            return;

        Queue<NewTreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            NewTreeNode cur = q.poll();

            System.out.printf("%s ", cur.value);
            
            if (cur.left != null)
                q.offer(cur.left);

            if (cur.right != null)
                q.offer(cur.right);
        }

    }
}
