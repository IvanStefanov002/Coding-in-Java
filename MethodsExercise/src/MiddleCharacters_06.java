import java.util.Scanner;

public class MiddleCharacters_06 {
	//You will receive a single string. Write a method that prints the middle
	//character. If the length of the string is even, 
	//there are two middle characters.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		output(str);
	}
	
	public static void output(String str) {
		int counter = str.length();
		if(counter%2==0) {
			System.out.print(str.charAt(counter/2-1));
			System.out.print(str.charAt(counter/2));
		}else {
			System.out.println(str.charAt(counter/2));
		}
	}
}
