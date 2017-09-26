
import java.util.Scanner;


public class Main{
    public static void question1(int a ) {
	    //write by yutong zhao
        double res = Math.pow(2,a);
        String result = String.valueOf(res).substring(0, (String.valueOf(res)).length()-2);
        if(res>0 || res<Double.MAX_VALUE){
            System.out.println("2^"+a+" = "+result);
        }
    }
  
    public static void question2(int a) {
	    //write by disha
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
	
    public  static  void question3(int a) {
	    //write by chenglin Wu
        System.out.println(fib(a));
    }

    public static int fib(int a) {
        if (a <= 1) return a;
        else return fib(a-1) + fib(a-2);
    }
    public static void main(String[] args) {
        // write your code here
        while (true) {
            System.out.println("Please choose your option of calculation");
            System.out.println("1 2 or 3");
            System.out.println("1.For example, when n = 3, the output is 8 ");
            System.out.println("2 For example, with input n = 5. For example, 5! = 5*4*3*2*1");
            System.out.println("3 For example fab(n) with input n = 8.  1, 1, 2, 3, 5, 8, 13, 21, 34");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            int value;
            while (true) {
                System.out.println("Please input your value");
                value = scanner.nextInt();
                if (value > 20 || value < 0) {
                    System.out.println("Please input value between 0 - 20");
                } else {
                    break;
                }
            }
            switch (option) {
                case 1:
                    question1(value);
                    break;
                case 2:
                    question2(value);
                    break;
                case 3:
                    question3(value);
                    break;
            }
            System.out.println("Do you want another calculation ?");
            System.out.println("yes or no");
            String choose = scanner.next();
            if (choose.equals("no")) {
                break;
            }
        }
    }
}
