
import java.util.Scanner;

public class CS_555_homework_3_version_2 {
   
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
		System.out.print("Please enter an positive integer to calculate its factorial(n!) : ");
		int num=input.nextInt();
    	 int i,fact=1;  
    	   
    	  for(i=1;i<=num;i++){    
    	      fact=fact*i;    
    	  }    
    	  System.out.println("Factorial of "+num+" is: "+fact);    
    	 }  
    }

