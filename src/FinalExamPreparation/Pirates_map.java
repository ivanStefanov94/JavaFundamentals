package FinalExamPreparation;

import java.util.*;

public class Pirates_map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> peopleQuantity = new TreeMap<>();
        Map<String, Integer> goldQuantity = new TreeMap<>();

        String input = scan.nextLine();

        while(!input.equals("Sail")){

            String [] tokens = input.split("\\|\\|");
            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if(!peopleQuantity.containsKey(city)){
                peopleQuantity.put(city, population);
                goldQuantity.put(city, gold);
            }else{
                peopleQuantity.put(city, peopleQuantity.get(city) + population);
                goldQuantity.put(city, goldQuantity.get(city) + gold);
            }
            input = scan.nextLine();
        }

        String secondInput = scan.nextLine();
        while(!secondInput.equals("End")){
            String [] tokens = secondInput.split("=>");
            String command = tokens[0];
            String city = tokens[1];

            if (command.equals("Plunder")){
                int peopleKilled = Integer.parseInt(tokens[2]);
                int goldPlundered = Integer.parseInt(tokens[3]);
                int currentPopulation = peopleQuantity.get(city) - peopleKilled;
                int currentGold = goldQuantity.get(city) - goldPlundered;

                if(currentPopulation>=0 && currentGold>=0){
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, goldPlundered, peopleKilled);
                    peopleQuantity.put(city, currentPopulation);
                    goldQuantity.put(city, currentGold);
                    if(currentPopulation<=0 || currentGold <=0){
                        System.out.printf("%s has been wiped off the map!%n", city);
                        peopleQuantity.remove(city);
                        goldQuantity.remove(city);
                    }
                }

            }else if (command.equals("Prosper")){
                int gold = Integer.parseInt(tokens[2]);

                if(gold<0){
                    System.out.printf("Gold added cannot be a negative number!%n");
                }else{
                    int currentGold = goldQuantity.get(city) + gold;
                    goldQuantity.put(city, currentGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n"
                    , gold, city, currentGold);

                }
            }

            secondInput = scan.nextLine();
        }
        if(peopleQuantity.size()>0){
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", peopleQuantity.size());

        goldQuantity.entrySet().stream()
                .sorted((left, right)->right.getValue().compareTo(left.getValue()))
                .forEach(town ->{
                    System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", town.getKey(),
                            peopleQuantity.get(town.getKey()) ,town.getValue());
                });}
        else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}

/* Sorting by Key String and Value Integer - same Map
Input:

Nassau||95000||1000
San Juan||930000||1250
Campeche||270000||690
Port Royal||320000||1000
Port Royal||100000||2000
Sail
Prosper=>Port Royal=>-200
Plunder=>Nassau=>94000=>750
Plunder=>Nassau=>1000=>150
Plunder=>Campeche=>150000=>690
End

Output:

Gold added cannot be a negative number!
Nassau plundered! 750 gold stolen, 94000 citizens killed.
Nassau plundered! 150 gold stolen, 1000 citizens killed.
Nassau has been wiped off the map!
Campeche plundered! 690 gold stolen, 150000 citizens killed.
Campeche has been wiped off the map!
Ahoy, Captain! There are 2 wealthy settlements to go to:
Port Royal -> Population: 420000 citizens, Gold: 3000 kg
San Juan -> Population: 930000 citizens, Gold: 1250 kg
*/