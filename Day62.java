// Rabin Karp Algorithm

import java.util.*;

class Solution{

    static final int d = 256;

    public static List<Integer> search(String pat, String txt) {
        List<Integer> result = new ArrayList<>();
        
        int m = pat.length();
        int n = txt.length();
        int p = 0; // hash for pattern
        int t = 0; // hash for text window
        int h = 1;
        int q = 101; // prime number

        // h = pow(d, m-1) % q
        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // initial hash values
        for (int i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        // sliding window
        for (int i = 0; i <= n - m; i++) {

            // check hash match
            if (p == t) {
                int j;
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }
                if (j == m)
                    result.add(i);
            }

            // compute next window hash
            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;

                if (t < 0)
                    t += q;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String txt = "abcab";
        String pat = "ab";

        System.out.println(search(pat, txt)); 
        System.out.println("Day62 Dsa problem solved");
    }
}
