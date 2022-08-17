package Mehods_exercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        printVowelsCount(text.toLowerCase());

    }
    static void printVowelsCount(String text){
        int counter = 0;

        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);

            switch (currentSymbol){

                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                    counter ++;
                    break;
            }
        }
        System.out.println(counter);
    }
}
