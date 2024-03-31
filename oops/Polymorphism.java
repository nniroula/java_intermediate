package oops;

/*
* oops is inside another package. To run it:
*      -> javac -d . Polymorphism.java 
*      -> java oops.Polymorphism 
*/
/*
* Poly = many, morphism = form. So, polymorphism is one method with different forms/implementations
* 
* Two types of polymorphism are runtime and compile time polymorphisms
*/

// compile time polymorphism = method overloading and method hiding
class Parent{
    // static method for method hiding - its method overriding but with static method
    public static void name(){
        System.out.println("Nabin");
    }

    // method overloading
    public void add(int a, int b){
        System.out.println(a + b);
    }

    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public void add(int p, int q, int r, int s){
        System.out.println(p + q + r + s);
    }
}

class Child extends Parent{
    // static method - method hiding
    public static void name(){
        System.out.println("James Goslin");
    }
}

public class Polymorphism {
    public static void main(String []args){
        // instantiate the class
        Parent p = new Parent();

        // invoke the overloaded method
        p.add(1, 2);
        p.add(1, 2, 3);
        p.add(1, 2, 3, 4);

        // instantiate child class and call satic method
        Child c = new Child();
        c.name();

        // refrence type = parent and object type = child
        Parent p1 = new Child();
        p1.name();  // prints Nabin (Parent method output) by compiler based on reference type. So, its method hiding, not overriding
    }
}
