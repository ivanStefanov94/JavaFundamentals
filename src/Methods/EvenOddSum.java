package Methods;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int even = getEven(Math.abs(number));
        int odd = getOdd(Math.abs(number));
        System.out.println(even * odd);

    }

    private static int getEven(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number%10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number = number / 10;
        }
        return evenSum;
    }

    private static int getOdd(int number) {
        int oddSum = 0;

        while (number > 0) {
            int digit = number%10;
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            number = number / 10;
        }
        return oddSum;

    }


}
