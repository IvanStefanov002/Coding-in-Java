package TextProcessingEx;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
//    You are given two lines – the first one can be a really big number (0 to 1050).
//    The second one will be a single-digit number (0 to 9).
//    You must display the product of these numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      with BigInteger class:
        BigInteger firstNumber = new BigInteger(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());

        System.out.println(firstNumber.multiply(BigInteger.valueOf(secondNumber)));
    }
}
