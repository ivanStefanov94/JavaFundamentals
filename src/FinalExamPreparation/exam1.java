package FinalExamPreparation;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder email = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while(!input.equals("Complete")){

            String [] tokens = input.split(" ");

            if(tokens[0].equals("Make")){
                if(tokens[1].equals("Upper")){
                    String upperEmail = email.toString().toUpperCase();
                    email.setLength(0);
                    email.append(upperEmail);
                    System.out.println(email.toString());

                }else if(tokens[1].equals("Lower")){
                    String lowerEmail = email.toString().toLowerCase();
                    email.setLength(0);
                    email.append(lowerEmail);
                    System.out.println(email.toString());
                }
            }else if(tokens[0].equals("GetDomain")){
                int count = Integer.parseInt(tokens[1]);
                String extractDomain = email.substring(email.length()-count);
                System.out.println(extractDomain);
            }else if(tokens[0].equals("GetUsername")){
                if(email.toString().contains("@")){
                String [] mailArray = email.toString().split("@");
                String username = mailArray[0];
                    System.out.println(username);
                }else{
                    System.out.printf("The email %s doesn't contain the @ symbol.%n", email.toString());
                }

            }else if(tokens[0].equals("Replace")){
                String character = tokens[1];
                String newMail = email.toString().replace(character, "-");
                email.setLength(0);
                email.append(newMail);
                System.out.println(email.toString());

            }else if(tokens[0]. equals("Encrypt")){
                String encrypt = email.toString();
                for (int i = 0; i <= encrypt.length()-1; i++) {
                    char eachChar = encrypt.charAt(i);
                    int charToInt = (int) eachChar;
                    System.out.print(charToInt + " ");
                }
            }
            input = scan.nextLine();
        }

    }
}

/*
Mike123@somemail.com
Make Upper
GetDomain 3
GetUsername
Encrypt
Complete

*/