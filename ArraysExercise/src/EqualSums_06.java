import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = Arrays
				.stream(sc.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		for(int index = 0; index<= numbers.length -1; index++) {
			int currentElement = numbers[index];
			int leftSum = 0;
			int rightSum = 0;
			
			//сумата на елементите от ляво на моето число.
			for(int leftIndex = 0; leftIndex < index; leftIndex++) {
				leftSum += numbers[leftIndex];
			}
			//сумата на елементите от дясно на моето число.
			for(int rightIndex = index+1; rightIndex <=numbers.length-1; rightIndex++) {
				rightSum += numbers[rightIndex];
			}
			//проверка дали leftSum и rightSum са равни
			if(leftSum == rightSum) {
				System.out.println(index);
				return; //прекъсваме цялата програма
			}
		}
		
		//ако не се е прекъснала програмата
		System.out.println("no");
	}
}
