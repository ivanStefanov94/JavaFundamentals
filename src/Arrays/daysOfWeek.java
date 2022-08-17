package Arrays;

import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {
        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());

        if(days>=1 && days<=7){
            System.out.println(day[days-1]);
        }else{
            System.out.println("Invalid Day!");
        }

    }
}
