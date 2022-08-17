package FinalExamPreparation;

import java.util.Scanner;

public class TheImitationGame_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        StringBuilder decryptedMessage = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while(!input.equals("Decode")){

            String [] tokens = input.split("\\|");
            String command = tokens[0];

            if(command.equals("Move")){
                int numberOfLetters = Integer.parseInt(tokens[1]);
                if (numberOfLetters>0 && numberOfLetters<=decryptedMessage.length()){
                String substring = decryptedMessage.substring(0, numberOfLetters);
                decryptedMessage.delete(0, numberOfLetters);
                decryptedMessage.append(substring);}


            }else if(command.equals("Insert")){
                int index = Integer.parseInt(tokens[1]);
                if(!(index<0) && !(index > decryptedMessage.length())){
                String value = tokens[2];
                decryptedMessage.insert(index, value);}

            }else if(command.equals("ChangeAll")){
                String substring = tokens[1];
                String replacement = tokens[2];
                if (decryptedMessage.toString().contains(substring)){

                String replacedSubstring = decryptedMessage.toString().replace(substring, replacement);
                decryptedMessage.setLength(0);
                decryptedMessage.append(replacedSubstring);}

            }


            input = scan.nextLine();
        }
        System.out.printf("The decrypted message is: %s", decryptedMessage.toString());

    }
}

/*
Input:

zzHe
ChangeAll|z|l
Insert|2|o
Move|3
Decode

Output:
The decrypted message is: Hello
*/