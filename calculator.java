import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args)
	{
		
		double num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Enter the operation to be performed (+,-,*,/)");

		char operation = sc.next().charAt(0);

		double result = 0;

		switch (operation) {

		// case to add two numbers
		case '+':

			result = num1 + num2;

			break;

		// case to subtract two numbers
		case '-':

			result = num1 - num2;

			break;

		// case to multiply two numbers
		case '*':

			result = num1 * num2;

			break;

		// case to divide two numbers
		case '/':

			result = num1 / num2;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");
		System.out.println();
		System.out.println(num1 + " " + operation + " " + num2
						+ " = " + result);
	}
}
