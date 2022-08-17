package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = Integer.parseInt(scan.nextLine());
        printTriangle(height);
    }

    private static void printTriangle(int height) {
        printTopHalf(height);
        printBottomHalf(height);
        }

    private static void printTopHalf(int height) {

        for (int row = 1; row <= height ; row++) {
            for (int count = 1; count <= row ; count++) {
                System.out.print(count  + " ");
            }
            System.out.println();
        }
    }
    private static void printBottomHalf(int height) {

        for (int row = height-1; row >=1 ; row--) {
            for (int count = 1; count <= row ; count++) {
                System.out.print(count  + " ");
            }
            System.out.println();
        }

    }
}
/*
vhod 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
