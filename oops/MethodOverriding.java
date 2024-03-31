package oops;

/*
Method Overriding happens with non-static(instance) method.
It needs inheritance so that method in parent class is overriden in child class
*/

class Parent{
    public void language(){
        System.out.println("Parent language - Java");
    }
}

class Child extends Parent{
    // method overriding
    public void language(){
        System.out.println("Child language - Python");
    }
}

public class MethodOverriding {
    public static void main(String []args){
        //instantiate Parent class
        Parent p = new Parent();
        p.language(); // prints Parent ...

        // instantiate Child class
        Child c = new Child();
        c.language();  // prints Child ...

        // instantiate Parent class with object type of Child class
        Parent p1 = new Child(); // this will cause method overriding.
        p1.language(); // prints Child ... by JVM at run time by resolving method. Its runtime polymorphism.
    }
}
