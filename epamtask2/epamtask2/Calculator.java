package epamtask2;
/* program to demonstrate simple calculator using JUnit test Cases*/
/*@author Madhavi*/
public class Calculator {

	/* method to perform addition of 3 numbers*/
	public double addition_method(double number1,double number2,double number3)
	{
		return(number1+number2+number3);
	}
	/* method to perform multiplicatin of two numbers*/
	public double multiplication_method(double number1,double number2)
	{
		return(number1*number2);
	}
	/* method to perform division of 2 numbers and throws exception if any number is divided by zero*/
	public int division_method(int number1,int number2)
	{ 
		if (number2 == 0) {
		    throw new ArithmeticException("Divide by zero error");
		}
		return(number1/number2);
	}
}
