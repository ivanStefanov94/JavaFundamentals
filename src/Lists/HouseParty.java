package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int commandCount = Integer.parseInt(scan.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 1; i <= commandCount ; i++) {
            String command = scan.nextLine();

            String [] tokens = command.split("\\s+");

            String name = tokens[0];

            if (tokens[2].equals("going!")){
                if(guests.contains(name))
                    System.out.println(name + " is already in the list!");
                else{
                    guests.add(name);
                }

            }else if(tokens[2].equals("not")){
                if (!guests.contains(name)){
                    System.out.println(name + " is not in the list!");
                }else{
                    guests.remove(name);
                }

            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
/*
Input:
4
Allie is going!
George is going!
John is not going!
George is not going!

Output:
John is not in the list!
Allie
*/