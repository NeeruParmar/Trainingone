
import java.util.Scanner;

public class MainProduct {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("what are looking to buy");
		String itemSelected = sc.next();
		System.out.println("what is the cost of the item ");

		double costOfItem = sc.nextDouble();
		Product product = new Product(itemSelected, costOfItem);

		System.out.println("How many units you need ");

		product.setNumOfUnits(sc.nextInt());

		double showRoomCost = product.calculateTotalPrice(costOfItem, product.getNumOfUnits());

		System.out.println("Showroom Original Cost with no offers and discount " + showRoomCost);

		System.out.println("please provide if have the promocode");
		String PromoCode = sc.next();

		product.applyDiscount(showRoomCost, PromoCode);

	}

}
