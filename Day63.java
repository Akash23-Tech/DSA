// KMP Algorithm

class Main{
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(longestPrefixSuffix(s));
    }

    public static int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = new int[n];

        int len = 0; // length of previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1]; // fallback
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps[n - 1];
    }
}