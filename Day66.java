// Count All Palindromic Subsequence in a given String.

class Main {

    static int[][] memo;

    static int countPalindrome(String str, int i, int j) {
        // Base cases
        if (i > j) return 0;
        if (i == j) return 1;

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (str.charAt(i) == str.charAt(j)) {
            memo[i][j] = countPalindrome(str, i + 1, j)
                       + countPalindrome(str, i, j - 1)
                       + 1;
        } else {
            memo[i][j] = countPalindrome(str, i + 1, j)
                       + countPalindrome(str, i, j - 1)
                       - countPalindrome(str, i + 1, j - 1);
        }

        return memo[i][j];
    }

    public static void main(String[] args) {
        String str = "aaa";
        int n = str.length();

        memo = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(countPalindrome(str, 0, n - 1));
        System.out.println("Day66 Dsa problem solved");
    
    }
}