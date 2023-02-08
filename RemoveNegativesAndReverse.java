import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();
        for(int i=0; i<=numbers.size()-1; i++){
            int temp = numbers.get(i);
            if(temp>=0){
                positiveNumbers.add(temp);
            }
        }
        System.out.println("Array after removing negative numbers:");
        for(int e : positiveNumbers){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("Sorted array:");
        Collections.sort(positiveNumbers);
        for(int e : positiveNumbers){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("Reversed sorted array:");
        Collections.reverse(positiveNumbers);
        for(int e : positiveNumbers){
            System.out.print(e + " ");
        }
    }
}
