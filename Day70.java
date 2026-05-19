// Converting Roman Numerals to Decimal

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RomanToDecimal {

    public static int romanToDecimal(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            // Check next character
            if (i + 1 < s.length() &&
                current < map.get(s.charAt(i + 1))) {

                result -= current;

            } else {
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Numeral: ");
        String s = sc.nextLine();

        int result = romanToDecimal(s);

        System.out.println("Decimal Value: " + result);

        sc.close();
    }
}