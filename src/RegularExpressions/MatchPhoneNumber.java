package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String phoneNumber = scan.nextLine();
        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern reg = Pattern.compile(regex);
        Matcher match = reg.matcher(phoneNumber);

        while (match.find()){
            System.out.print(match.group() + ", ");
        }
    }
}

//+359 2 222 2222,359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222, +359-2-222-222, +359-2-222-22222 +359-2-222-2222
//+359 2 222 2222, +359-2-222-2222,