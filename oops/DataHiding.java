package oops;

/*
 * The oops package is inside another package. To run this program in CLI:
 *      -> javac -d . DataHiding.java
 *      -> java oops.DataHiding
 */

/*
 * Data hiding provides security to the program.
 * It is acheieved by using private keyword with variables. Access and update them 
 * using public getter and setter methods
 */

class Hide{
    private String name; // data hiding due to private access modifier

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}

public class DataHiding {
    public static void main(String []args){
        Hide hide = new Hide();
        hide.setName("Nabin");
        System.out.println(hide.getName());

    }
}
