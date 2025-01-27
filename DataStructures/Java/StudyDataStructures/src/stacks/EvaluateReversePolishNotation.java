package stacks;

import java.util.Stack;

/**
 * 150. Evaluate Reverse Polish Notation
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 *
 * Evaluate the expression. Return an integer that represents the value of the expression.
 *
 * Note that:
 *
 * The valid operators are '+', '-', '*', and '/'.
 * Each operand may be an integer or another expression.
 * The division between two integers always truncates toward zero.
 * There will not be any division by zero.
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.
 *
 * Example 1:
 *
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * Example 2:
 *
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * Example 3:
 *
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {

        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(solution2(tokens));

    }

    private static int solution(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        int right, left;
        for (String d: tokens) {
            switch (d){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    right = stack.pop();
                    left = stack.pop();
                    stack.push(left - right);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    right = stack.pop();
                    left = stack.pop();
                    stack.push(left / right);
                    break;
                default:
                    stack.push(Integer.parseInt(d));
            }
        }
        return stack.pop();
    }

    private static int solution2(String[] tokens){
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens){
            if ( token.matches("[+-/*]") )
                stack.push(mathHelper(token, stack.pop(), stack.pop()));
            else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }

    private static int mathHelper(String operator, int right, int left){
        return switch (operator) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            case "/" -> left / right;
            default -> 0;
        };
    }
}
