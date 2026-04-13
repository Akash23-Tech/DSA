// Word break Problem[ Very Imp]

import java.util.*;

class WordBreakExample{

    public static boolean wordBreak(String s, List<String> dictionary) {
        Set<String> dict = new HashSet<>(dictionary);
        boolean[] dp = new boolean[s.length() + 1];

        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
    public static void main(String[] args) {
        String s = "akash";
        List<String> dictionary = Arrays.asList("aka", "sh", "ka", "ash");

        System.out.println(wordBreak(s, dictionary)); 
    }
}
