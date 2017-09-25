import java.io.*;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.print("Please enter an positive integer to calculate its factorial(n!) : ");
		int num=input.nextInt();
		if(num>20)
		{System.out.println("The number entered must be below 20. \n Would you "
				+ "like to try again? Enter Yes/No");
		Scanner option=new Scanner(System.in);
		String choice=option.nextLine().toLowerCase();
		
		if((choice.equals("yes")))
		{
			System.out.print("Please enter an positive integer to calculate its factorial(n!) : ");
			int number_second=input.nextInt();
			int total=factorial(number_second);
			System.out.println("\nThe factorial of "+num+" is: "+total);
		}
		else if (choice.equals("no"))
		{
			System.out.println("\nThank you. Have a great Day!");
			}
		}
		else {
			int total=factorial(num);
			System.out.println("\nThe factorial of "+num+" is: "+total);
		}
		
		
	}
		
	public static int factorial(int num)
	{int fac=1;
		if(num==0)
			{return  1;}
		else
			{return(num*factorial(num-1)); 
				}
		}
	}
