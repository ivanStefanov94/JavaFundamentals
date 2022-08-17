package AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> total = new LinkedHashMap<>();

        String resource = scan.nextLine();


        while (!resource.equals("stop")) {

            int quantity = Integer.parseInt(scan.nextLine());

            if (!total.containsKey(resource)) {
                total.put(resource, quantity);
            } else {
                total.put(resource, total.get(resource) + quantity);
            }
            resource = scan.nextLine();

        }
        for (Map.Entry<String, Integer> entry : total.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }

}
/*
gold
155
silver
10
copper
17
gold
15
stop

gold -> 170
silver -> 10
copper -> 17
*/