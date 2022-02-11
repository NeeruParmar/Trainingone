package QuesVoteEligible;

public class Eligibilty {

	boolean isEligibleToVote(String citizen, int age) {

		if (citizen == "Canadian" && age >= 18) {
			return true;
		}

		else
			return false;
	}

}
