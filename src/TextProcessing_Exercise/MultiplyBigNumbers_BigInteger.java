package TextProcessing_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumbers_BigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger bigNumber = new BigInteger(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());

        bigNumber = bigNumber.multiply(BigInteger.valueOf(number));

        System.out.println(bigNumber);
    }
}
