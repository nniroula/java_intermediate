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
    public String getCollege(){
        return "CU Denver";
    }
}

public class Inheritance extends Parent{
    public static void main(String []args){
        System.out.println("Inheritance in Java:-");

        // method from Parent class
        Parent pr = new Parent();
        System.out.println("Method call from parent class" + pr.getCollege());
    }
}
