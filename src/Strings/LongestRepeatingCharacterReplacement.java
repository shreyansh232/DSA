package Strings;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int maxLen = 0, maxFreq = 0;
        int left = 0;
        int[] count = new int[26];
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            int window = right - left + 1;
            if (window - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABB";
        int k = 2;
        System.out.println(characterReplacement(s, k));

    }
}
