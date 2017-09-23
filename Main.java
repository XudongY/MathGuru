package XudongYu;

import java.util.Scanner;

public class Main {

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
                    int sum = 1;
                    for (int i = 0; i < value; i++) {
                        sum *= 2;
                    }
                    System.out.println(sum);
                    break;
                case 2:
                    int index = value;
                    for (int i = 0; i < index - 1; ++i) {
                        System.out.print(value-- + "*");
                    }
                    System.out.println(value);
                    break;
                case 3:
                    int[] fab = new int[21];
                    for (int i = 2; i <= 20; ++i) {
                        fab[0] = 1;
                        fab[1] = 1;
                        fab[i] = fab[i - 1] + fab[i - 2];
                    }
                    for (int i = 0; i < value; ++i) {
                        System.out.print(fab[i] + ",");
                    }
                    System.out.println(fab[value]);
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
