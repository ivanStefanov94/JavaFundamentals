package Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream (scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

       while (!input.equals("end")){

           String command = input.split(" ")[0];
           int element = Integer.parseInt(input.split(" ")[1]);

           if(command.equals("Delete")){
               numbers.removeAll(Arrays.asList(element));
           }else if(command.equals("Insert")){
               int position = Integer.parseInt(input.split(" ")[2]);
               numbers.add(position, element);
           }

           input = scan.nextLine();
       }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}

/*
Input:
1 2 3 4 5 5 5 6
Delete 5
Insert 10 1
Delete 5
end

Output:
1 10 2 3 4 6
*/











