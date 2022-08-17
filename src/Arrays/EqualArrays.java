package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //short version
        int[] firstArray = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        //long version

        String input = scan.nextLine();
        String[] splittedInput = input.split(" ");
        int[] secondArray = new int[splittedInput.length];
        for (int i = 0; i < splittedInput.length; i++) {
            secondArray[i] = Integer.parseInt(splittedInput[i]);
        }

        int sum = 0;
        boolean areIdentical = true;

        for (int i = 0; i < firstArray.length; i++) {
            sum+= firstArray[i];

            if (firstArray[i] != secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }
        if(areIdentical){
        System.out.printf("Arrays are identical. Sum: %d", sum);}

    }
}
