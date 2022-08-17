package RegularExpressions_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String pattern = ">>(?<furnitureName>[A-Za-z]+)<<(?<Price>\\d+.?\\d*)!(?<quantity>\\d+)";
        //String pattern = ">>(?<furnitureName>[A-Za-z]+)<<(?<Price>\\d+.\\d+)!(?<quantity>\\d)";
        String input = scan.nextLine();

        Pattern regex = Pattern.compile(pattern);


        List<String> furniture = new ArrayList<>();
        double total = 0;

        while (!input.equals("Purchase")){

            Matcher matcher = regex.matcher(input);

            if(matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("Price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                total += price * quantity;

            }

            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");

        for (String furnitureType : furniture) {
            System.out.println(furnitureType);
        }
        System.out.printf("Total money spend: %.2f", total);

    }
}
