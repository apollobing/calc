import java.util.HashMap;
import java.util.Map;

public class Main {

    private static String convertToRomanNumber(int num) {
        if (num < 1) {
            return "";
        }
        if (num >= 100) {
            return "C" + convertToRomanNumber(num - 100);
        }
        if (num >= 90) {
            return "XC" + convertToRomanNumber(num - 90);
        }
        if (num >= 50) {
            return "L" + convertToRomanNumber(num - 50);
        }
        if (num >= 40) {
            return "XL" + convertToRomanNumber(num - 40);
        }
        if (num >= 10) {
            return "X" + convertToRomanNumber(num - 10);
        }
        if (num >= 9) {
            return "IX" + convertToRomanNumber(num - 9);
        }
        if (num >= 5) {
            return "V" + convertToRomanNumber(num - 5);
        }
        if (num >= 4) {
            return "IV" + convertToRomanNumber(num - 4);
        }
        if (num >= 1) {
            return "I" + convertToRomanNumber(num - 1);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {

        // System.out.println(convertToRomanNumber(3));

        // System.out.println("Hi, Maria!");
        calc("V - I");
    }

    public static String calc(String string) throws Exception {
        String[] stringToArray = string.split(" ");
        // System.out.println(Arrays.toString(stringToArray));

        int operand1 = 0;
        int operand2 = 0;
        String operator = null;

        Map<String, Integer> romanNumbers = new HashMap<String, Integer>();
        romanNumbers.put("X", 10);
        romanNumbers.put("IX", 9);
        romanNumbers.put("VIII", 8);
        romanNumbers.put("VII", 7);
        romanNumbers.put("VI", 6);
        romanNumbers.put("V", 5);
        romanNumbers.put("IV", 4);
        romanNumbers.put("III", 3);
        romanNumbers.put("II", 2);
        romanNumbers.put("I", 1);

        if (romanNumbers.containsKey(stringToArray[0]) && romanNumbers.containsKey(stringToArray[2])) {
            operand1 = romanNumbers.get(stringToArray[0]);
            operand2 = romanNumbers.get(stringToArray[2]);
            operator = stringToArray[1];
            // System.out.println(operator);
        } else if (Integer.parseInt(stringToArray[0]) == (int) Integer.parseInt(stringToArray[0])
                && Integer.parseInt(stringToArray[2]) == (int) Integer.parseInt(stringToArray[2])) {
            operand1 = Integer.parseInt(stringToArray[0]);
            operand2 = Integer.parseInt(stringToArray[2]);
            operator = stringToArray[1];
            // System.out.println(operator);
        }

        if (stringToArray.length == 3 && operand1 >= 1 && operand1 <= 10 && operand2 >= 1 && operand2 <= 10
                && (operator.equals("/") || operator.equals("+") || operator.equals("-") || operator.equals("*"))

        ) {
            if (operator.equals("/") && romanNumbers.containsKey(stringToArray[0])
                    && romanNumbers.containsKey(stringToArray[2])) {
                int divideResult = operand1 / operand2;
                System.out.println(convertToRomanNumber(divideResult));
                return convertToRomanNumber(divideResult);
            } else if (operator.equals("/")
                    && Integer.parseInt(stringToArray[0]) == (int) Integer.parseInt(stringToArray[0])
                    && Integer.parseInt(stringToArray[2]) == (int) Integer.parseInt(stringToArray[2])) {
                int divideResult = operand1 / operand2;
                System.out.println(Integer.toString(divideResult));
                return Integer.toString(divideResult);
            }

            if (operator.equals("+") && romanNumbers.containsKey(stringToArray[0])
                    && romanNumbers.containsKey(stringToArray[2])) {
                int plusResult = operand1 + operand2;
                System.out.println(convertToRomanNumber(plusResult));
                return convertToRomanNumber(plusResult);
            } else if (operator.equals("+")
                    && Integer.parseInt(stringToArray[0]) == (int) Integer.parseInt(stringToArray[0])
                    && Integer.parseInt(stringToArray[2]) == (int) Integer.parseInt(stringToArray[2])) {
                int plusResult = operand1 + operand2;
                System.out.println(Integer.toString(plusResult));
                return Integer.toString(plusResult);
            }

            if (operator.equals("-") && romanNumbers.containsKey(stringToArray[0])
                    && romanNumbers.containsKey(stringToArray[2])) {
                int minusResult = operand1 - operand2;
                System.out.println(convertToRomanNumber(minusResult));
                return convertToRomanNumber(minusResult);
            } else if (operator.equals("-")
                    && Integer.parseInt(stringToArray[0]) == (int) Integer.parseInt(stringToArray[0])
                    && Integer.parseInt(stringToArray[2]) == (int) Integer.parseInt(stringToArray[2])) {
                int minusResult = operand1 - operand2;
                System.out.println(Integer.toString(minusResult));
                return Integer.toString(minusResult);
            }

            if (operator.equals("*") && romanNumbers.containsKey(stringToArray[0])
                    && romanNumbers.containsKey(stringToArray[2])) {
                int multiplyResult = operand1 * operand2;
                System.out.println(convertToRomanNumber(multiplyResult));
                return convertToRomanNumber(multiplyResult);
            } else if (operator.equals("*")
                    && Integer.parseInt(stringToArray[0]) == (int) Integer.parseInt(stringToArray[0])
                    && Integer.parseInt(stringToArray[2]) == (int) Integer.parseInt(stringToArray[2])) {
                int multiplyResult = operand1 * operand2;
                System.out.println(Integer.toString(multiplyResult));
                return Integer.toString(multiplyResult);
            }

        } else {
            throw new Exception("At least one of the condition is mismatch!");
        }
        return null;
    }

}
