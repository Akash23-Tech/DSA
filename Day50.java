// Write a Program to check whether a string is a valid shuffle of two strings or not

class ValidShuffleSimple {

    public static boolean isValidShuffle(String str1, String str2, String result) {
        // Step 1: Length check
        if (str1.length() + str2.length() != result.length()) {
            return false;
        }

        int i = 0, j = 0, k = 0;

        // Step 2: Traverse result
        while (k < result.length()) {

            if (i < str1.length() && result.charAt(k) == str1.charAt(i)) {
                i++;
            } 
            else if (j < str2.length() && result.charAt(k) == str2.charAt(j)) {
                j++;
            } 
            else {
                return false;
            }
            k++;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "Aka";
        String str2 = "sha";
        String result = "akasha";

        if (isValidShuffle(str1, str2, result)) {
            System.out.println("Valid Shuffle");
        } else {
            System.out.println("Not a Valid Shuffle");
        }
        System.out.println("Day50 Dsa problem solved");
    }
}
