package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream (scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();


        while(!input.equals("end")){

            String [] command = input.split("\\s+");

            if (command.length == 2){
                int number = Integer.parseInt(command[1]);
                wagons.add(number);
            }else if (command.length == 1){
                int number = Integer.parseInt(command[0]);
                for (int i = 0; i <= wagons.size()-1; i++) {
                    int passengersInWagon = wagons.get(i);
                    if (passengersInWagon + number <= maxCapacity){
                        wagons.set(i, passengersInWagon + number);
                        break;
                    }
                    }
                }
            input = scan.nextLine();
            }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

        }

    }

/*
Input:
0 0 0 10 2 4
10
Add 10
10
10
10
8
6
end

Output:
10 10 10 10 10 10 10
*/