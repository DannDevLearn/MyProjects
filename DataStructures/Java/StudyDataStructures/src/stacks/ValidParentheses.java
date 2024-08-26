package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *  20. Valid Parentheses
 *
 *  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
 *  is valid.
 *
 * An input string is valid if:
 *
 *  1. Open brackets must be closed by the same type of brackets.
 *  2. Open brackets must be closed in the correct order.
 *  3. Every close bracket has a corresponding open bracket of the same type.
 *  Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 * */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(solution(s));
    }

    private static boolean solution(String s){ // This is my solution
        if ( s.length()%2 != 0 ) return false;

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        for (char ch : s.toCharArray()){
            if ( ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if( ch == ')' || ch == ']' || ch == '}' )
                if ( ch == map.get(stack.peek()) )
                    stack.pop();
        }
        return stack.isEmpty();
    }

    private static boolean solution2(String s){
        if ( s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if ( ch == '(' )
                stack.push(')');
            else if ( ch == '[' )
                stack.push(']');
            else if ( ch == '{' )
                stack.push('}');
            else if ( stack.isEmpty() || stack.pop() != ch )
                return false;
        }
        return stack.isEmpty();
    }
}
