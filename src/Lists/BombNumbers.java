package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;


public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers=
                Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int[] bombs = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int specialNumber=bombs[0];
        int power=bombs[1];
        int sum=0;

        while (numbers.contains(specialNumber)){

            int index=numbers.indexOf(specialNumber);
            int left=Math.max(0,index-power);
            int right=Math.min(numbers.size()-1,index+power);

            for (int j = right; j >=left ; j--) {
                numbers.remove(j);
            }
        }
        for (Integer number : numbers) {
            sum+=number;
        }
        System.out.println(sum);

    }
}

/*
Input:
1 2 2 4 2 2 2 9
4 2

Output:
4 2
*/