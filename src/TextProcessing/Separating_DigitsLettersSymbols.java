package TextProcessing;

import java.util.Scanner;

public class Separating_DigitsLettersSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();


        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
             char separated = input.charAt(i);

            if (Character.isDigit(separated)){
                digits.append(separated);
            }else if (Character. isLetter(separated)){
                letters.append(separated);
            }else{
                symbols.append(separated);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
        }
    }

/*
Agd#53Dfg^&4F53

53453
AgdDfgF
#^&
*/