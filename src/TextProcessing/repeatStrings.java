package TextProcessing;

import java.util.Scanner;

public class repeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String [] word = scan.nextLine().split(" ");

        for (String s : word) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s);
            }
        }

    }
}
