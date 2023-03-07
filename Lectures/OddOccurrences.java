package Lectures;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for(String item: inputArr){
            item = item.toLowerCase();
            if(!wordsMap.containsKey(item)){
                wordsMap.put(item, 1);
            }else{
                int value = wordsMap.get(item);
                wordsMap.put(item, value+1);
            }
        }

        List<String> resultList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : wordsMap.entrySet()){
            if(entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
