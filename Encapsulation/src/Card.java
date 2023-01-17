import java.util.Scanner;

public class Card {
	
	Scanner sc = new Scanner(System.in);
	
	int number;
	String exp_date;
	int cvv;
	String holder_name;
	private int pin;
	
	Card(int number, String exp_date, int cvv, String i, int pin) {
		this.number = number;
		this.exp_date = exp_date;
		this.cvv = cvv;
		this.holder_name = i;
		this.setPin(pin);
	}
	
	public void pinChange() {
		int current_pin;
		int new_pin;
		System.out.println("Insert current PIN:");
		current_pin = sc.nextInt();
		
		if(current_pin==getPin()) {
			System.out.println("Succesful current PIN!");
			System.out.println("Insert new PIN:");
			new_pin = sc.nextInt();
			setPin(new_pin);
		}else {
			System.out.println("Wrong current PIN!");
		}
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
