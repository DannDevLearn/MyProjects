package arreglos.practice;

import java.util.HashSet;
import java.util.Set;

/**
 *  128 Longest Consecutive Sequence
 *  Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore, its length is 4.
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * */

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] arr = {100,4,200,1,2,3};
        System.out.println(solution(arr));
    }
    private static int solution(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        int longestSequence = 0;

        for (int num : nums) {
            int currentSequence = 1;
            if (!set.contains(num - 1)) {
                while (set.contains(num + 1)) {
                    num++;
                    currentSequence++;
                }
            }
            longestSequence = Math.max(longestSequence, currentSequence);
        }
        return longestSequence;
    }
}
