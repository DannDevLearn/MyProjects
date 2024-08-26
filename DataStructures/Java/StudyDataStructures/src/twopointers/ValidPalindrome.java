package twopointers;

/**
 * 125. Valid Palindrome
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
 * all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters
 * include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 * */
public class ValidPalindrome {
    public static void main(String[] args) {
        String word = "A man, a plan, a canal: Panama";
        System.out.println(solution2(word));
    }
    private static boolean solution(String s){
        if (s.length() == 1 || s.isEmpty()) return true;

        s = s.replaceAll("[\\W_+]", "").toLowerCase();

        int l=0, r=s.length() - 1;

        while(l < r){
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    private static boolean solution2(String s){
        if (s.length() == 1 || s.isEmpty()) return true;

        StringBuilder sb = new StringBuilder();

        for (char letter : s.toCharArray())
            if (Character.isLetterOrDigit(letter))
                sb.append(letter);

        s = sb.toString().toLowerCase();
        int start = 0,
            end = s.length() -1;

        while (start < end){
            if (s.charAt(start) != s.charAt(end))
                return false;
            start += 1;
            end -= 1;
        }

        return true;
    }
}
