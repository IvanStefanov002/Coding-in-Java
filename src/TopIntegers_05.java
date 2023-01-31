import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
    	//Write a program to find all the top integers in an array. 
    	//A top integer is an integer that is bigger
    	//than all the elements to its right.
    	
        Scanner sc = new Scanner(System.in);
        int[] number = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];
            for (int j = i + 1; j < number.length; j++) {

               if (max < number[j]){
                   max = number[j];
               }
            }
            if (i == number.length - 1){
                System.out.print(currentNumber);
            } else if (currentNumber > max){
                System.out.print(currentNumber + " ");
            }
            max = 0;
        }
    }
}

