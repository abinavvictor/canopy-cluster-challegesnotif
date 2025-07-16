package Strings;

public class LongestPalindromeUsingManachersAlgorithm {

    public static String longestPalindrome(String S) {

        if (S == null || S.isEmpty())
            return "";

        String t = preprocess(S);
        int[] p = new int[t.length()];
        int center = 0, right = 0;
        int maxLen = 0, centerIndex = 0;

        for (int i = 1; i < t.length() - 1; i++) {

            int mirror = 2 * center - 1;

            if (i < right) {
                p[i] = Math.max(p[mirror], right - i);
            }

            while (t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1)) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];

            }

            if (p[i] > maxLen) {

                maxLen = p[i];
                centerIndex = i;
            }

        }
        int start = (centerIndex - maxLen) / 2;
        return S.substring(start, start + maxLen);

    }

    public static String preprocess(String S) {
        StringBuilder sb = new StringBuilder('^');

        for (char c : S.toCharArray()) {
            sb.append(c);
            sb.append('#');
        }
        sb.append("#$");
       return sb.toString();

    }


}
