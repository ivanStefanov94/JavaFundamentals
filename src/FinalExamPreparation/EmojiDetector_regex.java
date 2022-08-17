package FinalExamPreparation;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String numberRegex = "(?<numbers>\\d+)";
        String emojiRegex = "([:]{2}|[*]{2})(?<emoji>[A-Z]{1}[a-z]{2,})\\1";
        Map<String, Integer> emojiStorage = new LinkedHashMap<>();

        Pattern numberPattern = Pattern.compile(numberRegex);
        Matcher numberMatcher = numberPattern.matcher(text);
        long coolThreshold = 1;
        int emojiCounter = 0;

        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(text);

        while (numberMatcher.find()){
            long bigNumber = Long.parseLong(numberMatcher.group("numbers"));
            while(bigNumber!=0) {  //-----------------> multiplies each digit in the string and save's it in coolThreshold
                long digit = bigNumber%10;
                coolThreshold*=digit;
                bigNumber = bigNumber/10;
            }
        }
        while(emojiMatcher.find()){
            emojiCounter++;
            String emoji  = emojiMatcher.group("emoji");
            int emojiCharacterSum = 0;
            for (int i = 0; i < emoji.length(); i++) { //-----------------> sums each character's ASCII value of an emoji and stores it in MAP emojiStorage
                char emojiChar = emoji.charAt(i);
                int emojiToInt = (int) emojiChar;
                emojiCharacterSum+=emojiToInt;

            }
            emoji = emojiMatcher.group(1)  + emoji + emojiMatcher.group(1);
            emojiStorage.put(emoji, emojiCharacterSum);
        }

        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiCounter);


        for (Map.Entry<String, Integer> entry : emojiStorage.entrySet()) {
            if (entry.getValue()>coolThreshold ){
                System.out.printf("%s%n", entry.getKey());


            }
        }
    }
}

/*
In the Sofia Zoo there are 311 animals in total! ::Smiley:: This includes 3 **Tigers**, 1 ::Elephant:, 12 **Monk3ys**, a **Gorilla::, 5 ::fox:es: and 21 different types of :Snak::Es::. ::Mooning:: **Shy**

Cool threshold: 540
4 emojis found in the text. The cool ones are:
::Smiley::
**Tigers**
::Mooning::
*/