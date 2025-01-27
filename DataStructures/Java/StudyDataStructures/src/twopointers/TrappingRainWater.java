package twopointers;
/**
 * 42. Trapping Rain Water
 * Given n non-negative integers representing an elevation map where the width of each bar
 * is 1, compute how much water it can trap after raining.
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In
 * this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * */
public class TrappingRainWater {
    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution(height));

    }

    private static int solution(int[] height){
        int left = 0,
            right = height.length-1;
        int leftMax = height[left],
             rightMax = height[right];
        int result = 0;

        while (left < right){

            if (leftMax < rightMax){
                left += 1;
                leftMax = Math.max(leftMax,height[left]);
                result += leftMax - height[left];
            }else{
                right -= 1;
                rightMax = Math.max(rightMax, height[right]);
                result += rightMax - height[right];
            }
        }
        return result;
    }
}
