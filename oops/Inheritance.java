package oops;
/*
 * To run this program:
 *      -> javac -d . Inheritance.java
 *      -> java oops.Inheritance
 */
/*
 * use extedns keyword for inheritance
 * learn to use super(). It should be first line of code in child class constructor
 */

class Parent{
    // make this method static to call it main method
    public static String getCollege(String name){
        return name;
    }
}

public class Inheritance extends Parent{
    public static void main(String []args){
        System.out.println("Inheritance in Java:-");

        // method from Parent class
        System.out.println("Method call from parent class - " + getCollege("MSU Denver"));
    }
}
