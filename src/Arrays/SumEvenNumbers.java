package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        String numbers = scan.nextLine();
        String[] splitted = numbers.split(" ");

        int[] intArray = Arrays.stream(splitted).mapToInt(Integer::parseInt).toArray();

        for (int newNumber : intArray) {
            if (newNumber%2 == 0){
                sum+=newNumber;
            }
        }
        System.out.println(sum);
    }
}
