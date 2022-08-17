package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam2_regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        String regex = "(\\W+|\\w+)>(?<numbers>[0-9]{3})\\|(?<lowerCase>[a-z]{3})\\|(?<upperCase>[A-Z]{3})\\|(?<symbols>[^<>]+)<\\1";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= number; i++) {
            String input = scan.nextLine();


            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                System.out.println("Password: " + matcher.group("numbers")+ matcher.group("lowerCase")
                + matcher.group("upperCase") + matcher.group("symbols"));
            }
            else{
                System.out.println("Try another password!");
            }
        }

    }
}
