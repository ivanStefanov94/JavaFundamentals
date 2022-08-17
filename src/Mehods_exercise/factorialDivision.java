package Mehods_exercise;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());

        double result = calculateFactorial(number1) / calculateFactorial(number2);

        System.out.printf("%.2f", result);
    }

    private static double calculateFactorial(int number) {
        double fact = 1;
        for (double i = 1; i <= number ; i++) {
            fact = fact * i;
            
        }
        return fact;
    }
}
