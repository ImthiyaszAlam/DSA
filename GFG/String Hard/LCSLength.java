public class LCSLength {

    static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }



    static  waysToIncreaseLCSBy1(String s1,String s2){
        int n = s1.length();
        int m = s2.length();

        int lcs1 = lcs(s1, s2);
    }


    public static void main(String[] args) {

    }
}
