package TextProcessingEx;

import java.util.Scanner;

public class CaesarCipher_04 {
    //Write a program that returns an encrypted version of the same text.
    // Encrypt the text by shifting each character with three positions forward.
    // For example, A would be replaced by D, B would become E, and so on.
    // Print the encrypted text.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        for(char symbol : text.toCharArray()) {
            char encryptSymbol = (char) (symbol + 3); //encrypted symbol
            System.out.print(encryptSymbol);
        }
    }
}
