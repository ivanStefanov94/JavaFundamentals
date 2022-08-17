package FinalExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ThePianist_map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> composersMap = new HashMap<>();
        Map<String, String> keysMap = new HashMap<>();

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < number; i++) {
            String [] pieces = scan.nextLine().split("\\|");
            String piece = pieces[0];
            String composer = pieces[1];
            String key = pieces[2];

            composersMap.put(piece, composer);
            keysMap.put(piece, key);
        }
        String input = scan.nextLine();
        while(!input.equals("Stop")){
            String [] components = input.split("\\|");
            String command = components[0];
            String piece = components[1];

            if(command.equals("Add")){
                String composer = components[2];
                String key = components[3];

                if(!composersMap.containsKey(piece)){
                    composersMap.put(piece, composer);
                    keysMap.put(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }else{
                    System.out.printf("%s is already in the collection!%n", piece);
                }

            }else if(command.equals("Remove")){
                if(composersMap.containsKey(piece)){
                    composersMap.remove(piece);
                    keysMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            }else if(command.equals("ChangeKey")){
                String newKey = components[2];
                if(keysMap.containsKey(piece)){
                    keysMap.put(piece,newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }


            input = scan.nextLine();
        }
        composersMap.entrySet().stream()
                .sorted(Map.Entry.<String, String> comparingByKey() //-----> сравняване по Key v HashMap ---> String
                .thenComparing(Map.Entry.comparingByValue())) //-------> сравняване по Value v HashMap ---> String
                .forEach(e ->{
                    System.out.printf("%s -> Composer: %s, Key: %s%n", e.getKey(),e.getValue(),keysMap.get(e.getKey()));
                });

    }
}

/*Sorting by Key String and Value String - same Map
Input:
4
Eine kleine Nachtmusik|Mozart|G Major
La Campanella|Liszt|G# Minor
The Marriage of Figaro|Mozart|G Major
Hungarian Dance No.5|Brahms|G Minor
Add|Spring|Vivaldi|E Major
Remove|The Marriage of Figaro
Remove|Turkish March
ChangeKey|Spring|C Major
Add|Nocturne|Chopin|C# Minor
Stop

Output:

Spring by Vivaldi in E Major added to the collection!
Successfully removed The Marriage of Figaro!
Invalid operation! Turkish March does not exist in the collection.
Changed the key of Spring to C Major!
Nocturne by Chopin in C# Minor added to the collection!

Eine kleine Nachtmusik -> Composer: Mozart, Key: G Major
Hungarian Dance No.5 -> Composer: Brahms, Key: G Minor
La Campanella -> Composer: Liszt, Key: G# Minor
Nocturne -> Composer: Chopin, Key: C# Minor
Spring -> Composer: Vivaldi, Key: C Major
*/