import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbersArr = Arrays
				.stream(sc.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		int number = Integer.parseInt(sc.nextLine());
		for(int index = 0; index <=numbersArr.length -1; index++) {
			int currentNumber = numbersArr[index];
			for(int i = index+1; i<=numbersArr.length - 1; i++) {
				int nextNumber = numbersArr[i];
				if(currentNumber + nextNumber == number) {
					System.out.println(currentNumber + " " +nextNumber);
				}
			}
		}
	}
}
