import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total_price = 0;
		String coin = sc.nextLine();
		
		while(!coin.equals("Start")){
			double coin_ = Double.parseDouble(coin);
			if(coin_ == 0.1 || coin_ == 0.2 || coin_ == 0.5 || coin_ == 1 || coin_ == 2) {
				total_price+=coin_;
			}else {
				System.out.printf("Cannot accept %.2f",coin_);
				System.out.println();
			}
			coin = sc.nextLine();
		}
		if(coin.equals("Start")) {
			String product = sc.nextLine(); 
			boolean flag = false;
			while(!product.equals("End")) {
				
				if(product.equals("Nuts")) {
					if(total_price>=2.0) {
						total_price-=2.0;
						System.out.println("Purchased "+product);
						flag = true;
					}else {
						System.out.println("Sorry, not enough money");
						flag = true;
					}
				}
				if(product.equals("Water")) {
					if(total_price>=0.7) {
						total_price-=0.7;
						System.out.println("Purchased "+product);
						flag = true;
					}else {
						System.out.println("Sorry, not enough money");
						flag = true;
					}
				}
				if(product.equals("Crisps")) {
					if(total_price>=1.5) {
						total_price-=1.5;
						System.out.println("Purchased "+product);
						flag = true;
					}else {
						System.out.println("Sorry, not enough money");
						flag = true;
					}
				}
				if(product.equals("Soda")) {
					if(total_price>=0.8) {
						total_price-=0.8;
						System.out.println("Purchased "+product);
						flag = true;
					}else {
						System.out.println("Sorry, not enough money");
						flag = true;
					}
				}
				if(product.equals("Coke")) {
					if(total_price>=1.0) {
						total_price-=1.0;
						System.out.println("Purchased "+product);
						flag = true;
					}else {
						System.out.println("Sorry, not enough money");
						flag = true;
					}
				}
				if(flag==false) {
					System.out.println("Invalid product");
					product = sc.next();
				}else {
					product = sc.next();
				}
			}
			if(product.equals("End")) {
				System.out.printf("Change: %.2f",total_price);
			}
		}
	}
}
