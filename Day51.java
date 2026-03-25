// Count and Say problem

class LookAndSay{

    public static String nthRow(int n) {
        if (n <= 0) return "";

        String result = "1"; // first row

        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }
            temp.append(count).append(result.charAt(result.length() - 1));

            result = temp.toString();
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(nthRow(n));
        System.out.println("Day51 Dsa problem solved");
    }
}