package RegularExpressions_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        String regex = "(@(?<planetName>[A-Za-z]+)\\d?:(?<population>\\d+)!(?<command>[A-z])!->(?<soldierCount>\\d+))";
        int attackedCounter = 0;
        int destroyedCounter = 0;
        List<String> attackedPlanet = new ArrayList<>();
        List<String> destroyedPlanet = new ArrayList<>();



        for (int i = 0; i < number ; i++) {
            int counter = 0;
            String encryptedCommand = scan.nextLine();
            StringBuilder newCommand = new StringBuilder();

            for (int j = 0; j < encryptedCommand.length() ; j++) { //----------> counting all the star STAR characters
                char starChar = encryptedCommand.charAt(j);
                    if(starChar == 'a' || starChar == 'A' || starChar == 'S' ||
                            starChar == 's' || starChar == 'T' || starChar == 't'
                    || starChar == 'R' ||  starChar == 'r'){
                        counter++;
                    }

            }

            for (int j = 0; j < encryptedCommand.length() ; j++) { //-------> decreasing the character's ASCII number
                char reducedMessage = encryptedCommand.charAt(j);
                newCommand.append((char) (reducedMessage-counter));
            }
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(newCommand);

            if(matcher.find()){
                if(matcher.group("command").equals("A")){
                    attackedCounter++;
                    attackedPlanet.add(matcher.group("planetName"));
                }else if (matcher.group("command").equals("D")){
                    destroyedCounter++;
                    destroyedPlanet.add(matcher.group("planetName"));}

            }

            }
        for (String attacked : attackedPlanet) {



        System.out.println("Attacked planets: " + attackedCounter);
        System.out.println("-> " + attacked);
        }
        for (String destroyed : destroyedPlanet) {



        System.out.println("Destroyed planets: " + destroyedCounter);
        System.out.println("-> " + destroyed);}




            }

        }


/*
2
STCDoghudd4=63333$D$0A53333
EHfsytsnhf?8555&I&2C9555SR

Attacked planets: 1
-> Alderaa
Destroyed planets: 1
-> Cantonica

*/