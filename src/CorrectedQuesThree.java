import java.util.Scanner;

public class CorrectedQuesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] samsung = { "S20", "S21", "FLIP3", "FOLD3" };
		String[] google = { "GooglePixel 6", "GooglePixel 6 Pro", "GooglePixelPro", "GooglePixel 5" };
		String[] apple = { "Iphone12", "Iphone12 mini", "Iphone11", "Iphone11 mini" };

		boolean isProductFound = false;
		
		System.out.println("Enter Brand Name");
		String brandName = sc.nextLine(); // replaced with nextline.
		switch (brandName) {

		case "samsung": {
		System.out.println("List of  Samsung Phone models:" + samsung.length);

		for (int i = 0; i < samsung.length; i++) {
		System.out.println(samsung[i]);

		}
		System.out.println("Enter Product from the List");

		String phoneModel = sc.nextLine();// replaced with nextline.

		for (int i = 0; i < samsung.length; i++) {
		if (phoneModel.equals(samsung[i])) { 
		System.out.println("Product Found");
		isProductFound = true;
		} 
		}

		}
		break;
		case "google": {
		System.out.println("List of  Google Phone models:" + google.length);

		for (int i = 0; i < google.length; i++) {
		System.out.println(google[i]);
		}

		
		System.out.println("Enter Product from the List");

		String phoneModel = sc.nextLine();
		for (int i = 0; i < google.length; i++) {
		if (phoneModel.equals(google[i])) { 
		System.out.println("Product Found");
		isProductFound = true;
		} 
		}
		} 

		break;

		case "apple": {
		System.out.println("List of  Apple Phone models:" + apple.length);

		for (int i = 0; i < apple.length; i++) {
		System.out.println(apple[i]);
		}

		System.out.println("Enter Product from the List");

		String phoneModel = sc.nextLine();
		for (int i = 0; i < apple.length; i++) {
		if (phoneModel.equals(apple[i])) {
		System.out.println("Product Found");
		isProductFound = true;
		} 
		}
		}
		break;
		default:
		System.out.println("Invalid Brand ");
		
		}

		if (isProductFound == false) {
		System.out.println("Please select a product from the list");	

	}

	}
}
