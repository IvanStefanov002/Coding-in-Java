package Lectures;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();
        for(int i=0; i<n; i++){
            String word = sc.nextLine();
            String synonym = sc.nextLine();
            if(!wordsMap.containsKey(word)){
                wordsMap.put(word, new ArrayList<>());
            }
            wordsMap.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
