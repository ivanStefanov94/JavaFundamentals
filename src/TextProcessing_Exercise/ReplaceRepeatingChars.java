package TextProcessing_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> characterList = new ArrayList<>();

        for (char c : input.toCharArray() ) {
            characterList.add(c);
        }
        for (int i = 1; i < characterList.size(); i++) {
            if (characterList.get(i - 1) == characterList.get(i)) {
                characterList.remove(i);
                i--;
            }
        }
        for (Character a : characterList) {
            System.out.print(a);
        }
    }
}