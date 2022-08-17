package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int [n];
        // reading the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }
        // printing the numbers from last to first
        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
