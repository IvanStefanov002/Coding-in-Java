import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int number = 0;
		int divisible = 0;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			divisible = 2;
		}
		if(number % 3 == 0) {
			divisible = 3;
		}
		if(number % 6 == 0) {
			divisible = 6;
		}
		if(number % 7 == 0) {
			divisible = 7;
		}
		if(number % 10 == 0) {
			divisible = 10;
		}
		
		switch(divisible) {
		case 2:
			System.out.println("The number is divisible by "+divisible);
			break;
		case 3:
			System.out.println("The number is divisible by "+divisible);
			break;
		case 6:
			System.out.println("The number is divisible by "+divisible);
			break;
		case 7:
			System.out.println("The number is divisible by "+divisible);
			break;
		case 10:
			System.out.println("The number is divisible by "+divisible);
			break;
		default:
			System.out.println("Not divisible");
			break;
			
		}
	}

}
