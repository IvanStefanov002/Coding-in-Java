import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while(!command.equals("End")){
            if(command.contains("Add")){
                int nummberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(nummberToAdd);
            }else if(command.contains("Insert")){
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if(index >= 0 && index<=numbers.size()-1) {
                    numbers.add(index, numberToInsert);
                }
            }else if(command.contains("Remove")){
                int index = Integer.parseInt(command.split(" ")[1]);
                if(index >= 0 && index<=numbers.size()-1) {
                    numbers.remove(index);
                }
            }else if(command.contains("Shift left")){
                int countShiftLeft = Integer.parseInt(command.split(" ")[2]);
                for(int time = 1; time<=countShiftLeft; time++){
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);
                }
            }else if(command.contains("Shift right")) {
                int countShiftRight = Integer.parseInt(command.split(" ")[2]);
                for (int time = 1; time <= countShiftRight; time++) {
                    int lastNumber = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastNumber);
                }
            }
            command = sc.nextLine();
        }
        for(int n : numbers){
            System.out.print(n + " ");
        }
    }
}
