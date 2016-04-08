//U10416020

import java.util.*;

public class TestNumber{
	//Main method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Ask user to input two numbers
		System.out.println("Enter two numbers: ");
		String number1 = input.next();
		String number2 = input.next();
		
		//Create a object of Number
		Number test = new Number(number1,number2);
		
		//Ask user to choose the method to calculate the two numbers
		System.out.println("Enter the method to calculate (1)plus (2)subtract (3)multiply (4)divide:");
		int calculate = input.nextInt();
		
		//Ask user to input the scale
		System.out.println("Enter a scale(>=0): ");
		int scale = input.nextInt();
		
		//Display the result
		System.out.println("Result: " + test.getCalculate(calculate,scale));
		
	}
}