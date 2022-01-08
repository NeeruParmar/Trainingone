
public class QuestionTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ques 2: 
		
		int age = 20;
		
		String licenceType= "";
		String licenceCategory ="";
		
		if (age>=16) {
			if (licenceType.equals("")) { 
				licenceCategory = "G1";
			}else if (licenceType.equals("G1")) {
				licenceCategory = "G2";
			}else if  (licenceType.equals("G2")) {
				licenceCategory = "G";
			}else {
				System.out.println("invalid");
			}
			if (age >=16) {
			if (!licenceCategory.equals("")) {
				System.out.println("License Issued " + licenceCategory);
			}else {
				System.out.println("Not Eligible");
			}
		}
		}
	}
			
		
					}



