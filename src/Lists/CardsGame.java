package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> player1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> player2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumPlayer1 = 0;
        int sumPlayer2 = 0;


        while (player1.size() > 0 && player2.size() > 0) {

            int currentPlayer1 = player1.get(0);
            int currentPlayer2 = player2.get(0);

            if (currentPlayer1 > currentPlayer2) {
                player1.remove(Integer.valueOf(currentPlayer1));
                player1.add(currentPlayer1);
                player1.add(currentPlayer2);
                player2.remove(Integer.valueOf(currentPlayer2));

            } else if (currentPlayer1 < currentPlayer2) {
                player2.remove(Integer.valueOf(currentPlayer2));
                player2.add(currentPlayer2);
                player2.add(currentPlayer1);
                player1.remove(Integer.valueOf(currentPlayer1));

            } else {
                player1.remove(Integer.valueOf(currentPlayer1));
                player2.remove(Integer.valueOf(currentPlayer2));

            }
            if (player1.size() == 0) {
                for (int i = 0; i <= player2.size() - 1; i++) {
                    int current = player2.get(i);
                    sumPlayer2 += current;
                }
                System.out.printf("Second player wins! Sum: %d", sumPlayer2);
                break;

            } else if (player2.size() == 0) {
                for (int i = 0; i <= player1.size() - 1; i++) {
                    int current = player1.get(i);
                    sumPlayer1 += current;
                }
                System.out.printf("First player wins! Sum: %d", sumPlayer1);
                break;
            }
        }
    }
}

/*
Input:
20 30 40 50
10 20 30 40

Output:
First player wins! Sum: 240
*/

/*
Input:
10 20 30 40 50
50 40 30 30 10

Output:
Second player wins! Sum: 50
*/