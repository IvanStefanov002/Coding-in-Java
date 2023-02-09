import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    //Write a program to sum all adjacent equal numbers in a list of decimal numbers,
    // starting from left to right.
    //After two numbers are summed, the obtained result could be equal to some of
    // its neighbors and should be summed as well (see the examples below).
    //Always sum the leftmost two equal neighbors (if several couples of equal
    // neighbors are available).

    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //input 3 3 6 1
        //output 12 1
        int temp = 0;
        for(int i=0; i<numbers.size()-1; i++){
            int num1=numbers.get(i);
            int num2=numbers.get(i+1);
            if(num1==num2) {
                temp = num1 * 2;
                numbers.set(i, temp);
                numbers.remove(i+1);
                i = -1;
            }
        }
        for(int e : numbers){
            System.out.print(e + " ");
        }

    }
}
