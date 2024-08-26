package stacks;

import java.util.Stack;

/**
 *   84. Largest Rectangle in Histogram
 *   Given an array of integers heights representing the histogram's
 *   bar height where the width of each bar is 1, return the area of the
 *   largest rectangle in the histogram.
 *   Input: heights = [2,1,5,6,2,3]
 *   Output: 10
 *   Explanation: The above is a histogram where width of each bar is 1.
 *   The largest rectangle is shown in the red area, which has an area = 10 units.
 * */
public class LargestRectangleInHistogram {
    public static void main(String[] args) {

        int[] heights = {2,1,5,6,2,3};
        System.out.println(solution(heights));

    }

    private static int solution(int[] heights){
        Stack<Integer> stk = new Stack<>();
        int max = 0;
        for(int i = 0; i <= heights.length; i++){
            while(!stk.empty() && (i == heights.length || heights[stk.peek()] >= heights[i])){
                int idx = stk.pop();
                int left = stk.empty() ? 0: stk.peek() + 1;
                max = Math.max(max, heights[idx]*(i-1 - left + 1));
            }
            stk.push(i);
        }
        return max;
    }
}
