package Tree.practice;

public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int value){
        this.value = value;
    }

    public void insert(int value){
        if( value <= this.value ){
            if(left == null )
                left = new TreeNode(value);
            else
               left.insert(value);
        }else{
            if(right == null)
                right = new TreeNode(value);
            else
                right.insert(value);
        }
    }

    public TreeNode remove(TreeNode root, int value){
        if (root == null)
            return null;
        else if (value < root.value) {
            root.left = remove(root.left, value);
            return root;
        } else if (value > root.value) {
            root.right = remove(root.right, value);
            return root;
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else{
                root.right = lift(root.right, root);
                return root;
            }
        }
    }
    private TreeNode lift(TreeNode root, TreeNode nodeToRemove){
        if ( root.left == null ) {
            nodeToRemove.value = root.value;
            return root.right;
        }
        root.left = lift(root.left, nodeToRemove);
        return root;
    }

    public void printInOrderAsc(TreeNode root) {
        if (root == null) return;
        printInOrderAsc(root.left);
        System.out.printf("%s ", root.value);
        printInOrderAsc(root.right);
    }

    public void printInOrder(TreeNode root){
        if (root == null) return;
        printInOrder(root.left);
        System.out.printf("%s ", root.value);
        printInOrder(root.right);
    }

    public void printPreOrder(TreeNode root ){
        if (root == null) return;
        System.out.printf("%s ",root.value);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public void printPostOrder(TreeNode root){
        if (root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.printf("%s ", root.value);
    }

    public void printBFS(){
        int height = height(this);

        for(int i=1; i<=height; i++)
            printCurrentValue(this, i);
    }

    private int height(TreeNode root){
        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;

    }

    private void printCurrentValue(TreeNode root, int level){
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.value + " ");
        else if (level > 1){
            printCurrentValue(root.left, level - 1);
            printCurrentValue(root.right, level - 1);
        }
    }
}
