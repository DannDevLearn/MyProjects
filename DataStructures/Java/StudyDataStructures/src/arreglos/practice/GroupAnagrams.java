package arreglos.practice;

import java.util.*;

/**
 * Medium LeetCode
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 * */
public class GroupAnagrams {

    private static List<List<String>> solution(String[] strs){
        Map<String, List<String>> map = new HashMap<>();

        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if (!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList<>());
            map.get(sortedString).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words ={"eat","tea","tan","ate","nat","bat"};

        System.out.println(solution(words));
    }
}
