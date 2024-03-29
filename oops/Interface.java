package oops;

/*
 * How to implement an interface:
 *      -> create an interface
 *      -> create a class to implement its methods
 *      -> create a public class and instantiate above class. This way you do not have to
 *          worry about static and non-static methods in public class and an interface.
 *          main() is static method and methods in interface may not be static.
 */

/*
 * To run this file :-
 *      javac -d . Interface.java
 *      java oops.Interface  
 *                          -> oops = package. This package is inside another package.
 *                          -> compiler makes .class file inside the package.
 */

 // inteface, if you use public as access modifier, then the interface must be defined in its own file
interface Interf{
    // method is always public abstract, you do not have to mention it explicitly
    public abstract int add();
    public double multiply();
    String getName(); // this is already public abstract String getName()

 }
class InterfaceImplementation implements Interf{
    public int add(){
        return 3 + 2;
    }

    public double multiply(){
        return 3 * 2;
    }

    public String getName(){
        return "Nabin";
    }

    public void displayResults(){
        int sum = add();
        System.out.printf("add function returns %d \n", sum);

        double product = multiply();
        System.out.printf("multiply function returns %.2f \n", product);

        String name = getName();
        System.out.printf("name function returs %s \n", name);
    }
}
public class Interface{
    public static void main(String []args){
        System.out.println("Interface implementation");

        InterfaceImplementation interImp = new InterfaceImplementation();
       //System.out.println(interImp.add());
        interImp.displayResults();
    }
}