package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * To run this program in CLI
 *  ->  javac -d . ReadAndWriteTextFile.java 
 *  -> java fileHandling.ReadAndWriteTextFile
 */

public class ReadAndWriteTextFile {
    public static void main(String[]args) throws FileNotFoundException{
        // write a separate class for handlind file and instantiate it here

        // Scanner Object
        Scanner console = new Scanner(System.in);

        // get user inputFile name
        System.out.print("Enter you input file name: ");
        String inputFileName = console.next();

        // get user outputFile name
        System.out.print("Enter output file name: ");
        String outputFileName = console.next();
       
        //create File object
        File inputFile = new File(inputFileName);

        // read the file data, write it to an output file
        //Scanner fileScanner = new Scanner(inputFile);
        PrintWriter outputFile= new PrintWriter(outputFileName);
        try{
            try (Scanner fileScanner = new Scanner(inputFile)) {
                while(fileScanner.hasNext()){
                    // write to an output file
                    outputFile.write(fileScanner.next() + "\n");
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Your file does not exist");
        }finally{
        // close resources
        console.close();
        outputFile.close();
        }
    }
}
