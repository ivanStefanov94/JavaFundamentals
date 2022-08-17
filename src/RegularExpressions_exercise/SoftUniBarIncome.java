package RegularExpressions_exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "^%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$";

        Pattern pattern = Pattern.compile(regex);


       // Map<Double, List<String>> finalResult = new LinkedHashMap<>();


        String input = scan.nextLine();
        double total = 0;

        while(!input.equals("end of shift")){

            Matcher match = pattern.matcher(input);

            if(match.find()){

                String name = match.group("customerName");
                String product = match.group("product");
                int count = Integer.parseInt(match.group("count"));
                double price = Double.parseDouble(match.group("price"));
                double singleProductPrice = count*price;
                total += singleProductPrice;

                //finalResult.put(name, product singleProductPrice);
                //namesAndProducts.add(name+":"+product);
               // if(!finalResult.containsKey(singleProductPrice)){
                //    finalResult.put(singleProductPrice, new ArrayList<>());
               // }
                  //  finalResult.get(singleProductPrice).add(name+": "+product);

                System.out.printf("%s: %s - %.2f%n", name, product, singleProductPrice);

            }

            input = scan.nextLine();
        }

       // for (Map.Entry<Double, List<String>> entry : finalResult.entrySet()) {
        //    System.out.printf("%s - %.2f%n", entry.getValue(), entry.getKey());
       // }
        System.out.printf("Total income: %.2f", total );

    }
}

//%George%<Croissant>|2|10.3$
//%Peter%<Gum>|1|1.3$
//%Maria%<Cola>|1|2.4$
//end of shift

//[George: Croissant] - 20,60 -------> s Map
//[Peter: Gum] - 1,30
//[Maria: Cola] - 2,40
//Total income: 24,30

//------------------------------------ bez map
//George: Croissant - 20,60
//Peter: Gum - 1,30
//Maria: Cola - 2,40
//Total income: 24,30