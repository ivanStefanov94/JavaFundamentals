package AssociativeArrays_Exercise;

import java.util.*;


public class SoftUniExamResults_map {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String input = scan.nextLine();

                Map<String, Integer> userPoints = new HashMap<>();
                Map<String, Integer> languageCount = new HashMap<>();


                while(!input.equals("exam finished")){

                    String [] splittedArray = input.split("-");

                    String username = splittedArray[0];
                    if (splittedArray.length == 3){
                        String language = splittedArray[1];
                        int points = Integer.parseInt(splittedArray[2]);

                        if(!userPoints.containsKey(username)){
                            userPoints.put(username, points);
                        }else{
                            int currentPoints = userPoints.get(username);
                            if (points>currentPoints)
                            userPoints.put(username,  points);
                        }

                        if(!languageCount.containsKey(language)){
                            languageCount.put(language, 1);
                        }else{
                            languageCount.put(language, languageCount.get(language) + 1);
                        }

                    }else{
                        userPoints.remove(username);
                    }


                    input = scan.nextLine();
                }

                System.out.println("Results:");

                userPoints.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()  //--> сортира по числа и после ги обръща
                        .thenComparing(Map.Entry.comparingByKey()))          //--> сортира по имена, по азбучен ред, може и с TreeMap
                        .forEach(e-> System.out.println(e.getKey() + " | " + e.getValue() ));

                System.out.println("Submissions:");

                languageCount.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                        .forEach(e-> System.out.println(e.getKey() + " - " + e.getValue() ));
            }}
/*
Sorting by Key String and Value Integer - same map

Input:

Pesho-Java-84
Gosho-C#-70
Gosho-C#-84
Kiro-C#-94
exam finished

Output:

Results:
Kiro | 94
Gosho | 84
Pesho | 84
Submissions:
C# - 3
Java - 1

*/