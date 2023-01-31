import java.util.Scanner;

public class TreasureHunt_010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] loots = sc.nextLine().split("\\|");
		// \\ се нарича escape-ване и ни дава възможност да използваме
		// символа |, а не оператора "или".
		String command = sc.nextLine();
		
		while(!command.equals("Yohoho!")) {
			String[] commandParts = command.split(" ");
			String commandName = commandParts[0]; //drop,loot,steal
			switch(commandName) {
			case "Loot":
				break;
			case "Drop":
				int dropIndex = Integer.parseInt(commandParts[1]);
				if(dropIndex<0 || dropIndex>=loots.length - 1) {
					//невалиден индекс
					break;
				}else {
					//валиден индекс
					String currentLoot = loots[dropIndex];
					//преместване наляво всички елементи след нашия.
					for(int leftIndex = dropIndex; leftIndex < loots.length-1; leftIndex++) {
						loots[leftIndex] = loots[leftIndex + 1];
					}
					//слагаме елемента за преместване
					loots[loots.length-1]=currentLoot;
				}
				break;
			case "Steal":
				break;
			}
			
			
			
			
			command = sc.nextLine();
		}
	}
}
