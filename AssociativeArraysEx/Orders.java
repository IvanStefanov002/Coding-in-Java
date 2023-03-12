package AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Write a program which keeps the information about products and their prices. Each product has a name, a price, and its quantity.
//If the product doesn't exist yet, add it with its starting quantity.
//If you receive a product that already exists, increases its quantity by the input quantity
//and if its price is different, replace the price as well.
//You will receive products' names, prices, and quantities on new lines.
//Until you receive the command "buy", keep adding items. When you do receive the command "buy",
//print the items with their names and the total price of all the products with that name.

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        while(!data.equals("buy")){
            //data = {name} {price} {quantity}
            String product = data.split("\\s+")[0];
            double price = Double.parseDouble(data.split("\\s+")[1]);
            int quantity = Integer.parseInt(data.split("\\s+")[2]);

            if(!productsQuantity.containsKey(product)){
                productsQuantity.put(product, quantity);
            }else{
                int currentQuantity = productsQuantity.get(product);
                productsQuantity.put(product, currentQuantity+quantity);
            }
            if(!productsPrice.containsKey(product)){
                productsPrice.put(product, price);
            }
            productsPrice.put(product, price);
            data = sc.nextLine();
        }

        for(Map.Entry<String, Integer> entry : productsQuantity.entrySet()){
            String productName = entry.getKey();
            double finalSum = productsQuantity.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
