package RegularExpressions_exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex =
         "(?<user>[A-Za-z0-9]+.?-?_?[A-Za-z0-9]+)@(?<host>[a-z]+-?.?[a-z]+\\.[a-z]+[\\.a-z]+)\\b";
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group("user") + '@' + matcher.group("host"));
        }
    }
}

//Many users @ SoftUni confuse email addresses. We @ Softuni.BG provide high-quality training @ home or @ class. –- steve.parker@softuni.de.
//steve.parker@softuni.de

//Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information.
//s.miller@mit.edu
//j.hopking@york.ac.uk