package TextProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();



        while(!word.equals("end")){

            String reversed ="";
            for (int i = word.length()-1; i >= 0; i--) {

                reversed += word.charAt(i);

            }
            System.out.printf("%s = %s%n", word, reversed);
            word = scan.nextLine();
        }

    }
}
/*
helLo
Softuni
bottle
end
helLo = oLleh
Softuni = inutfoS
bottle = elttob
*/