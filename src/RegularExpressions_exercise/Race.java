package RegularExpressions_exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List <String> racers =  Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        for (String racer : racers) {
            racersDistance.put(racer, 0);
        }

        String input = scan.nextLine();

        while(!input.equals("end of race")){

            String names = input.replaceAll("[^a-zA-Z]+", "");

            if(racersDistance.containsKey(names)){
                int sum = 0;
                String numberOnly= input.replaceAll("[^0-9]", "");
                for (int i = 0; i <numberOnly.length() ; i++) {
                    char number = numberOnly.charAt(i);
                    int newNumber = Character.getNumericValue(number);
                    sum+=newNumber;
                }
               racersDistance.put(names, racersDistance.get(names) + sum);
            }

            input = scan.nextLine();
        }

        List<String> firstThree = racersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));
    }
}

//George, Peter, Bill, Tom
//G4e@55or%6g6!68e!!@
//R1@!3a$y4456@
//B5@i@#123ll
//G@e54o$r6ge#
//7P%et^#e5346r
//T$o553m&6
//end of race

//1st place: George
//2nd place: Peter
//3rd place: Tom