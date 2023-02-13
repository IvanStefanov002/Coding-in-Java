import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int countCommands = Integer.parseInt(sc.nextLine());

        List<String> guests = new ArrayList<>(); //списък с гости

        for(int countCommand = 1; countCommand <= countCommands; countCommand++){
            String command = sc.nextLine();
            if(command.contains("is going!")){
                String name = command.split(" ")[0];
                if(guests.contains(name)){
                    System.out.println(name + " is already in the list!");
                }else{
                    guests.add(name);
                }
            }else if(command.contains("is not going!")){
                String name = command.split(" ")[0];
                if(guests.contains(name)){
                    guests.remove(name);
                }else{
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for(String name : guests){
            System.out.println(name);
        }
    }
}
