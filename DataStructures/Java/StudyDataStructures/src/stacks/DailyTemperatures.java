package stacks;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to wait
 * after the ith day to get a warmer temperature. If there is no future day for which
 * this is possible, keep answer[i] == 0 instead.
 *
 * Example 1:
 *
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * Example 2:
 *
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * Example 3:
 *
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 * */
public class DailyTemperatures {
    public static void main(String[] args) {

        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] result = solution(temperatures);

        for(int i:result)
            System.out.printf("%s ", i);

        for (int i=0, j=0; i<temperatures.length; i++){
            for (; temperatures[i]<1; j++)
                i++;
        }
    }

    private static int[] solution(int[] temperatures){
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int prev = stack.pop();
                answer[prev] = i-prev;
            }
            stack.push(i);
        }
        return answer;
    }
}
