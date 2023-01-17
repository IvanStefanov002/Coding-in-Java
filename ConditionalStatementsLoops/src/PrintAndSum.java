import java.util.Scanner;

public class PrintAndSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start_number = sc.nextInt();
		int end_number = sc.nextInt();
		int sum = start_number;
		System.out.print(start_number);
		for(int i=start_number; i<end_number; i++) {
			start_number++;
			System.out.print(" "+start_number);
			sum+=start_number;
		}
		System.out.println("\nSum: "+sum);
	}
}
