package TextProcessingEx;

import java.util.Scanner;

public class ValidUsernames_01 {
    //Write a program that reads user names on a single line (joined by ", ")
    // and prints all valid usernames.
    //A valid username is:
    //· Has a length of between 3 and 16 characters.
    //· It contains only letters, numbers, hyphens, and underscores.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] usernames = input.split(", ");

        for(String username : usernames) {
            if(isValidUsername(username)){
                System.out.println(username);
            }
        }
    }
    private static boolean isValidUsername(String username){
        if(username.length()<3 || username.length()>16){
            return false;
        }
        for(char symbol : username.toCharArray()){
            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}
