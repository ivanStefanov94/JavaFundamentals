package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String date = scan.nextLine();

        Pattern reg = Pattern.compile(regex);
        Matcher match = reg.matcher(date);

        while (match.find()){
            System.out.println("Day: " + match.group("day") + ", Month: " + match.group("month")
            + ", Year: " +match.group("year"));
        }
    }
}
