package Lists;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int biscuitsPerDayPerWorker = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int biscuitsByRivalFactory = Integer.parseInt(scan.nextLine());

        int totalBiscuitsPerDay = biscuitsPerDayPerWorker * workers;
        double everyThirdDay = totalBiscuitsPerDay*0.75;
        double tenDays75percent = (int)everyThirdDay * 10.0;

        double totalBiscuitsPerMonth = (20* totalBiscuitsPerDay) + tenDays75percent;

        if (totalBiscuitsPerMonth - biscuitsByRivalFactory > 0){
            double difference = totalBiscuitsPerMonth - biscuitsByRivalFactory;
            double percent = difference/biscuitsByRivalFactory *100;
            System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuitsPerMonth);
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        }else if (totalBiscuitsPerMonth - biscuitsByRivalFactory < 0) {
            double difference = biscuitsByRivalFactory - totalBiscuitsPerMonth;
            double percent = difference / biscuitsByRivalFactory * 100;

            System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuitsPerMonth);
            System.out.printf("You produce %.2f percent less biscuits.", percent);
        }else if (totalBiscuitsPerMonth == biscuitsByRivalFactory){
            System.out.println();
        }

            }
        }


