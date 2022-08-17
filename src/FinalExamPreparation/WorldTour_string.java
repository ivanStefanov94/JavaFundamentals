package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder destinations = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();

        while (!input.equals("Travel")){

        String [] command = input.split(":");

        if(command[0].equals("Add Stop")){
            int startIndex = Integer.parseInt(command[1]);
            String city = command[2];

            if(!(startIndex<0) && !(startIndex >= destinations.length())){
            destinations.insert(startIndex, city);
            System.out.println(destinations.toString());}
            else{System.out.println(destinations.toString());}
        }
        else if(command[0].equals("Remove Stop")){
            int startIndex = Integer.parseInt(command[1]);
            int endIndex = Integer.parseInt(command[2]);

            if((!(startIndex<0) && !(startIndex >= destinations.length()) &&
                    (!(endIndex<0) && !(endIndex >= destinations.length())))){
            destinations.delete(startIndex, endIndex+1);
            System.out.println(destinations.toString());}
            else{System.out.println(destinations.toString());}
        }
        else if(command[0].equals("Switch")){
            String replacement = command[1];
            String replacedCity = command[2];

            if(destinations.toString().contains(replacement)){
                String newLocation = destinations.toString().replace(replacement, replacedCity);
                destinations.setLength(0);
                destinations.append(newLocation);
                System.out.println(destinations.toString());}
            else{System.out.println(destinations.toString());}

            }

            input = scan.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + destinations.toString());

    }
}

/*
Input:
Hawai::Cyprys-Greece
Add Stop:7:Rome
Remove Stop:11:16
Switch:Hawai:Bulgaria
Travel

Output:
Hawai::RomeCyprys-Greece
Hawai::Rome-Greece
Bulgaria::Rome-Greece
Ready for world tour! Planned stops: Bulgaria::Rome-Greece
* */