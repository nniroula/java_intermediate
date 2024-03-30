package oops;

/*
 * Encapsulation = Data Hiding + Abstraction
 * It is the processing of grouping data members and corresponding methods together
 * into a single unit. This single unit is a class.
 * 
 * How to achieve Encapsulation?
 *      -> use private keyword with data members - this provides data hiding
 *      -> define public getters and setters for those data members - this provides abstraction
 */

 class Student{
    private String stdName;

    // getter
    public String getName(){
        return stdName;
    }

    // setter
    public void setName(String newName){
        //stdName = newName;
        this.stdName = newName;
    }
 }
public class Encapsulation {
    public static void main(String []args){
        // instantiate the student class
        Student std = new Student();

        // set student name
        std.setName("Nabin");

        // retrieve the student's name
        String studentName = std.getName();
        System.out.println(studentName);
    }
}
