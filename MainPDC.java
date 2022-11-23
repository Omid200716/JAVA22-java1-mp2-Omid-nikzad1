import java.util.Scanner;

public class MainPDC {

	public static void main(String[] args) {
		
	
		Product apple = new Product("Apple", 5, 12);		
		Product morot = new Product("Morot", 2, 7);		
		Discounted gurka = new Discounted ("Gurka", 10, 7, 0.98);
				gurka.getnewPrice();
				
		
		Customer c = new Customer();
		
		
		while (true) {

				System.out.println("--------------------- Välkommen till E-Handel butik-----------------------------\n");
				System.out.println("Du har 4 val: \n");
				System.out.println("1." + " köp " + gurka.getname() +"\t"+ gurka.getantal() + " St\t\t " +  gurka.getprice() + " SEK");
				System.out.println("2." +  " köp " + morot.getname() +"\t"+ morot.getantal()+ " St\t\t " + morot.getprice() + " SEK");
				System.out.println("3." +  " köp " + apple.getname() +"\t"+ apple.getantal() + " St\t\t " + apple.getprice() +" SEK\n");
				System.out.println("4. Lämna E-handel butiken! ");
	
			int meny;
				
				Scanner input = new Scanner(System.in);
				meny = input.nextInt();

					switch (meny) {
		
					case 1:
						
						
					
						c.addProduct();	
						c.addPriceProduct(gurka.getprice());
						gurka.updateSystem();	
//						c.addDiscountPris(gurka.getnewPrice());
						
						
//						System.out.println("\tAntal varor: " +c.getnumberP() + " Total pris: " + c.gettotalP()+"\n");
						break;
						
					case 2:
						
					
						c.addProduct();
						c.addPriceProduct(morot.getprice());
						morot.updateSystem();
//						System.out.println("\tAntal varor: " +c.getnumberP() + " Total pris: " + c.gettotalP());
						break;
						
					case 3:
						
						c.addProduct();
						c.addPriceProduct(apple.getprice());
						apple.updateSystem();
//						System.out.println("\tAntal varor: " +c.getnumberP() + " Total pris: " + c.gettotalP());
						break;
						
					case 4:
						System.out.print("Välkomen tillbaka \n");
						System.out.println("Totala köpt varor: " + c.getnumberP() + " Total pris: " + c.gettotalP() + " Kr " + "\n");
						
						System.exit(meny);
						

						

				
					
			}
		}
	
			
//		if (gurka.getantal() == 0 || morot.getantal() ==0|| apple.getantal()==0) {
//			System.out.println("Warning we dont have more gurka!\n");
//			break;
//		}
//		
//
//		
	
	
		
//		c.addProduct();
//		c.addProduct();
//		System.out.println(c.gettotalP());
//		c.addPriceProduct( morot.getprice());
//		c.addPriceProduct( gurka.getprice());
//		c.addPriceProduct(morot.getprice());
//		c.addPriceProduct(apple.getprice());
		
		
			

		
//			
//			c.nameP = "Gurka";			
//			c.addProduct();
//			c.addProduct();
//			c.addProduct();
//			c.addPriceProduct(gurka.getprice());
//			c.addPriceProduct(gurka.getprice());
//			c.addPriceProduct(gurka.getprice());
//			System.out.println(c.nameP + "\tAntal varor: " +c.getnumberP() + " Total pris: \t " + c.gettotalP());
//			System.out.println("___________________________________________________________________________________");
//			
//		
		
		
//		apple.updateSystem();
//		System.out.println(apple.getantal());
//		
//		
//		morot.updateSystem();
//		System.out.println(morot.getantal());
//		
//		
//		gurka.updateSystem();
//		System.out.println(gurka.getantal());
//		
	
		
		
//		Product ice = new Product("ice cold ice", 300, 20);

		
		
		
		
//		int answer;
//		System.out.println(" enter 1 or 2");
//		while ( true) {
//			
//			
//			
//			Scanner input = new Scanner(System.in);
//			Customer person = new Customer(10, 9);
//			
//			answer = input.nextInt(person.getleftP());
//			
//			
//			
//			
//			if ( answer == 1) {
//				person.getleftP();
//
//				person.showSaldo();
//				person.showBuy();
//				person.totalKöp();
//				
//				System.out.println( "You have " + person.getleftP() + " to left");
//				
//				
//			}
//			if ( answer == 2) {
//				System.out.println(" thank you for your wathe!");
//			}
//			
//			
//		}
			
			
		
		

	}

}
