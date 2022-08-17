package Arrays_exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        String[] arr1 = new String[num];
        String[] arr2 = new String[num];

        for (int i = 0; i < num; i++) {

            String[] input = scan.nextLine().split("\\s+");

            String firstElement = input[0];
            String secondElement = input[1];

            if(i%2 == 0){
                arr1[i] = firstElement;
                arr2[i] = secondElement;
            }else{
                arr2[i] = firstElement;
                arr1[i] = secondElement;
            }
        }

        System.out.println(String.join(" ", arr1));
        System.out.println(String.join(" ", arr2));
    }
}

/*
Input:
4
1 5
9 10
31 81
41 20

Output:
1 10 31 20
5 9 81 41

*/