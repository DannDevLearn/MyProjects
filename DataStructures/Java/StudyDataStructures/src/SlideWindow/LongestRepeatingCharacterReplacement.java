package SlideWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 424. Longest Repeating Character Replacement
 *
 * You are given a string s and an integer k. You can choose any character of the string and change
 * it to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing
 * the above operations.
 *
 * Example 1:
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 *
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 * There may exist other ways to achieve this answer too.
 * */
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

        String str = "AABABBA";
        int k = 1;
        System.out.println(solution2(str, k));

    }

    private static int solution(String s, int k){
        int[] charCount=new int[26];
        int start=0;
        int end=0;
        int tempmax=0;
        int max=0;

        while(end<s.length()){
            tempmax=Math.max(tempmax,++charCount[s.charAt(end)-'A']);
            while(end-start+1-tempmax-k>0){
                charCount[s.charAt(start)-'A']--;
                start++;
            }
            max=Math.max(max,end-start+1);
            end++;
        }
        return max;
    }

    private static int solution2(String s, int k){
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLen = 0;
        int maxCountRepeating = 0;

        for (int end=0; end < s.length(); end++){
            char rightChar = s.charAt(end);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxCountRepeating = Math.max(maxCountRepeating, map.get(rightChar));

            if ( end-start+1-maxCountRepeating > k ){
                char leftChar = s.charAt(start);
                map.put(leftChar, map.get(leftChar)-1);
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}



/*
                            e
    A   A   B   A   B   B   A
                s

  Map = [A->1,B->3]
  k = 1
  maxCount = 3
  maxLen = 4

*/