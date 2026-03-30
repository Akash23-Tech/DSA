// Print all the permutations of the given string

class Day55 {
    public static void main(String[] args) {
        String s = "ABC"; // change input here
        permute(s, "");
        System.out.println("Day55 Dsa problem solved");
    }

    static void permute(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Pick each character one by one
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remaining string after removing chosen character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            permute(remaining, ans + ch);
        }
        
    }
    
}
