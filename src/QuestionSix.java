
public class QuestionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Question: 6
		double costOfProduct = 900;
		
		String promoCode ="Promo";
		double basicDiscountedValue = costOfProduct*0.5;
		double finalDiscountedValue = 0.0;
		
		if (promoCode.equals("null")) {
			finalDiscountedValue= basicDiscountedValue;
		}else if (promoCode.equals ("Promo5")) 	{
			finalDiscountedValue = (basicDiscountedValue - (basicDiscountedValue *0.5));
		}else if (promoCode.equals ("Promo10")) {
			finalDiscountedValue = basicDiscountedValue - (basicDiscountedValue *0.10);
		}else if (promoCode.equals ("Promo20")) {
			finalDiscountedValue = basicDiscountedValue - (basicDiscountedValue *0.20);
		}
			System.out.println(finalDiscountedValue);
  
  
	}

}

