package stacks.monotonic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Crear un monotonic stack decresiente
 *
 *  Input = [5,4,2,1]
 *  El siguiente numero a insertar es el numero 3
 *  Output = [5,4,3]
 * */
public class MonotonicStackDecreasing {
    public static void main(String[] args) {

        int[] before = {5, 4, 2, 1};
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i=before.length-1; i>=0; i--) {
            while (!stack.isEmpty() && stack.peek() <= 3) {
                stack.pop();
            }
            stack.push(before[i]);
        }
        while (!stack.isEmpty()){
            result.add(stack.peek());
            stack.pop();
        }
        result.add(3);
        System.out.println(result);
    }
}
