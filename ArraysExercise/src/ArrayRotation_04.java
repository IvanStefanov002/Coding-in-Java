import java.util.Scanner;

public class ArrayRotation_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");
		int countRotations = Integer.parseInt(sc.nextLine());
		
		for(int rotation = 1; rotation <=countRotations; rotation++) {
			String firstElement = inputArray[0];
			for(int index = 0; index<inputArray.length - 1; index++) {
				inputArray[index] = inputArray[index+1];
			}
			inputArray[inputArray.length-1] = firstElement;
		}
		for(String element : inputArray) {
			System.out.print(element + " ");
		}
	}
}
