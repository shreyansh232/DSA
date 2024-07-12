package Strings;

public class MaxScoreSubstringRemoval {

        static char[] str;

        public static int maximumGain(String s, int x, int y) {
            int n = s.length();
            str = new char[n];
            for (int i = 0; i < n; i++) {
                str[i] = s.charAt(i);
            }
            String firstPair = (x > y) ? "ab" : "ba";
            String secondPair = (firstPair.equals("ab")) ? "ba" : "ab";
            int score = 0;
            score = removeSubstring(firstPair, Math.max(x, y));
            score += removeSubstring(secondPair, Math.min(x, y));
            return score;
        }

        public static int removeSubstring(String pair, int score) {
            int totalScore = 0;
            char firstTargetChar = pair.charAt(0);
            char secondTargetChar = pair.charAt(1);
            int writeIndex = 0;
            for (int readIndex = 0; readIndex < str.length; readIndex++) {
                str[writeIndex] = str[readIndex];
                writeIndex++;
                if (writeIndex > 1) {
                    char firstChar = str[writeIndex - 2];
                    char secondChar = str[writeIndex - 1];
                    if (firstTargetChar == firstChar && secondTargetChar == secondChar) {
                        writeIndex -= 2;
                        totalScore += score;
                    }

                }
            }
            char[] res = new char[writeIndex];
            for (int i = 0; i < writeIndex; i++) {
                res[i] = str[i];
            }
            str = res;
            return totalScore;
    }

    public static void main(String[] args) {
        String s = "cdcbaabba";
        int x = 4;
        int y = 5;
        System.out.println(maximumGain(s, x, y));

    }
}
