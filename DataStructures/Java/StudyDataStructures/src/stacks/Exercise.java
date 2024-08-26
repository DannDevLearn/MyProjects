package stacks;

import java.util.Stack;

/**
 * Write a function that uses a stack to reverse a string
 * Input s = "abcde"
 * Output = "edcba"
 * */
public class Exercise {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray())
            stack.push(c);

        while (!stack.isEmpty())
            sb.append(stack.pop());

        return sb.toString();
    }
}
