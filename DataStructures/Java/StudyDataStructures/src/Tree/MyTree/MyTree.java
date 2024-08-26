package Tree.MyTree;

/**
 *  En este ejemplo de arbol sera de manera rapida para entender su funcionamiento
 *  por lo tanto solo tendremos lo basico para su uso lo que el node y sus hijos a la izauierda
 *   y a la derecha.
 * */
public class MyTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(9); // Tenemos nuestra raizahora crearemos otros nodos para enlzarlos
        TreeNode left1 = new TreeNode(7);
        TreeNode right1 = new TreeNode(5);

        // Ya que tenemos los nodos ahora los enlazamos
        root.left = left1;
        root.right = right1;

        // Con este arbol basico tenemos algo como
        /*
        *           Root
        *          /     \
        *      left1      right1
        * */

        // Mostrando los valores
        System.out.println(root.value);
        System.out.println(root.left.value);
        System.out.println(root.right.value);
        // y podemos agregar un valor mar de lado
        TreeNode last = new TreeNode(100);
        // Se hara el camino largo para demostracion

        root.left.left = last;

        //Con lo anterior tenemos algo parecido a los siguiente
        /*
        *           Root
        *          /    \
        *       left1   right1
        *       /
        *     last
        * */

        // En esto debe ser iterado pero para demostracion vamos a hacerlo manual
        TreeNode lastValue = root.left.left;
        System.out.println(lastValue.value);
        System.out.println(root.right.right);

    }
    static class TreeNode{

        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
        }

    }

}
