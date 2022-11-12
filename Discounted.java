
public class Discounted extends Product {
	private double discount;

	public Discounted(String name, int price, int antal, double discount) {
		super(name, price, antal);
		this.discount = discount;
	
		
		
		
		
	}
	public double getnewPrice () {
		double newPrice =0;
		newPrice = price - ((price * discount) / 100);
		return newPrice;
		
	}
	
	
	
//	discountBox = (discount * 0.01) + discountBox;
//	return discountBox;
		
	
	
	
	

}
