import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationsBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //1. Прочитаме лист от цели числа
        List<Integer> numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //2. Въвеждаме команди докато не получим end
        String command = sc.nextLine();
        while(!command.equals("end")){
            //валидна команда
            if(command.contains("Add")){
                int elementToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(elementToAdd);
            }else if(command.contains("Remove")){
                int elementToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(elementToRemove));
            }else if(command.contains("RemoveAt")){
                int indexToRemoveAt = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(indexToRemoveAt);
            }else if(command.contains("Insert")){
                int elementToInsert = Integer.parseInt(command.split(" ")[1]);
                int indexToInsert = Integer.parseInt(command.split(" ")[2]);
                numbers.set(indexToInsert, elementToInsert);
            }
            command = sc.nextLine();
        }
        for(int n : numbers){
            System.out.print(n + " ");
        }
    }
}
