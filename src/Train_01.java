import java.util.Scanner;

public class Train_01 {

	public static void main(String[] args) {
		//You will be given a count of wagons in a train n. 
		//On the next n lines, you will receive how many people will get on that wagon. 
		//In the end, print the whole train and the sum of the people on the train.
		
		Scanner sc = new Scanner(System.in);
		int countVagons = Integer.parseInt(sc.nextLine());
		int[] peopleInTrain = new int[countVagons];
		int sumPeople=0;
		for(int i=0; i<countVagons; i++) {
			peopleInTrain[i] = Integer.parseInt(sc.nextLine());
			sumPeople += peopleInTrain[i];
		}
		for(int e : peopleInTrain) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println(sumPeople);
	}
}
