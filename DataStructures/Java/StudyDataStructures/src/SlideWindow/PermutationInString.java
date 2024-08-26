package SlideWindow;

import java.util.Arrays;

/**
 * 567. Permutation in String
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return is true if one of s1's permutations is the substring of s2.
 Example 1:
 Input: s1 = "ab", s2 = "eidbaooo"
 Output: true
 Explanation: s2 contains one permutation of s1 ("ba").
 Example 2:
 Input: s1 = "ab", s2 = "eidboaoo"
 Output: false
 * */
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(solution(s1, s2));
    }

    private static boolean solution(String s1, String s2){
        if (s1.length() > s2.length()) return false;
        int s1Len = s1.length();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i=0; i<s1Len; i++){
            arr1[s1.charAt(i)-'a'] += 1;
            arr2[s2.charAt(i)-'a'] += 1;
        }

        for (int i=s1Len; i<s2.length(); i++){
            if (Arrays.equals(arr1, arr2))
                return true;
            arr2[s2.charAt(i-s1Len) - 'a'] -= 1;
            arr2[s2.charAt(i)-'a'] += 1;
        }

        return Arrays.equals(arr1,arr2);
    }
}
