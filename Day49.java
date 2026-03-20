// Write a Code to check whether one string is a rotation of another

class StringRotation {
    public static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        String temp = s1 + s1;

        return temp.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if (isRotation(s1, s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("Day49 Dsa problem solved");
    }
}
