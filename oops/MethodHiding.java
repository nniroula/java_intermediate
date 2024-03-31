package oops;
/*
 * To run this file in CLI-
 *      javac -d . MethodHiding.java
 *      java oops.MethodHiding     b/c oops is inside antthoer package
 */

/*
 * Mehtod Hiding happens when a static method in parent class is over-ridden in child class
 * Its compile time polymorphism
 * Compiler does method resolution based on refrence type(Not based on Object type) for
 *      Parent p = new Child() form.
 */

class Parent{
    public static void language(){
        System.out.println("Parent class - Java");
    }
}

class Child extends Parent{
    public static void language(){
        System.out.println("Child class - Python");
    }
}

public class MethodHiding {
    public static void main(String []args){
        // instantiate Parent class
        Parent p = new Parent();
        p.language();

        // instantiate child class
        Child c = new Child();
        c.language();

        // instantiate Parent as refernce type and Child as obejct type
        Parent p1 = new Child();  // this will cause Method Hiding
        p1.language(); // prints output of parent class method instead of child class method
    }
}
