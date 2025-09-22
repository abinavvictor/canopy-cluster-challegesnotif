package Strings;

public class LongestPalindromeUsingManachersAlgorithm {

    public String longestPalWithManchar(String str) {

        String T = preprocess(str);
        int n = T.length();
        int[] P = new int[n];
        int C = 0, R = 0;

        for (int i = 0; i < n - 1; i++) {
            int mirror = 2 * C - i;  // mirror = c-d where d = distance c-(i-c)
            if (i < R) {
                P[i] = Math.min(R - i, P[mirror]);
            }

            while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i])) {
                P[i]++;
            }

            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }

        }

        int maxLen = 0, centerIndex = 0;

        for (int j = 0; j < n - 1; j++) {
            if (P[j] > maxLen) {
                maxLen = P[j];
                centerIndex = j;
            }
        }
        int start = (centerIndex - maxLen) / 2;
        return str.substring(start, start + maxLen);



    }
    public String preprocess(String S){

        StringBuilder  sbr = new StringBuilder('^');
        for(char c : S.toCharArray()){
            sbr.append(c).append('#');
        }
        sbr.append("#$");

        return sbr.toString();

    }

}
