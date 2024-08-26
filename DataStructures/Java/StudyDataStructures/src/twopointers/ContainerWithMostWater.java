package twopointers;

import java.text.BreakIterator;

/**
 * 11. Container Water
 *
 * You are given an integer array height of length n. There are n vertical lines drawn such that
 * the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case,
 * the max area of water (blue section) the container can contain is 49.
 * Example 2:
 *
 * Input: height = [1,1]
 * Output: 1
 * */
public class ContainerWithMostWater {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution2(height));

    }

    private static int solution(int[] height){
        int maxArea = 0;
        int left = 0,
            right = height.length-1;

        while (left < right){
            if ( height[left] < height[right] ){
                maxArea = Math.max(maxArea, height[left] * (right-left));
                left += 1;
            }else{
                maxArea = Math.max(maxArea, height[right] * (right-left));
                right -= 1;
            }
        }
        return maxArea;
    }

    private static int solution2(int[] height){
        int maxArea = 0;
        int left = 0,
            right = height.length-1;

        while (left < right){
            int curArea = (right - left) * Math.min(height[right], height[left]);
            maxArea = Math.max(maxArea, curArea);
            if ( height[left] < height[right] )
                left += 1;
            else
                right -= 1;
        }
        return maxArea;
    }
}
