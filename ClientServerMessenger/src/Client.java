import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		ArrayList<String> fish = new ArrayList<>(Arrays.asList("Cod", "Crab", "Lobster"));
		ArrayList<String> soups = new ArrayList<>(Arrays.asList("Chichen", "Tomato", "French-Onion", "Bubinka s domati"));
		ArrayList<String> BBQ = new ArrayList<>(Arrays.asList("Pork", "Rabbit", "Vegetables"));
		Socket socket = null;
		InputStreamReader inputStreamReader = null;
		OutputStreamWriter outputStreamWriter = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		float bill = 0;
		
		try {
			socket = new Socket("localhost", 4567);
			
			inputStreamReader = new InputStreamReader(socket.getInputStream());
			outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
			
			bufferedReader = new BufferedReader(inputStreamReader);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Avaiable commands: order/bill");
				String commandToSend = sc.nextLine();
				bufferedWriter.write(commandToSend);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				System.out.println("Server: " +bufferedReader.readLine());
				switch(commandToSend) {
				case "order":
					System.out.println("What would you like to order?");
					System.out.println("We have fish,soups,BBQ");
					String answer = sc.nextLine();
					String order;
					bufferedWriter.write(answer);
					bufferedWriter.newLine();
					bufferedWriter.flush();
					System.out.println("Server: " +bufferedReader.readLine());
					if(answer.equals("fish")) {
						System.out.println(fish);
						order = sc.nextLine();
						bufferedWriter.write(order);
						bufferedWriter.newLine();
						bufferedWriter.flush();
						switch(order) {
						case "Cod":
							System.out.println("You ordered Cod");
							bill+=12.50;
							break;
						case "Crab":
							System.out.println("You ordered Crab");
							bill+=10.39;
							break;
						case "Lobster":
							System.out.println("You ordered Lobster");
							bill+=13;
							break;
						default:
							System.out.println("We don't have that!");
							break;
						}
						System.out.println("Server: " +bufferedReader.readLine());
					}
					if(answer.equals("soups")) {
						System.out.println(soups);
						order = sc.nextLine();
						bufferedWriter.write(order);
						bufferedWriter.newLine();
						bufferedWriter.flush();
						switch(order) {
						case "Chicken":
							System.out.println("You ordered Chicken soup");
							bill+=4.90;
							break;
						case "Tomato":
							System.out.println("You ordered Totamo soup");
							bill+=3.50;
							break;
						case "French-Onion":
							System.out.println("You ordered French-Onion soup");
							bill+=4;
							break;
						case "Bubinka s domati":
							System.out.println("You ordered Bubinka s domati <3");
							bill+=5000000;
							break;
						default:
							System.out.println("We don't have that!");
							break;
						}
						System.out.println("Server: " +bufferedReader.readLine());
					}
					if(answer.equals("BBQ")) {
						System.out.println(BBQ);
						order = sc.nextLine();
						bufferedWriter.write(order);
						bufferedWriter.newLine();
						bufferedWriter.flush();
						switch(order) {
						case "Pork":
							System.out.println("You ordered Pork");
							bill+=6.90;
							break;
						case "Rabbit":
							System.out.println("You ordered Rabbit");
							bill+=8.50;
							break;
						case "Vegetables":
							System.out.println("You ordered Grilled Vegetables");
							bill+=5;
							break;
						default:
							System.out.println("We don't have that!");
							break;
						}
						System.out.println("Server: " +bufferedReader.readLine());
					}
					break;
				case "bill":
					System.out.println("You ordered the bill");
					System.out.println("Total price: "+bill);
					bill=0;
					break;
				}
				if(commandToSend.equalsIgnoreCase("BYE")) {
					System.out.println("You interupted the connection with the server!");
					break;
				}
			}
		
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(socket!=null) {
					socket.close();
				}
				if(inputStreamReader !=null) {
					inputStreamReader.close();
				}
				if(outputStreamWriter !=null) {
					outputStreamWriter.close();
				}
				if(bufferedReader !=null) {
					bufferedReader.close();
				}
				if(bufferedWriter !=null) {
					bufferedWriter.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

