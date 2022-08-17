package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String elements = scan.nextLine();

        String[] splitedString = elements.split(" ");

        for (int i = splitedString.length -1; i >= 0 ; i--) {
            System.out.print(splitedString[i] + " ");

        }
    }
}
