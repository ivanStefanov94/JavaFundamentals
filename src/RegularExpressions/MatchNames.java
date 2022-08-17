package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b(?<firstName>[A-Z][a-z]+) (?<secondName>[A-Z][a-z]+)\\b";
        String names = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(names);

        while (matcher.find()){
            System.out.println(matcher.group("firstName") + " " + matcher.group("secondName"));
            //System.out.println(matcher.group("secondName"));

        }


    }
}
//Ivan Ivanov, Ivan ivanov, ivan Ivanov, IVan Ivanov, Test Testov, Ivan	Ivanov

//Ivan Ivanov
//Test Testov
