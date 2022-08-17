package TextProcessing_Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(input.charAt(i));
            if (input.charAt(i) == '>') {
                i++;

                int bomb = input.charAt(i) - '0';
                int x = i;

                for (; x < i + bomb && x < input.length(); x++)
                    if (input.charAt(x) == '>') {
                        result.append('>');
                        x++;
                        bomb += (input.charAt(x) - '0') + 1;
                    }
                i = x - 1;
            }
        }
        System.out.println(result);
    }
}