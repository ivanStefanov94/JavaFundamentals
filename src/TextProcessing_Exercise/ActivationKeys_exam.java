package TextProcessing_Exercise;

import java.util.Scanner;

public class ActivationKeys_exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while(!input.equals("Generate")){

            String[] commands = input.split(">>>");

            if(commands[0].equals("Contains")){
                String substring = commands[1];
                String activationKey = builder.toString();

                if(activationKey.contains(substring)){
                    System.out.printf("%s contains %s", activationKey, substring);
                }else{
                    System.out.println("Substring not found!");
                }

            }else if(commands[0].equals("Flip")){

                int startIndex = Integer.parseInt(commands[2]);
                int endIndex = Integer.parseInt(commands[3]);
                String slicedActivationKey = builder.substring(startIndex, endIndex);


                if(commands[1].equals("Upper")){
                    String transformToUpper = slicedActivationKey.toUpperCase();
                    builder.replace(startIndex, endIndex, transformToUpper);

                }else if(commands[1].equals("Lower")){
                    String transformToLower = slicedActivationKey.toLowerCase();
                    builder.replace(startIndex, endIndex, transformToLower);
                }
                System.out.println(builder.toString());

            }else if(commands[0].equals("Slice")){
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);

                builder.delete(startIndex,endIndex);

                System.out.println(builder.toString());
            }

            input = scan.nextLine();
        }

        System.out.println("Your activation key is " + builder.toString());
    }
}

/*
Input:
abcdefghijklmnopqrstuvwxyz
Slice>>>2>>>6
Flip>>>Upper>>>3>>>14
Flip>>>Lower>>>5>>>7
Contains>>>def
Contains>>>deF
Generate

Output:
134sf5ftuni2020rockz42
Substring not found!
Substring not found!
Substring not found!
134SF5FTuni2020rockz42
134SF5ftuni2020rockz42
Your activation key is 134SF5ftuni2020rockz42

*/