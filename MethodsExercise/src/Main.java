import java.util.Scanner;

public class Main {

	public static int smallestOfThreeNumbers() {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			n1=Integer.parseInt(sc.nextLine());
			if(n1<min) {
				min = n1;
			}
		}
		return min;
	}
	
	public static int vowelsCount() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int counter = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='a'
					|| str.charAt(i)=='e'
					|| str.charAt(i)=='i'
					|| str.charAt(i)=='o'
					|| str.charAt(i)=='u'
					|| str.charAt(i)=='y') {
				counter++;
			}
		}
		return counter;
		
	}
	
	public static void passwordValidator() {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine().toUpperCase();
		int digitCounter = 0;
		boolean isInclusive = false;
		boolean isLettersAndDigits = false;
		boolean isAtLeastTwoDigits = false;
		
		//проверка дали е от 6-10 знака.
		if(password.length()>=6 && password.length()<=10) {
			isInclusive = true;
		}else {
			System.out.println("Password must be between 6 and 10 characters");
		}
		
		//проверка дали се състои само от letters/digits
		for(int i=0; i<password.length();i++) {
			if(password.charAt(i)>='A' && password.charAt(i)<='Z' || password.charAt(i)>='0' && password.charAt(i)<='9') {
				isLettersAndDigits = true;
			}else {
				isLettersAndDigits = false;
				break;
			}
		}
		
		//проверка дали има поне 2 digits
		for(int i=0; i<password.length();i++) {
			if(password.charAt(i)>='0' && password.charAt(i)<='9') {
				digitCounter++;
				if(digitCounter>=2) {
					isAtLeastTwoDigits=true;
				}
			}
		}
		if(isLettersAndDigits==false) {
			System.out.println("Password must consist only of letters and digits");
		}
		if(digitCounter<2) {
			System.out.println("Password must have at least 2 digits");
		}
		
		if(isInclusive==true && isAtLeastTwoDigits==true && isLettersAndDigits==true) {
			System.out.println("Password is valid");
		}
	}
	public static void main(String[] args) {
		passwordValidator();
	}
}
