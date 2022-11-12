
public class Customer {
   String nameP;
  private  int antalProdukter = 0;
  private int totalPrice = 0;
   double discountPriceNew = 0;
	
	
//	Customer(int antalProdukter, int totalPrice, String nameP) {
//
//	
//		this.antalProdukter = antalProdukter;
//		this.totalPrice = totalPrice;
//		this.nameP= nameP;
//	}
	
	void addProduct() {
		antalProdukter++;
	}
	
	void addPriceProduct(int price) {
		totalPrice = totalPrice +price;
	}
	
    void  addDiscountPris(double newPrice) {
		discountPriceNew = discountPriceNew + newPrice;
	}
	
	int getnumberP() {
		return antalProdukter;
	}
	
	
	int gettotalP() {
		return totalPrice;
	}
	
	double getdiscountPriceNew() {
		return discountPriceNew;
	}
	
	
	
	
//	void showSaldo () {
//		System.out.println("saldo to potatis " + leftP);
//	
//	}
//	
//	void showBuy () {
//		System.out.println("you buy potais " + totalP);
//	}
//	
//	
//	void totalKöp() {
//		leftP-=totalP;
//		
//	}
//	
//	int getleftP() {
//		return leftP;
//	}


//	void updateBuyItem() {
//		System.out.println(" update potatis " + buyItem);
//		buyItem -= leftP;
//	
		
//	}
//	
//	int buyP (int buyBox ) {
//		System.out.println("You buy" + buyItem);
//		return buyItem = buyItem - buyBox;  
//	}
//	
//	int justUpdate (int buyBox) {
//		System.out.println("update!" + buyBox);
//		return buyBox;
//	}
	
	
	


}
