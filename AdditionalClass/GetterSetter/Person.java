package GetterSetter;

public class Person {

	int height;
	int age;

	int getAge() {
		return age;
	}

	void setAge(int newAge) {
		age = newAge;
	}

	int gettHeight() {
		return height;
	}

	void setHeight(int newHeight) {
		height = newHeight;
	}

	
	boolean isEligibleForRides(int height, int age) {
		if (height >= 90 & height <= 200 && age >= 12 & age <= 60) {
			return true;
		}
		return false;

	}
}
