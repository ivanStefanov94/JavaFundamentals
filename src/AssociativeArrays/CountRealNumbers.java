package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] nums = Arrays.stream(scan.nextLine().split(" "))
                        .mapToDouble(Double::parseDouble).toArray();

         Map<Double, Integer> count = new TreeMap<>();

        for (double number : nums) {
            if(!count.containsKey(number)){
                count.put(number, 0);
            }
            count.put(number, count.get(number)+ 1);
        }
        DecimalFormat df = new DecimalFormat("#.#######");

        for (Map.Entry<Double, Integer> entry : count.entrySet()) {
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

    }
}

/*
8 2 2 8 2
2 -> 3
8 -> 2
*/