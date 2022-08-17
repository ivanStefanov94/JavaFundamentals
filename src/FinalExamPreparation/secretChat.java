package FinalExamPreparation;

import java.util.Scanner;

public class secretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while(!input.equals("Reveal")){
            String[] tokens = input.split(":\\|:");
            String type = tokens[0];

            if(type.equals("InsertSpace")){
                int index = Integer.parseInt(tokens[1]);
                builder.insert(index, " ");
                System.out.println(builder.toString());
            }else if(type.equals("Reverse")){
                String substring = tokens[1];
                if(builder.toString().contains(substring)){
                    String builderString = builder.toString();
                    builder.setLength(0);
                    builder.append(substring);
                    builder.reverse();
                    String reversed = builder.toString();
                    String cutString = builderString.replace(substring, "");
                    builder.setLength(0);
                    builder.append(cutString).append(reversed);
                    System.out.println(builder.toString());
                }else{
                    System.out.println("error");
                }

            }else if(type.equals("ChangeAll")){
                String substring = tokens[1];
                String replacement = tokens[2];

                String newString = builder.toString().replaceAll(substring, replacement);
                builder.setLength(0);
                builder.append(newString);
                System.out.println(builder.toString());

            }

            input = scan.nextLine();
        }

        System.out.printf("You have a new text message: %s",builder.toString());
    }
}
