
import java.util.Scanner;

<<<<<<< HEAD
public class Main {
    public static void question1(int a) {
        double res = Math.pow(2, a);
        String result = String.valueOf(res).substring(0, (String.valueOf(res)).length() - 2);
        if (res > 0 || res < Double.MAX_VALUE) {
            System.out.println("2^" + a + " = " + result);
        }
    }

    public static void question2(int a) {
        
    }

    public static void question3(int a) {
        System.out.println(fib(a));
    }

    public static int fib(int a) {
        if (a <= 1) return a;
        else return fib(a - 1) + fib(a - 2);
    }

=======
public class Main{
    public static void question1(int a ) {
        double res = Math.pow(2,a);
        String result = String.valueOf(res).substring(0, (String.valueOf(res)).length()-2);
        if(res>0 || res<Double.MAX_VALUE){
            System.out.println("2^"+a+" = "+result);
        }
    }
    public  static  void question2(int a) {
        //write Disha_homework_3
        double res = Math.pow(2,a);
        String result = String.valueOf(res).substring(0, (String.valueOf(res)).length()-2);
        if(res>0 || res<Double.MAX_VALUE){
            System.out.println("2^"+a+" = "+result);
        }
    }

    public static int question3(int a) {
        int fac=1;
		if(a==0)
			{return  1;}
		else
			{
            return(a*question3(a-1)); 
				}
    }
   
>>>>>>> Disha_homework_3
    public static void main(String[] args) {
        // write your code here
        while (true) {
            System.out.println("Please choose your option of calculation");
            System.out.println("1 2 or 3");
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
                    int total=question3(value);
                     System.out.println("\nThe factorial of "+value+" is: "+total);
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
