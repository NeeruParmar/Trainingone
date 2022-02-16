package Constructor;

public class PartyDress {

	String dressColor;
	String dressSize;

	PartyDress() {

		System.out.println("Dress your two day function");
	}

	public PartyDress(String dressColor) {

		this.dressColor = dressColor;
	}

	public PartyDress(String dressColor, String dressSize) {

		this.dressColor = dressColor;
		this.dressSize = dressSize;
	}
}
