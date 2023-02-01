import java.util.Scanner;

public class Main {
	
	//задача 1:
	//Create a method that prints the sign of an integer number.
	public static void signOfInteger() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		if(n>0){
			System.out.println("The number "+n+" is positive.");
		}
		if(n<0){
			System.out.println("The number "+n+" is negative.");
		}
		if(n==0) {
			System.out.println("The number "+n+" is zero.");
		}
	}
	
	//задача 2:
	//Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
	//· 2.00 – 2.99 - "Fail"
	//· 3.00 – 3.49 - "Poor"
	//· 3.50 – 4.49 - "Good"
	//· 4.50 – 5.49 - "Very good"
	//· 5.50 – 6.00 - "Excellent"
	public static void grades() {
		Scanner sc = new Scanner(System.in);
		double grade = sc.nextDouble();
		if(grade>=2.00 && grade<=2.99) {
			System.out.println("Fail");
		}
		if(grade>=3.00 && grade<=3.49) {
			System.out.println("Poor");
		}
		if(grade>=3.50 && grade<=4.49) {
			System.out.println("Good");
		}
		if(grade>=4.50 && grade<=5.49) {
			System.out.println("Very good");
		}
		if(grade>=5.50 && grade<=6.00) {
			System.out.println("Excellent");
		}
	}
	
	//задача 3:
	//Create a method for printing triangles as shown below:
	public static void printingTriangle() {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=number; i++) {
			//System.out.println(i);
			for(int k=1; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=number; i>=1; i--) {
			for(int k=1; k<i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	//задача 4:
	//Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide") 
	//and on the next two lines receives two numbers. Create four methods (for each calculation) 
	//and invoke the right one depending on the command. The method should also print the result (it needs to be void).
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public static void multiply(int n1, int n2) {
		System.out.println(n1*n2);
	}
	public static void subtract(int n1, int n2) {
		System.out.println(n1-n2);
	}
	public static void divide(int n1, int n2) {
		System.out.println(n1/n2);
	}
	public static void calculations() {
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		switch(command) {
		case "add":
			add(n1, n2);
			break;
		case "multiply":
			multiply(n1, n2);
			break;
		case "subtract":
			subtract(n1, n2);
			break;
		case "divide":
			divide(n1, n2);
			break;
		}
	}
	
	//задача 5:
	//Write a method that calculates the total price of an order and prints it on the console. 
	//The method should receive one of the following products: coffee, water,
	//coke, snacks, and a quantity of the product. The prices for a single piece of each product are:
	//· coffee – 1.50
	//· water – 1.00
	//· coke – 1.40
	//· snacks – 2.00
	//Print the result rounded to the second decimal place.
	public static void orders(String product, int quantity) {
		double totalPrice=0;
		switch(product) {
		case "coffee":
			totalPrice = 1.50 * quantity;
			break;
		case "water":
			totalPrice = 1.00 * quantity;
			break;
		case "coke":
			totalPrice = 1.40 * quantity;
			break;
		case "snacks":
			totalPrice = 2.00 * quantity;
			break;
		}
		System.out.printf("%.2f", totalPrice);
	}
	
	//задача 6:
	//Create a method that calculates and returns the area of a rectangle by given width and length.
	public static int calculateRectangleArea(int width, int length) {
		return width * length;
	}
	
	//задача 7:
	//Write a method that receives a string and a repeat count n (integer). 
	//The method should return a new string (the old one repeated n times).
	public static void repeatString(String string, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(string);
		}
	}
	
	//задача 8:
	//Create a method that calculates and returns the value of a number raised to a given power.
	public static double mathPower(double n1, double n2) {
		double result = 0;
		result+= Math.pow(n1, n2);
		return result;
		
	}
	
	//задача 9:
	//You are given two values of the same type as input. 
	//The values can be of type int, char of String. 
	//Create a method getMax() that returns the greater of the two values:
	static int getMax(int firstNum, int secondNum) {
		if(firstNum>secondNum) {
			return firstNum;
		}
		return secondNum;
	}
	static char getMax(char first, char second) {
		int ascii1 = 0;
		int ascii2 = 0;
		ascii1 = first;
		ascii2 = second;
		if(ascii1>ascii2) {
			return first;
		}
		return second;
	}
	static String getMax(String first, String second) {
		if(first.compareTo(second) >= 0) {
			return first;
		}
		return second;
	}
	public static void greaterOfTwoValues() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		switch(input) {
		case "int":
			int n1 = Integer.parseInt(sc.nextLine());
			int n2 = Integer.parseInt(sc.nextLine());
			System.out.println(getMax(n1, n2));
			break;
		case "char":
			char c1 = sc.next().charAt(0);
			char c2 = sc.next().charAt(0);
			System.out.println(getMax(c1, c2));
			break;
		case "string":
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			System.out.println(getMax(s1, s2));
			break;
		}
	}
	
	//задача 10:
	//Create a program that reads an integer number and multiplies the sum 
	//of all its even digits by the sum of all its odd digits:
	public static void multiplyEvensByOdds() {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		int sumEvens = 0;
		int sumOdds = 0;
		while(number%10!=0) {
			int temp = number%10;
			if(temp%2==0) {
				sumEvens+=temp;
			}else {
				sumOdds+=temp;
			}
			number/=10;
		}
		System.out.println(sumEvens*sumOdds);
	}
	
	//задача 11:
	//Write a method that receives two numbers and an operator, calculates the result, and returns it. 
	//You will be given three lines of input. The first will be the first number, 
	//the second one will be the operator, and the last one will be the second number. 
	//The possible operators are: / * + -
	//Print the result rounded up to the second decimal point.
	
	public static void mathOperations() {
		Scanner sc = new Scanner(System.in);
		double n1 = Double.parseDouble(sc.nextLine());
		char operator = sc.nextLine().charAt(0);
		double n2 = Double.parseDouble(sc.nextLine());
		double result = 0;
		
		switch(operator) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}
		System.out.printf("%.2f", result);
	}
	
	public static void main(String[] args) {
	}
}
