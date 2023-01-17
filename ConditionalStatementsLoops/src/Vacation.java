import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number_of_people;
		number_of_people = sc.nextInt();
		String type_of_group;
		type_of_group = sc.next();
		String day;
		day = sc.next();
		double total_price = 0;
		
		if(day.equals("Friday")) {
			if(type_of_group.equals("Students")) {
				total_price = 8.45 * number_of_people;
				if(number_of_people>=30) {
					total_price = total_price - ((15*total_price)/100);
				}
			}
			if(type_of_group.equals("Business")) {
				total_price = 10.90 * number_of_people;
				if(number_of_people>=100) {
					total_price = total_price - (10*10.90);
				}
			}
			if(type_of_group.equals("Regular")) {
				total_price = 15 * number_of_people;
				if(number_of_people>=10 && number_of_people<=20) {
					total_price = total_price - ((5*total_price)/100);
				}
			}
		}
		
		if(day.equals("Saturday")) {
			if(type_of_group.equals("Students")) {
				total_price = 9.80 * number_of_people;
				if(number_of_people>=30) {
					total_price = total_price - ((15*total_price)/100);
				}
			}
			if(type_of_group.equals("Business")) {
				total_price = 15.60 * number_of_people;
				if(number_of_people>=100) {
					total_price = total_price - (10*15.60);
				}
			}
			if(type_of_group.equals("Regular")) {
				total_price = 20 * number_of_people;
				if(number_of_people>=10 && number_of_people<=20) {
					total_price = total_price - ((5*total_price)/100);
				}
			}
		}
		
		if(day.equals("Sunday")) {
			if(type_of_group.equals("Students")) {
				total_price = 10.46 * number_of_people;
				if(number_of_people>=30) {
					total_price = total_price - ((15*total_price)/100);
				}
			}
			if(type_of_group.equals("Business")) {
				total_price = 16 * number_of_people;
				if(number_of_people>=100) {
					total_price = total_price - (10*16);
				}
			}
			if(type_of_group.equals("Regular")) {
				total_price = 22.50 * number_of_people;
				if(number_of_people>=10 && number_of_people<=20) {
					total_price = total_price - ((5*total_price)/100);
				}
			}
		}
		
		System.out.printf("Total price: %.2f",total_price);
	}

}
