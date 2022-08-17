package FinalExamPreparation;

import com.sun.source.tree.Tree;

import java.util.*;

public class exam3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> collection = new TreeMap<>();

        String input = scan.nextLine();

        while(!input.equals("Statistics")){

            String [] tokens = input.split("->");
            String command = tokens[0];
            String username = tokens[1];

            if (command.equals("Add")){
                if(!collection.containsKey(username)){
                    collection.put(username, new ArrayList<>());
                }else{
                    System.out.printf("%s is already registered%n", username);
                }

            }else if (command.equals("Send")){
                String email = tokens[2];
                collection.get(username).add(email);

            }else if (command.equals("Delete")){
                if(!collection.containsKey(username)){
                    System.out.printf("%s not found!%n", username);
                }else{
                    collection.remove(username);
                }
            }
            input = scan.nextLine();
        }
        System.out.printf("Users count: %d%n", collection.size());

        collection.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .forEach(pair -> {
                    System.out.println(pair.getKey());
                    pair.getValue().forEach(el -> System.out.println(" - " + el));
                });

    }
}
/*  Sorting by count of List items in Value<List<String>>
Add->Mike
Add->George
Send->George->Hello World
Send->George->Some random test mail
Send->Mike->Hello, do you want to meet up tomorrow?
Send->George->It would be a pleasure
Send->Mike->Another random test mail
Statistics

Users count: 2
George
 - Hello World
 - Some random test mail
 - It would be a pleasure
Mike
 - Hello, do you want to meet up tomorrow?
 - Another random test mail

*/