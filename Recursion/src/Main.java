import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = scan.nextInt();
		factorial(number,number);
	}

	static void factorial(int number,int result) {
		if (number > 1) {
			result = result * (number - 1);
			number--;
			factorial(number,result);
			}
		else if (number == 1) {
			System.out.println("result: "+result);
		}
		else if (number < 1) {
			System.out.println("0 and negative numbers not allowed ...");
		}
		else {
		}
	}
}