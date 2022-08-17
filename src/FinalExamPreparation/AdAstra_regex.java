package FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String regex = "([#|\\|])(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        Matcher secondMatcher = pattern.matcher(text);
        int calorieSum = 0;

        while(matcher.find()){
            int calories = Integer.parseInt(matcher.group("calories"));
            calorieSum+=calories;

        }
        int days = calorieSum/2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        if(days>0){
        while(secondMatcher.find()){
            String itemName = secondMatcher.group("itemName");
            String expirationDate = secondMatcher.group("expirationDate");
            String calories = secondMatcher.group("calories");

            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", itemName, expirationDate, calories);
        }}


        }

    }

/*
$$#@@%^&#Fish#24/12/20#8500#|#Incorrect#19.03.20#450|$5*(@!#Ice Cream#03/10/21#9000#^#@aswe|Milk|05/09/20|2000|

You have food to last you for: 9 days!
Item: Fish, Best before: 24/12/20, Nutrition: 8500
Item: Ice Cream, Best before: 03/10/21, Nutrition: 9000
Item: Milk, Best before: 05/09/20, Nutrition: 2000
*/
