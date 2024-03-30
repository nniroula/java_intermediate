package oops;

/*
 * This package is inside another package. So, run the code in CLI as follows:
 *      -> javac -d . Abstraction.java
 *      -> javac oops.Abstraction
 */
/*
 * How to achieve abstraction :-
 *      -> using interface and  = 100% abstraction
 *      -> using abstract class = 0 to 100% abstraction
 */

/*
 * Steps are:
 *  1. create first class
 *      -> declare abstract method m1
 *      -> defince concrete method m2
 *  2. create a second class and inherit(extends) first class
 *      -> you must implement abstract method
 *  3. create a Main class with main method
 *      -> instantiate second class
 *      -> invoke both methods using an object of second class
 */

 /* abstract class can have concrete and abstract methods. However, if there is an abstract 
    method, then its class must be an abstract class
 */
abstract class Student{ 
    abstract public String name();
    public void college(){
        System.out.println("CU Denver");
    }
}

/*
 * You cannot instantiate abstract class. This class becomes helper class to instantiate
 * the abstract class.
 */
class Freshman extends Student{
    // implement inherited abstract method
    public String name(){
        return "Nabin";
    }
}

public class Abstraction {
    public static void main(String []args){
        // instantiate Freshman class and invoke both methods
        Freshman fm = new Freshman();
        System.out.println(fm.name());
        fm.college();
    }
}
