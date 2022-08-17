package Arrays_exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words1 = scan.nextLine().split(" ");

        String[] words2 = scan.nextLine().split(" ");

        for (String word2 : words2) {
            for (String word1 : words1) {
                if(word2.equals(word1)){
                    System.out.print(word1 + " ");
                }
            }
        }
    }
}
// Input:
//Hey hello 2 4
//10 hey 4 hello

//Output:
//4 hello
