//U10416020

import java.math.*;

public class Number{
	//Data fields
	BigDecimal number1,number2;
	
	//Constructor
	Number(String newNumber1, String newNumber2){
		number1 = new BigDecimal(newNumber1);
		number2 = new BigDecimal(newNumber2);
	}
	
	//Accessor method to return the result
	String getCalculate(int check,int scale){
		String result = "";
		if(check == 1)
			result = String.valueOf(number1.add(number2));				
		else if(check==2)
			result = String.valueOf(number1.subtract(number2));
		else if(check==3)
			result = String.valueOf(number1.multiply(number2));
		else if(check==4)			
			result = String.valueOf(number1.divide(number2,scale,BigDecimal.ROUND_HALF_UP));
		else
			result = "ERROR";
		return result;
	}
}