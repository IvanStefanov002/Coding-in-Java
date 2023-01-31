import java.util.Scanner;

public class ZigZagArrays_03 {

	public static void main(String[] args) {
		//Write a program that creates 2 arrays. You will be given an integer n. 
		//On the next n lines, you get 2 integers. Form 2 arrays as shown below.
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] arrayOne = new int[n];
		int[] arrayTwo = new int[n];
		for(int i=0; i<n; i++) {
			String[] inputArray = sc.nextLine().split(" ");
			if(i%2==0) {
				arrayOne[i] = Integer.parseInt(inputArray[0]);
				arrayTwo[i] = Integer.parseInt(inputArray[1]);
			}else {
				arrayOne[i] = Integer.parseInt(inputArray[1]);
				arrayTwo[i] = Integer.parseInt(inputArray[0]);
			}	
		}
		for(int e : arrayOne) {
			System.out.print(e+" ");
		}
		System.out.println();
		for(int e : arrayTwo) {
			System.out.print(e+" ");
		}
	}
}
