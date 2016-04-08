//U10416020

import java.util.*;

public class TestNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		String number1 = input.next();
		String number2 = input.next();
		
		Number test = new Number(number1,number2);
		
		System.out.println("Enter the method to calculate (1)plus (2)subtract (3)multiply (4)divide:");
		int calculate = input.nextInt();
		System.out.println("Enter a scale(>=0): ");
		int scale = input.nextInt();
		
		System.out.println("Result: " + test.getCalculate(calculate,scale));
		
	}
}