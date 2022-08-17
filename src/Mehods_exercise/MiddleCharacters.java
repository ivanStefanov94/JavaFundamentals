package Mehods_exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

       printMiddleCharacter(word);

        }

    private static void printMiddleCharacter(String word) {


        if (word.length()%2==1){
            System.out.println(word.charAt(word.length()/2));
        }
        else {
            System.out.print(word.charAt(word.length()/2-1));
            System.out.print(word.charAt(word.length()/2));
        }
}}

