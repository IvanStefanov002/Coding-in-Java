import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbersArr = Arrays
				.stream(sc.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		int evenSum = 0;
		int oddSum = 0;
		for(int item : numbersArr) {
			if(item%2==0) {
				evenSum+=item;
			}else {
				oddSum+=item;
			}
		}
		System.out.println(evenSum-oddSum);
	}
}
