package Constructor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Dress of color");
		String dressColor1 = sc.next();

		System.out.println("Enter second Dress of color");
		String dressColor2 = sc.next();

		System.out.println("Enter second  Dress size");
		String dressSize = sc.next();
		PartyDress obj2 = new PartyDress("dressColor");
		PartyDress obj3 = new PartyDress("dressColor", "dressSize");

		if (dressColor1.equals(dressColor2))
			System.out.println("customer will buy both dress");
		else
			System.out.println("customer will come againwhen same color dress are avaible");

	}

}
