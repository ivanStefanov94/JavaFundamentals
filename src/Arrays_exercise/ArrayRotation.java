package Arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers= Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int countRotations = Integer.parseInt(scan.nextLine());


        for (int rotation = 1; rotation <= countRotations ; rotation++) {

            int firstNumber = numbers[0];

            for (int i = 0; i < numbers.length-1 ; i++) {
            numbers[i] = numbers[i+1];
            }

        numbers[numbers.length-1] = firstNumber;}

        for (int number : numbers) {
            System.out.print(number+ " ");
        }
    }

}
/*
Input:
51 47 32 61 21
2

Output:
32 61 21 51 47
*/