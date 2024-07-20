package Strings;

import java.util.*;

public class LongestSubstringNonRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }

        }
        return max;

    }

    public static void main(String[] args) {
        String s = "ssstew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
