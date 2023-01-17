import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		if(number>=0 && number<=2) {
			System.out.println("baby");
		}
		if(number>=3 && number<=13) {
			System.out.println("child");
		}
		if(number>=14 && number<=19) {
			System.out.println("teenager");
		}
		if(number>=20 && number<=65) {
			System.out.println("adult");
		}
		if(number>=66) {
			System.out.println("elder");
		}

	}

}
