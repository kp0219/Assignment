import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInteger(romanNumeral);

        if (result == -1) {
            System.out.println("Invalid Roman numeral");
        } else {
            System.out.println("The integer equivalent is: " + result);
        }
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = romanMap.get(c);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        if (result != 0) {
            return result;
        } else {
            return -1; // Invalid Roman numeral
        }
    }
}