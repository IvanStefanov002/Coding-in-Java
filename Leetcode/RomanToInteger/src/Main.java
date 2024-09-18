class Solution {
    enum Roman {
        I,
        V,
        X,
        L,
        C,
        D,
        M,
        IV,
        IX,
        XL,
        XC,
        CD,
        CM
    }

    public Roman stringToRoman(String s) {
        return switch (s) {
            case "I" -> Roman.I;
            case "V" -> Roman.V;
            case "X" -> Roman.X;
            case "L" -> Roman.L;
            case "C" -> Roman.C;
            case "D" -> Roman.D;
            case "M" -> Roman.M;
            case "IV" -> Roman.IV;
            case "IX" -> Roman.IX;
            case "XL" -> Roman.XL;
            case "XC" -> Roman.XC;
            case "CD" -> Roman.CD;
            case "CM" -> Roman.CM;
            default -> null;
        };
    }

    public int enumToInt(Roman e) {
        return switch (e) {
            case I -> 1;
            case V -> 5;
            case X -> 10;
            case L -> 50;
            case C -> 100;
            case D -> 500;
            case M -> 1000;
            case IV -> 4;
            case IX -> 9;
            case XL -> 40;
            case XC -> 90;
            case CD -> 400;
            case CM -> 900;
        };
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); ) {
            // Check if there's enough characters for a two-character numeral and if it exists
            if (i + 1 < s.length() && stringToRoman(s.substring(i, i + 2)) != null) {
                result += enumToInt(stringToRoman(s.substring(i, i + 2)));
                i += 2; // Skip the next character since it's part of a two-character numeral
            } else {
                result += enumToInt(stringToRoman(s.substring(i, i + 1)));
                i += 1; // Move to the next character
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.romanToInt("LVIII");

        System.out.println(result);
    }
}
