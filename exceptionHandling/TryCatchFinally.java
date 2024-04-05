package exceptionHandling;
/**
 * Compiel and execute the file in CLI
 *  -> javac -d . TryCatchFinally.java 
 *  -> java exceptionHandling.TryCatchFinally
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
  * NOTE: use finally block with try. Never use it after catch block.
    Put try - finally block inside try-catch block. The code here needs improvement.
  */

 class TryFinally{
    private int number;
    Scanner sc = new Scanner(System.in);
    
    public void getUserInput(){
        try{
            System.out.print("Enter a number: ");
            try{
                number = sc.nextInt();
                System.out.printf("Number is %d \n", number);
            }catch(InputMismatchException e){
                System.out.println("Invalid number! ");
            }
        }finally{ // this block runs even if there is an exception
            sc.close();
        }
    }
 }

public class TryCatchFinally {
    public static void main(String []args){
        TryFinally tfObject = new TryFinally();
        tfObject.getUserInput();
    }
}
