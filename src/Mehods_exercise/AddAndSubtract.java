package Mehods_exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        System.out.println(sumMethod(firstNumber, secondNumber)-thirdNumber);
    }

    private static int sumMethod(int firstNumber, int secondNumber) {

        return firstNumber+secondNumber;
    }
}
