package TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> bannedWords =Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String text = scan.nextLine();

        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)){

                String wordOfStars = "";
                for (int i = 0; i < bannedWord.length(); i++) {
                    wordOfStars+="*";
                }

                text = text.replace(bannedWord, wordOfStars );

            }

        }
        System.out.println(text);

    }
}

/*
Linux, Windows
It is not Linux, it is GNU/Linux. Linux is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/Linux! Sincerely, a Windows client
It is not *****, it is GNU/*****. ***** is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/*****! Sincerely, a ******* client

*/
