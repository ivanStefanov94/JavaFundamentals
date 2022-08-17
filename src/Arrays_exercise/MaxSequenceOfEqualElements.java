package Arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int i = 1; i <= array.length-1 ; i++) {
            if (array[i] == array[i -1]){
                length++;
            }else {
                length = 1;
                startIndex = i;
            }

            if (length >maxLength){
                maxLength = length;
                bestStartIndex = startIndex;
            }
        }
        for (int i = bestStartIndex; i < bestStartIndex + maxLength ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/*
Input:
1 1 1 2 3 1 3 3
Output:
1 1 1
*/