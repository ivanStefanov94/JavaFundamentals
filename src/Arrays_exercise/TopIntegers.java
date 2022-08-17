package Arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbers.length-1; index++) {

            int number = numbers[index];

            if(index==numbers.length-1){
                System.out.print(number);
                break;
            }
            boolean isBigger= false;

            for (int i = index+1; i <= numbers.length-1 ; i++) {

                if(number>numbers[i]){
                    isBigger = true;
                }else{
                    isBigger = false;
                    break;
                }
            }
            if(isBigger){
                System.out.print(number+" ");
            }
        }

    }
}
/*
Input:
14 24 3 19 15 17

Output:
24 19 17
*/
