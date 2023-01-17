import java.util.Scanner;

public class RageExpenses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lost_games_count = sc.nextInt();
		float headset_price = sc.nextFloat();
		float mouse_price = sc.nextFloat();
		float keyboard_price = sc.nextFloat();
		float display_price = sc.nextFloat();
		float rage_expenses = 0;

		int counterHeadset = 0;
		int counterMouse = 0;
		int counterKeyboard = 0;
		int counterDisplay = 0;
		int counter1=0;
		int counter2=0;
		boolean isSameGame1 = false;
		boolean isSameGame2 = false;
		
		for(int i=1; i<=lost_games_count; i++) {
			if(i%2==0) {
				counter1++;
				if(counter1==1) {
					counterHeadset++;
					counter1-=1;
					isSameGame1 = true;
				}
			}else {
				isSameGame1 = false;
			}
			if(i%3==0) {
				counter2++;
				if(counter2==1) {
					counterMouse++;
					counter2-=1;
					isSameGame2 = true;
				}
			}else {
				isSameGame2 = false;
			}
			if(isSameGame1==true && isSameGame2==true) {
				counterKeyboard++;
				if(counterKeyboard==2) {
					counterDisplay++;		
				}
			}
		}
		rage_expenses = (headset_price * counterHeadset) + (mouse_price * counterMouse) + (keyboard_price * counterKeyboard) + (display_price * counterDisplay);
				

		System.out.printf("Rage expenses: %.2f lv.",rage_expenses);
	}
}

	

