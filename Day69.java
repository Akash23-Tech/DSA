// Boyer Moore Algorithm for Pattern Searching

class Akash{

    public static boolean isPatternPresent(String txt, String pat) {

        if (txt.contains(pat)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String txt = "abcdefh";
        String pat = "bcd";

        boolean result = isPatternPresent(txt, pat);

        System.out.println(result);
    }
}
