import java.util.Scanner;

public class TopNumber_010 {
	//Read an integer n from the console. Find all top numbers in the range [1 … n] 
	//and print them. A top number holds the following properties:
	//	· Its sum of digits is divisible by 8, e.g. 8, 16, 88.
	//	· Holds at least one odd digit, e.g. 232, 707, 87578.
	 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= n; number++) {
            //проверка дали е топ число
            boolean isSum = isDivisibleBy8(number);
            boolean isContains = isHoldingOddDigit(number);
            if (isSum && isContains) {
                System.out.println(number);
            }


        }
    }

    public static boolean isDivisibleBy8 (int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10; 
            sum += lastDigit; 
            number = number / 10; 
        }
        return sum % 8 == 0;
    }

    public static boolean isHoldingOddDigit (int number) {
        while (number > 0) {
            int lastDigit = number % 10; 
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}