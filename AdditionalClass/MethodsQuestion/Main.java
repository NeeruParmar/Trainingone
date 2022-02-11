package MethodsQuestion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ques 1: Write a method named isEven that accepts an int argument. 
// The method should return true if the argument is even, or false otherwise. Call this method from main class and print the results.		

		EvenNum obj = new EvenNum();
		boolean isNumEven = obj.isEven(8);
		System.out.println("Given number is even " + isNumEven);

	}

}
