package SlideWindow;

public class SmallestSubArrayWithGivenSum {

    private static int solution(int targetSum, int[] nums){

        int curSum = 0;
        int minWindowSize = Integer.MAX_VALUE;

        for (int end=0, start=0; end<nums.length; end++){
            curSum += nums[end];

            for ( ; curSum >= targetSum; start++ ){
                minWindowSize = Math.min(minWindowSize, end - start +1);
                curSum -= nums[start];
            }
        }
        return minWindowSize;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,2,7,8,1,2,8,10};
        int targetSum = 8;
        System.out.println(solution(targetSum, nums));
    }
}
