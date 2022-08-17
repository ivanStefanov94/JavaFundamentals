package AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> users = new LinkedHashMap<>();

        int commands = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < commands; i++) {
            String[] input = scan.nextLine().split(" ");
            String action = input[0];
            String user = input[1];

            if (input.length == 3) {
                String plate = input[2];

                if (action.equals("register")) {
                    if (!users.containsKey(user)) {
                        users.put(user, plate);
                        System.out.printf("%s registered %s successfully", user, plate);
                        System.out.println();
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s", users.get(user));
                        System.out.println();
                    }
                }
            }

            if (action.equals("unregister")) {
                if (users.containsKey(user)) {
                    users.remove(user);
                    System.out.printf("%s unregistered successfully", user);
                    System.out.println();

                } else {
                    System.out.printf("ERROR: user %s not found", user);
                    System.out.println();
                }
            }
        }

        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}