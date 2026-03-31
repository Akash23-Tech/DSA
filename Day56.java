// Split the binary string into substrings with equal number of 0s and 1s

class BalancedBinaryString{

    public static int maxBalancedSubstrings(String s) {
        int count0 = 0;
        int count1 = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '0') {
                count0++;
            } else if (ch == '1') {
                count1++;
            }

            // When counts are equal → one balanced substring found
            if (count0 == count1) {
                result++;
            }
        }

        // If total 0s and 1s are not equal → not possible
        if (count0 != count1) {
            return -1;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "0100110101";
        int ans = maxBalancedSubstrings(s);
        System.out.println(ans);  
    }
}
