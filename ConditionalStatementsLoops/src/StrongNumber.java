import java.util.Scanner;

public class StrongNumber {

	
	public static int fact(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		int number_ = Integer.parseInt(number);
		int sum=0;
		int temp=0;
		
		for(int i=0; i<number.length(); i++) {
			char c = number.charAt(i);
			int b = Character.getNumericValue(c);
			temp=fact(b);
			sum+=temp;
		}
		if(sum==number_) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
