package arreglos.practice;


import java.util.*;

/**
 *  347. Top K Frequent Elements
 *
 *  Given an integer array nums and an integer k, return the k most frequent elements.
 *  You may return the answer in any order.
 *
 *  Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 * */
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int key = 2;

        int[] result = solution(nums, key);

        for(int i:result)
            System.out.printf("%s ", i);
    }
    private static int[] solution(int[] nums, int k){
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
            else if (num < min)
                min = num;
        }

        int[] frequencies = new int[max - min + 1];
        for (int num : nums) {
            frequencies[num - min]++;
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < frequencies.length; i++) {
            int num = i + min;
            int frequency = frequencies[i];
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }

        int[] result = new int[k];
        for (int i = buckets.length - 1; k > 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    k -= 1;
                    result[k] = num;
                    if (k == 0) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
