package DesignPatterns.FacadePattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class FacadePatternClient {
	public static void main(String[] args) throws Exception{
		int choice;
		do{
			System.out.println("========= Mobile Shop ============ ");
			System.out.println("1. IPHONE.");
			System.out.println("2. SAMSUNG.");
			System.out.println("3. BLACKBERRY.");
			System.out.println("4. Exit.");
			System.out.println("Enter your choice: ");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			choice =Integer.parseInt(br.readLine());
			
			ShopKeeper sk=new ShopKeeper();
			switch (choice) {
				case 1 -> {
					sk.iphoneSale();
				}
				case 2 -> {
					sk.samsungSale();
				}
				case 3 -> {
					sk.blackberrySale();
				}
				default -> {
					{
						System.out.println("Nothing You purchased");
					}
					return;
				}
			}
	  }while(true);
   }
}