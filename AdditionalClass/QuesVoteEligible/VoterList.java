package QuesVoteEligible;

import java.util.Scanner;

public class VoterList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a method to check the eligiblitity to vote considering the criteria:
//Age must be greater than 18 ,Must be citizen		

		Eligibilty obj = new Eligibilty();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter what is the citizenship of the voter");
		String citizenship = sc.next();

		System.out.println("Enter what is the age  of the voter");
		int eligibleAge = sc.nextInt();
		boolean isCitizenEligible = obj.isEligibleToVote(citizenship, eligibleAge);

		System.out.println("Can the person vote " + isCitizenEligible);

	}

}
