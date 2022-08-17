package Mehods_exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);

        printSymbols(firstSymbol, secondSymbol);

    }

    private static void printSymbols(int firstSymbol, int secondSymbol) {
        int firstConverter = (int) firstSymbol;
        int secondConverter= (int) secondSymbol;


        if (secondConverter>firstConverter)
            for (int i = firstConverter+1; i <= secondConverter - 1 ; i++) {
                System.out.print((char)i + " ");

            }
        else if (firstConverter>secondConverter){
            for (int i = secondConverter+1 ; i <= firstConverter-1; i++) {
                System.out.print((char)i + " ");
            }
        }

    }
}
