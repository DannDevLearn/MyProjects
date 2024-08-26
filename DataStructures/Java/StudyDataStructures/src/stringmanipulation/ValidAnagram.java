package stringmanipulation;

/**
 *  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *  Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * */

public class ValidAnagram {

    private static boolean solution(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] char_counts = new int[26];
        for(int i=0; i<s.length(); i++){
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }

        for( int count: char_counts)
            if (count != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(solution(s,t));
    }
}
