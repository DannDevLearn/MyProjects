package SlideWindow;

import java.util.HashSet;
import java.util.Set;

/**
 *  3. Longest Substring Without Repeating Characters
 *
 *  Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * */

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "pwwkew";
        System.out.println(solution(s));

    }

    private static int solution(String s){
        // My solution but Big O
        // Space O(n)
        // Time O(n)

        Set<Character> set = new HashSet<>();
        int max = 0;
        for (char i: s.toCharArray()){
            if(!set.add(i)){
                max = Math.max(set.size(), max);
                set.clear();
                set.add(i);
            }
        }
        return max;
    }
}
