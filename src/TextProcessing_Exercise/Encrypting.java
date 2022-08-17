package TextProcessing_Exercise;

import java.util.Scanner;

public class Encrypting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        StringBuilder encryptedText = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            char crypt = text.charAt(i);
            int converter = (int) crypt + 3;
            char newCrypt = (char) converter;
            encryptedText.append(newCrypt);

            // encryptedText.append((char)crypt + 3)); //------> alternative solution
        }
        System.out.println(encryptedText.toString());
    }
}
