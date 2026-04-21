// Convert a Sentence into its equivalent mobile numeric keypad sequence

class Solution {

    // Function to convert sentence to keypad sequence
    public static String printSequence(String input) {
        
        // Mapping for A-Z
        String[] keypad = {
            "2", "22", "222",        // A, B, C
            "3", "33", "333",        // D, E, F
            "4", "44", "444",        // G, H, I
            "5", "55", "555",        // J, K, L
            "6", "66", "666",        // M, N, O
            "7", "77", "777", "7777",// P, Q, R, S
            "8", "88", "888",        // T, U, V
            "9", "99", "999", "9999" // W, X, Y, Z
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                result.append("0");
            } else {
                // Convert character to uppercase (if needed)
                ch = Character.toUpperCase(ch);

                // Get index (A = 0, B = 1, ..., Z = 25)
                int index = ch - 'A';

                result.append(keypad[index]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Akash Kulal";
        System.out.println(printSequence(input));
        System.out.println("Day64 Dsa problem completed");
    }
}
