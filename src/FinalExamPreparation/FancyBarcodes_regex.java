package FinalExamPreparation;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int number = Integer.parseInt(scan.nextLine());
        String barcodeRegex = "(@#+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)";


        Pattern barcodePattern = Pattern.compile(barcodeRegex);

        for (int i = 0; i < number ; i++) {
            String barcode = scan.nextLine();

            Matcher barcodeMatcher = barcodePattern.matcher(barcode);

            if (barcodeMatcher.find()){
                String product = barcodeMatcher.group("barcode");
                String productGroup = "";
                for (int j = 0; j < product.length()-1; j++) {
                    char currentSymbol = product.charAt(j);
                    if (Character.isDigit(currentSymbol)){
                        productGroup+=currentSymbol;
                    }
                }

                if(productGroup.equals("")){
                    System.out.println("Product group: 00");
                }else{
                    System.out.println("Product group: " + productGroup);
                }

            }else{
                System.out.println("Invalid barcode");
            }
        }
        }}

        /*
 3
@#FreshFisH@#
@###Brea0D@###
@##Che4s6E@##

Product group: 00 ---> 00 if there are no numbers in the word
Product group: 0 ---> 0 - the only number in the word
Product group: 46 --> 46 - the two numbers in the word

        */