package stacks.monotonic;

import java.util.Stack;

/**
 *  Dada la estatura de 5 personas en un arreglo, encontrar la estatura de las siguientes personas
 *  devolver un arreglo.
 *  Si no exiten personas mas altas, almacenar un -1
 *
 *  Input = [2,1,2,4,3]
 *  Output = [4,2,4,-1,-1]
 * */
public class MonotonicStack {
    public static void main(String[] args) {

        int[] persons = {2,1,2,4,3};
        int[] res = solution(persons);

        for (int i:res)
            System.out.printf("%s ", i);
    }

    private static int[] solution(int[] persons){
        // Solution with Time Complex = O(n)
        // Space complex = O(n)
        int len = persons.length;
        int[] result = new int[len];

        Stack<Integer> stack = new Stack<>();

        for ( int i=len-1; i>=0; i-- ){
            while(!stack.isEmpty() && persons[i]>=stack.peek())
                stack.pop();
            if (stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.push(persons[i]);
        }

        return result;
    }

}
