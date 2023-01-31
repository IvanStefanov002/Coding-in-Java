import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {

	public static void main(String[] args) {
		//Write a program that finds the longest sequence of equal elements in an array of integers. 
		//If several longest sequences exist, print the leftmost one.
		Scanner sc = new Scanner(System.in);
		int[] numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int bestLength = 0;
        int endIndex = -1;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNum = numbers[i];
            int secondNum = numbers[i + 1];

            if (currentNum == secondNum) {
                length++;
                if (length > bestLength) {
                    bestLength = length;
                    endIndex = i + 1;
                }
            } else {
                length = 1;
            }
        }
        for (int i = endIndex; i > endIndex - bestLength ; i--) {
            System.out.print(numbers[i] + " ");
        }
	}
}
