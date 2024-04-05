package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * When you use a throws keyword in method defintion, you must handle the thrown excpetion
 * in the method that calls this method with throws keyword.
 */

class Throws{
    private String fileName;
    /**
     * NOTE: caller fo this method(main method) should handle the exception occured due to throws keyword
     * @return
     * @throws FileNotFoundException
     */
    public String getFileName() throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        
        try{
            System.out.print("Enter a file name: ");
            String inputFile = console.next();
            // file constructor takes fileName as a required parameter
            File fileObject = new File(inputFile);

            // read the file, throws file not found exception if file does not exist in right directory
            Scanner fileRead = new Scanner(fileObject);
            while(fileRead.hasNext()){
                String text = fileRead.next();
            }
            fileRead.close();
       }finally{
            console.close();
       }
        return fileName;
    }

    // throw with new operator
    public int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int newNumber = sc.nextInt();
        // this thrown excpetion must be handled by an exceptional handler
        if(newNumber < 0){
            throw new IllegalArgumentException("Cannot have negative number input");
        }
        //sc.close();
        return newNumber;
    }
}


public class ThrowAndThrows {
    public static void main(String[]args) {
        System.out.println(" throw and throws keyword in java ...");

        // instantiate throws class
        Throws throwsObj = new Throws();

        // handle the exception thrown by getFileName method
        /* 
        try{
            String file = throwsObj.getFileName();
            System.out.println(file);
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
        */

        // above try catch block is commented b/c once exception is thrown, it does not executed remaining lines of code
        //getNumber method
        try{
            System.out.printf("Your number = %d", throwsObj.getNumber());
            System.out.println();
        }catch(IllegalArgumentException e){
            System.out.println("Number input must be greater than 0");
        }catch(InputMismatchException e){
            System.out.println("Your input must be a number");
        }
    }
}
