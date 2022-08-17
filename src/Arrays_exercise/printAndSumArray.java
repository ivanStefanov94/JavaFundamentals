package Arrays_exercise;

import java.util.Scanner;

public class printAndSumArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagons = Integer.parseInt(scan.nextLine());
        int[] wagonsArray = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagonsArray.length ; i++) {
            wagonsArray[i] = Integer.parseInt(scan.nextLine());

            sum+=wagonsArray[i];
            System.out.print(wagonsArray[i] + " ");

        }
        System.out.printf("%n%d", sum);

    }
}
