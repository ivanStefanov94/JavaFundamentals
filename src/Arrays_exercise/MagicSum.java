package Arrays_exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        int sum = Integer.parseInt(scan.nextLine());

        //първия For обхожда всички числа от първото
        for (int index = 0; index <= numbers.length-1 ; index++) {
            //взетото число от масива
            int number = numbers[index];
            //втория For обхожда всички числа след числото обходено в предишния цикъл
            for (int i = index+1; i <= numbers.length-1; i++) {
                if (index==i){
                    continue;
                }
                int number2 = numbers[i];
                if (number+number2==sum){
                    System.out.printf("%d %d%n", number, number2);
                }
            }
        }
    }
}

/*
Input:
1 7 6 2 19 23
8

Output:
1 7
6 2
*/
