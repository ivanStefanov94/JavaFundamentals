package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream (scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Mort")){

        String [] command = input.split("\\s+");

        if(command[0].equals("Add")){
            int number = Integer.parseInt(command[1]);
            numbers.add(number);
        }
        else if (command[0].equals("Remove")){
            int remove = Integer.parseInt(command[1]);
            numbers.remove(Integer.valueOf(remove));


        }
        else if (command[0].equals("Replace")){
            int value = Integer.parseInt(command[1]);
            int replacement = Integer.parseInt(command[2]);
            for (int i = 0; i <= numbers.size()-1 ; i++) {
                int everyNumber = numbers.get(i);
                if (everyNumber == value){
                    numbers.set(numbers.indexOf(value), replacement);
                    break;
                }
            }
        }
        else if (command[0].equals("Collapse")){
            int value = Integer.parseInt(command[1]);

            for(int i=0;i<numbers.size();i++){
                if(numbers.get(i) < value) {
                    numbers.remove(i);
                    i--;
                }
                }
        }
        input = scan.nextLine();
        }
        for (Integer number : numbers) {

            System.out.printf("%d ", number);
        }
    }
}
