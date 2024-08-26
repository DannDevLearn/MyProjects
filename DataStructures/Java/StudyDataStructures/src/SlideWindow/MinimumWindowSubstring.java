package SlideWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 * Given two strings s and t of lengths m and n respectively, return the minimum window
 * substring
 *  of s such that every character in t (including duplicates) is included in the window.
 *  If there is no such substring, return the empty string "".
 * The testcases will be generated such that the answer is unique.
 * Example 1:
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * Example 3:
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 * */
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(solution(s,t));
    }

    private static String solution(String s, String t){
        if (s.length() < t.length()) return "";
        String ans = "";

        Map<Character, Integer> mapT = new HashMap<>();     // freq map for string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int match = 0;
        int desiredMatch = t.length();

        Map<Character, Integer> mapS = new HashMap<>();     // freq map for string s
        int i = -1, j = -1;

        while (true) {
            boolean loop1 = false, loop2 = false;

            // acquire
            while (i < s.length() - 1 && match < desiredMatch) {
                i++;
                char c = s.charAt(i);
                mapS.put(c, mapS.getOrDefault(c, 0) + 1);

                if (mapS.getOrDefault(c, 0) <= mapT.getOrDefault(c, 0)) {
                    match++;
                }

                loop1 = true;
            }

            // collect answers and release
            while (j < i && match == desiredMatch) {
                int potAns = i - j;     // potential answer length

                if (ans.isEmpty() || potAns < ans.length()) {
                    ans = s.substring(j + 1, i + 1);
                }

                j++;
                char c = s.charAt(j);

                if (mapS.get(c) == 1) mapS.remove(c);
                else mapS.put(c, mapS.get(c) - 1);

                if (mapS.getOrDefault(c, 0) < mapT.getOrDefault(c, 0)) {
                    match--;
                }

            }

            if (!loop1) break;
        }

        return ans;
    }
}
