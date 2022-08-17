package AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String products = scan.nextLine();

        Map<String, Double> totalPrice = new LinkedHashMap<>();
        Map<String, Integer> totalQuantity = new LinkedHashMap<>();

        while(!products.equals("buy")){

            String [] productPriceQuantity = products.split(" ");

            //productPriceQuantity [0] = "";
            double price = Double.parseDouble(productPriceQuantity[1]);
            int quantity = Integer.parseInt(productPriceQuantity[2]);


            if(!totalQuantity.containsKey(productPriceQuantity[0])){
                totalQuantity.put(productPriceQuantity[0], quantity);
            }else {
                totalQuantity.put(productPriceQuantity[0], totalQuantity.get(productPriceQuantity[0]) + quantity);
            }

            totalPrice.put(productPriceQuantity[0], price * totalQuantity.get(productPriceQuantity[0]));


            products = scan.nextLine();
        }

        for (Map.Entry<String, Double> entry : totalPrice.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
