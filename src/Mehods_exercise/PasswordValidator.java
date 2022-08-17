package Mehods_exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        // 6 – 10 characters (inclusive);
        if (!validateLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        //•	Consists only of letters and digits
        if (!validateContent(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        //•	Have at least 2 digits
        if (!validateDigitsCount(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (validateLength(password) && validateDigitsCount(password) && validateContent(password)){
            System.out.println("Password is valid");
        }

    }


    private static boolean validateLength(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean validateContent(String password) {

        for (int i = 0; i <= password.length() - 1; i++) {

            char currentSymbol = password.charAt(i);
            boolean isSmallLetter = currentSymbol >= 97 && currentSymbol <= 122;
            boolean isCapitalletter = currentSymbol >= 65 && currentSymbol <= 90;
            boolean isNumber = currentSymbol >= 48 && currentSymbol <= 57;

            if (!isSmallLetter && !isCapitalletter && !isNumber){
                return false;
            }
        }

            return true;

    }

    static boolean validateDigitsCount (String password){
        int countDigits = 0;

        for (int i = 0; i <= password.length()-1; i++) {
            char currentSymbol = password.charAt(i);
            if (currentSymbol >= 48 && currentSymbol<= 57){
                countDigits++;
            }

        }

        if (countDigits>=2){
            return true;
        }else {
            return false;
        }
    }
}
