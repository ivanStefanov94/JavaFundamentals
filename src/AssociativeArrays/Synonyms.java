package AssociativeArrays;

import java.util.*;

public class Synonyms {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countOfPairs = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 0; i < countOfPairs ; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if(!synonymDictionary.containsKey(word)) {
                List<String> synonymsForCurrentWord = new ArrayList<>();
                synonymsForCurrentWord.add(synonym);

                synonymDictionary.put(word, synonymsForCurrentWord );
            }else{
                List<String> synonymsForCurrentWord = synonymDictionary.get(word);
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord );
            }
        }

        for (Map.Entry<String, List<String>> entry : synonymDictionary.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }

    }
}
/*
3
cute
adorable
cute
charming
smart
clever
cute -> [adorable, charming]
smart -> [clever]
*/
