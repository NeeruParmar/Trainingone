package GetterSetter;
import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person person = new Person();

		System.out.println("Enter age");
		int newAge = sc.nextInt();
		person.setAge(newAge);
		System.out.println("The age is " + person.getAge());

		System.out.println("Enter height");
		int newheight = sc.nextInt();
		person.setHeight(newheight);
		System.out.println("The height in cm is  " + person.gettHeight());

		boolean eligibleForRide = person.isEligibleForRides(newheight, newAge);

		System.out.println("is permit allowed for taking rides " + eligibleForRide);

	}

}
