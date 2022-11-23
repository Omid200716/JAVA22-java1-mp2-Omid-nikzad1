
public class Product {
	
	private final String name;
	public int price;
	private int antal;
	 
	
	public Product(String name, int price, int antal) {
		
		this.name = name;
		this.price = price;
		this.antal = antal;
	}
	
	
	void updateSystem() {
//		antal = antal -1;
		antal--;
		
	}
	

	
	
	int getantal() {
		return antal;
	}
	public void  setprice(int price2) {
		price=price2;
	}
	
	int getprice() {
		return price;
	}
	String getname() {
		return name;
	}

}
