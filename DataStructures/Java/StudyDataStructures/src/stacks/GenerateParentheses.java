package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 *
 * Se puede resolver usando un stack pero creo que no es muy necesario
 * */
public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    private static List<String> solution(int n){
        List<String> result = new ArrayList<>();
        backtracking(result, "",0,0, n);
        return result;
    }

    private static void backtracking(List<String> output, String currentStr, int open, int closed, int max){
        if ( currentStr.length() == max*2 ){
            output.add(currentStr);
            return;
        }
        if (open < max)
            backtracking(output, currentStr+"(", open+1, closed, max);
        if (closed < open)
            backtracking(output, currentStr+")", open, closed+1, max);
    }
}
