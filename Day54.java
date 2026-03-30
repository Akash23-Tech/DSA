// Print all Subsequences of a string

class Subsequences{

    public static void printSubsequences(String s, int index, String current) {
        if (index == s.length()) {
            if (!current.isEmpty()) {   // skip empty subsequence if needed
                System.out.print(current + " ");
            }
            return;
        }

        // Include current character
        printSubsequences(s, index + 1, current + s.charAt(index));

        // Exclude current character
        printSubsequences(s, index + 1, current);
    }

    public static void main(String[] args) {
        String s = "abc";
        printSubsequences(s, 0, "");
        System.out.println();
        System.out.println("Day54 Dsa problem solved");
    }
}
