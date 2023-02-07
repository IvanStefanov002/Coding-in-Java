import java.util.Scanner;

public class FactorialDivision_08 {
	//Read two integer numbers. Calculate the factorial of each number.
	//Divide the first result by the second and print the division
	//formatted to the second decimal point.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1 = Integer.parseInt(sc.nextLine());
		int number2 = Integer.parseInt(sc.nextLine());
		
		long fNum1 = factCalculator(number1);
		long fNum2 = factCalculator(number2);
		
		double division = 0;
		division = fNum1 * 1.0 / fNum2;	 //1.0 за да може да е дробен резултат.
		System.out.printf("%.2f", division);
	}
	
	public static long factCalculator(int n) {
		long fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
