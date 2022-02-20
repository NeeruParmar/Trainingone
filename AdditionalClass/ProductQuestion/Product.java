package ProductQuestion;

public class Product {

	String productName;
	double unitPrice;
	int numOfUnits;
	double totalPrice;
	String promoCode = "";

	public Product(String productName, double unitPrice) {

		this.productName = productName;
		this.unitPrice = unitPrice;
	}

	public int getNumOfUnits() {
		return numOfUnits;
	}

	public void setNumOfUnits(int numOfUnits) {
		this.numOfUnits = numOfUnits;
	}

//methods
	double calculateTotalPrice(double unitPrice, int numOfUnits) {
		totalPrice = unitPrice * numOfUnits;
		return totalPrice;
	}

	void applyDiscount(double totalPrice, String promoCode) {
		if (promoCode.equals("")) {
			double finalDiscountedValue = totalPrice;
			System.out.println("cost with no  promo code" + finalDiscountedValue);
		} else if (promoCode.equals("save10")) {
			double finalDiscountedValue = totalPrice - 10;
			System.out.println("Cost after applying promocode" + finalDiscountedValue);
		} else if (totalPrice >= 50) {
			double finalDiscountedValue = totalPrice - totalPrice * 0.10;
			System.out.println("cost if no promocode with more than 50 dollar cost  " + finalDiscountedValue);
		} else {
			System.out.println("cost if no promocode and less then 50 dollar then  " + totalPrice);
		}

	}
	// return double finalDiscountedValue;

}
