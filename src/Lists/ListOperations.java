package Lists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream (scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while(!input.equals("End")){

            String [] command = input.split("\\s+");

            if (command[0].equals("Add")){
                int addNumber = Integer.parseInt(command[1]);
                numbers.add(addNumber);
            }else if(command[0].equals("Insert")){
                int addNumber = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                if (index>numbers.size()-1){
                    System.out.println("Invalid index");
                }else{
                    numbers.add(index, addNumber);
                }
            }else if(command[0].equals("Remove")){
                int removeNumberByIndex = Integer.parseInt(command[1]);

                if (removeNumberByIndex>numbers.size()-1){
                    System.out.println("Invalid index");
                }else{
                    numbers.remove(removeNumberByIndex);
                }
            }else if(command[1].equals("left")){
                int count = Integer.parseInt(command[2]);
                for (int i = 1; i <= count ; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNumber);

                }

            }else if(command[1].equals("right")){
                int count = Integer.parseInt(command[2]);
                for (int i = 1; i <= count ; i++) {
                    int lastNumber = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0, lastNumber);


            }}

            input = scan.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
/*
Input:
5 12 42 95 32 1
Insert  3 0
Remove 10
Insert 8 6
Shift right 1
Shift left 2
End

Output:
Invalid index
5 12 42 95 32 8 1 3

*/