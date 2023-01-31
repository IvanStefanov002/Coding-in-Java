import java.util.Scanner;

public class CommonElements_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstRow = sc.nextLine();
		String secondRow = sc.nextLine();
		
		String[] firstArray = firstRow.split(" ");
		String[] secondArray = secondRow.split(" ");
		for(String a : secondArray) {
			for(String b: firstArray) {
				if(a.equals(b)) {
					System.out.print(b+" ");
					break;
				}
			}
		}
	}
}
