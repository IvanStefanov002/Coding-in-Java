package ExamPreparation_01;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encryptedMessage = sc.nextLine(); //криптирано съобщение
        StringBuilder modifyMessage = new StringBuilder(encryptedMessage); //модифицирам криптираното съобщение

        String input = sc.nextLine();
        while(!input.equals("Decode")){
            if(input.contains("Move")){
                //input = "Move {number of letters}"
                int lettersCount = Integer.parseInt(input.split("\\|")[1]);
                String firstLetters = modifyMessage.substring(0, lettersCount);
                //modifyMessage.delete(0, lettersCount);
                modifyMessage.replace(0, lettersCount, "");
                modifyMessage.append(firstLetters);
            }else if(input.contains("Insert")){
                //input = "Insert {index} {value}"
                int index = Integer.parseInt(input.split("\\|")[1]);
                String textToInsert = input.split("\\|")[2];
                modifyMessage.insert(index, textToInsert);
            }else if(input.contains("ChangeAll")){
                //input = "ChangeAll {substring} {replacement}"
                String textForChange = input.split("\\|")[1];
                String replacement = input.split("\\|")[2];

                String currentMessage = modifyMessage.toString();
                currentMessage = currentMessage.replace(textForChange, replacement);
                modifyMessage = new StringBuilder(currentMessage);
            }
            input = sc.nextLine();
        }
        System.out.println("The decrypted message is: " +modifyMessage);
    }
}
