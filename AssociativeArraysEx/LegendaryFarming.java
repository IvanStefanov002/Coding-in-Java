package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//You are playing a game, and your goal is to win a legendary item - any legendary item will
//be good enough. However, it's a tedious process and requires quite a bit of farming.
//The possible items are:
//"Shadowmourne" - requires 250 Shards
//"Valanyr" - requires 250 Fragments
//"Dragonwrath" - requires 250 Motes
//"Shards", "Fragments", and "Motes" are the key materials (case-insensitive), and everything else is junk.
//You will be given lines of input in the format:
//"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}
//Keep track of the key materials - the first one that reaches 250, wins the race. At that point,
//you have to print that the corresponding legendary item is obtained.
//In the end, print the remaining shards, fragments, and motes in the format:
//"shards: {numberOfShards}
//fragments: {numberOfFragments}
//motes: {numberOfMotes}"
//Finally, print the collected junk items in the order of appearance.

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        Map<String, Integer> junk = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        boolean isWin = false;
        while(!isWin){
            String input = sc.nextLine();
            String[] inputData = input.split("\\s+");
            for (int index = 0; index <= inputData.length-1; index+=2) {
                String material = inputData[index + 1].toLowerCase();
                int quantity = Integer.parseInt(inputData[index]);
//                if(!materials.containsKey(material)){
//                    if(!junk.containsKey(material)){
//                        junk.put(material, 1);
//                    }else{
//                        int currentJunkValue = junk.get(material);
//                        junk.put(material, currentJunkValue+1);
//                    }
//                }
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int currentQuantity = junk.get(material);
                        junk.put(material, currentQuantity + quantity);
                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if(isWin){
                break;
            }
        }
        materials.entrySet().forEach(entry -> System.out.println(entry.getKey()+": "+entry.getValue()));
        junk.entrySet().forEach(entry -> System.out.println(entry.getKey()+": "+entry.getValue()));
    }
}
