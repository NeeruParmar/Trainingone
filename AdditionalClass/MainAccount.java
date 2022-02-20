import java.util.Scanner;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("kavya", 1103, 1000.00);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter username");
		String userName = sc.next();
		System.out.println("Enter four digit secure PinCode");
		int pinCode = sc.nextInt();
		boolean validCredentials = account.isValidCredentials(userName, pinCode);
		if (validCredentials) {
			
				
			
			System.out.println("Welcome to your Account  " + account.getUserName());
			
			
			System.out.println("please select one of the options below: ");
			System.out.println("Press one for deposit two for withdrwal three for checking current balance");
			
			int choice= sc.nextInt();
		switch (choice) {
		case 1: 
			System.out.println("Enter the amount to be deposited");
			double amountToBeDeposit = sc.nextDouble();
			account.depositMoney(amountToBeDeposit);
			break;
		case 2:
			System.out.println(" Enter the amount to be withdrawn");
			double amountToBewithdwarn =sc.nextDouble();
			account.withDrawnAmt(amountToBewithdwarn);
			break;
		case 3: 
			System.out.println("total current Balance " + account.getBalance());
		
break;		

		}
		}	
			
		//cases, default and looppp do while 
		

			
			
			

	 else
	System.out.println("Please enter Valid username and Pincode");
		
			}	
}
	

