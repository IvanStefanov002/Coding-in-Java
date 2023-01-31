import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArr = sc.nextLine().split(" ");
		for(int i =0; i<inputArr.length/2; i++) {
			String temp = inputArr[i];
			inputArr[i] = inputArr[inputArr.length-1 - i];
			inputArr[inputArr.length-1 - i] = temp;
		}
		System.out.println(String.join(" ", inputArr));
	}
}
