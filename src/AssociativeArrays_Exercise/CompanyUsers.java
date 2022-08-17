package AssociativeArrays_Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        Map<String, List<String>> companyUsers = new TreeMap<>();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+->\\s+");
            String company = tokens[0];
            String users = tokens[1];
            if (!companyUsers.containsKey(company)) {
                companyUsers.put(company, new ArrayList<>());
            }
            if (!companyUsers.get(company).contains(users)) {
                companyUsers.get(company).add(users);
            }
            command = scan.nextLine();
        }
        companyUsers.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(users -> System.out.println("-- " + users));
        });

    }
}
