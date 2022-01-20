import java.util.Scanner;

public class QuestionThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] samsungBrand = { "S20", "S21", "FLIP3", "FOLD3" };
		String[] googleBrand = { "GooglePixel 6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
		String[] appleBrand = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone11mini"};
		String brandName = "samsungBrand,googleBrand, AppleBrand";
		String phoneModel = "";

		System.out.println("Enter Brand Name");
		brandName = sc.next();
		switch (brandName) {

		case "samsungBrand": {
			System.out.println("List of  Samsung Phone models:" + samsungBrand.length);

			for (int i = 0; i < samsungBrand.length; i++) {
				System.out.println(samsungBrand[i]);
				
			}
			System.out.println("phoneModel");

			phoneModel = sc.next();

			for (int i = 0; i < samsungBrand.length; i++) {
				if (phoneModel.equals(samsungBrand[i]))
					System.out.println("Product Found");
			}

		}
			break;
		case "googleBrand": {
			System.out.println("List of  Google Phone models:" + googleBrand.length);

			for (int i = 0; i < googleBrand.length; i++) {
				System.out.println(googleBrand[i]);
			}

		}
		System.out.println("phoneModel");

		phoneModel = sc.next();

		for (int i = 0; i < googleBrand.length; i++) {
			if (phoneModel.equals(googleBrand[i]))
				System.out.println("Product Found");
		}
		
			break;

		case "appleBrand": {
			System.out.println("List of  Apple Phone models:" + appleBrand.length);

			for (int i = 0; i < appleBrand.length; i++) {
				System.out.println(appleBrand[i]);
			}

			System.out.println("phoneModel");

			phoneModel = sc.next();

			for (int i = 0; i < appleBrand.length; i++) {
				if (phoneModel.equals(appleBrand[i]))
					System.out.println("Product Found");
				
			}

		}
			break;
			
			}
		
		}
	
}








	
