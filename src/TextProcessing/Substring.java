package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String wordToRemove = scan.nextLine();
        String input = scan.nextLine();

        while (input.contains(wordToRemove)) {

            int beginIndex = input.indexOf(wordToRemove);
            int endIndex = beginIndex + wordToRemove.length();

            input = input.substring(0, beginIndex) + input.substring(endIndex);

        }
        System.out.println(input);

    }
}
