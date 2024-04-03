package fileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadAndWriteTextFile {
    public static void main(String[]args){
        // write a separate class for handlind file and instantiate it here

        // Scanner Object
        Scanner sc = new Scanner(System.in);

        // get user file
        System.out.print("Enter you input file name: ");
        String inputFileName = sc.next();

        //create File object
        File inputFile = new File(inputFileName);
        System.out.println();

    }
}
