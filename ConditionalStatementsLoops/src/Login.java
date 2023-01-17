import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        int counter = 0;
        String reversed = "";
        boolean isBlocked = false;
        String password = sc.nextLine();

        char ch;
        for (int i = 0; i < username.length(); i++) {
            ch = username.charAt(i);
            reversed = ch + reversed;
        }
        while (!password.equals(reversed)) {
            counter++;
            if (counter == 4) {
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            password = sc.nextLine();
        }

        if (isBlocked) {
            System.out.println("User " + username + " blocked!");
        } else {
            System.out.println("User " + username + " logged in.");
        }

    }
}
		
		
		
		
