// reverse a string 
// Java program to reverse a string using backward traversal

class GfG {
    static String reverseString(String s) {
        StringBuilder res = new StringBuilder();
  
        // Traverse on s in backward direction
        // and add each character to a new string
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "kulal";
        String res = reverseString(s);
        System.out.print(res);
    }
}
