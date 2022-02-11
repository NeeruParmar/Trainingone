package QuesVoteEligible;

public class Eligibilty {
	
	
	boolean IsEligibleToVote(String Citizen, int age) {
		
		if (Citizen=="Canadian" && age>=18) {
			return true;
		}
		
		else 
			return false;
	}

}
