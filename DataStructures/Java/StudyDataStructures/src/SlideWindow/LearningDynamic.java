package SlideWindow;
/**
 * Given an array of N elements, what is the smallest subarray
 * size such that the sum of its elements is greater than or
 * equal to a constant S? Suppose
 * S = 15, and
 * arr = [5, 1, 3, 5, 10, 7, 4, 9, 2, 8].
 * */
public class LearningDynamic {
    public static void main(String[] args) {

        int[] nums = {5,1,3,5,10,7,4,9,2,8};
        int target = 15;
        System.out.println(solution(nums, target));

    }

    private static int solution(int[] nums, int target){
        int minSize = Integer.MAX_VALUE;
        int curSum = 0;
        
        for (int end = 0, start = 0; end < nums.length; end++){
            curSum += nums[end];
            for (; curSum >= target; start++){
                minSize = Math.min(minSize, (end - start + 1));
                curSum -= nums[start];
            }
        }
        return  minSize;
    }
}
