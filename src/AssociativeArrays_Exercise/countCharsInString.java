package AssociativeArrays_Exercise;

import java.util.*;

public class countCharsInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letters = scan.nextLine();

        char [] chars = letters.toCharArray();

        Map<Character, Integer> letterMap = new LinkedHashMap<>();

        for (Character letter : chars) {
            if(!letterMap.containsKey(letter)){
                letterMap.put(letter, 0);
            }
            letterMap.put(letter, letterMap.get(letter)+1);
        }
        letterMap.remove(' ');
        for (Map.Entry<Character, Integer> characterIntegerEntry : letterMap.entrySet()) {

            System.out.printf("%s -> %d%n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
        }
    }
}
/*
text text text
t -> 6
e -> 3
x -> 3
*/