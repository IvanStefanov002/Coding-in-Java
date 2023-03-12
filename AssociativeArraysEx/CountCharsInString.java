package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {

    //Write a program that counts all characters in a string except space (' ').
    //Print all occurrences in the following format:
    //"{char} -> {occurrences}"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Map<Character, Integer> characterCount = new LinkedHashMap<>();
        //Hashmap -> нямаме конкретна подредба на записите
        //LinkedHashmap -> записите се подреждат спрямо редът на добавянето
        //TreeMap -> записите се сортират по ключ(по азбучен ред на ключ(примерно))

        //toCharArray -> правим масив от символи на даден string
        for(char symbol : text.toCharArray()){
            if(symbol == ' ') {
                continue;
            }
            if(characterCount.containsKey(symbol)){
                int currentCount = characterCount.get(symbol);
                characterCount.put(symbol, currentCount+1);
            }else{
                characterCount.put(symbol, 1);
            }
        }
        //#1
        for(Map.Entry<Character, Integer> entry : characterCount.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
        //#2 API way
        //characterCount.forEach((key, value)-> System.out.println(key + " -> " + value));
    }
}
