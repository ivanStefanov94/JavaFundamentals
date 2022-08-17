package TextProcessing_Exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] path = scan.nextLine().split("\\\\");
        String  last = path[path.length-1];
        String [] fileName = last.split("\\.");

        String name = fileName[0];
        String extension = fileName[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);

        }
    }

