package FinalExamPreparation;

import java.util.Scanner;

public class PasswordReset_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        String input = scan.nextLine();

        StringBuilder newPassword = new StringBuilder();

        while(!input.equals("Done")){

            String [] command = input.split(" ");

            if (command[0].equals("TakeOdd")){
                char takeOdd = ' ';
                for (int i = 1; i < password.length() ; i+=2) {
                    takeOdd = password.charAt(i);
                    newPassword.append(takeOdd);
                    }
                System.out.println(newPassword.toString());

            }else if(command[0].equals("Cut")){
                int index = Integer.parseInt(command[1]);
                int length = Integer.parseInt(command[2]);

                if((!(index<0) && !(index >= password.length()) &&
                        (!(length<0) && !(length >= password.length())))){

                    newPassword.delete(index, index+length);
                    System.out.println(newPassword);
                }

            }else if(command[0].equals("Substitute")){
                String match = command[1];
                String replacement = command[2];
                if(newPassword.toString().contains(match)){
                    String substitutePassword = newPassword.toString().replace(match, replacement);
                    newPassword.setLength(0);
                    newPassword.append(substitutePassword);
                    System.out.println(newPassword.toString());
                }else{
                    System.out.println("Nothing to replace!");
                }
            }
            input = scan.nextLine();
        }
        System.out.printf("Your password is: %s", newPassword.toString());
    }
}
/*
Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr
TakeOdd
Cut 15 3
Substitute :: -
Substitute | ^
Done

icecream::hot::summer
icecream::hot::mer
icecream-hot-mer
Nothing to replace!
Your password is: icecream-hot-mer
*/