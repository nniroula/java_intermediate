package lists;

import java.util.LinkedList;

/**
 * Linked is a generic class. Insertion and removal is efficient.
 * Accessing elements at the beginning and the end is efficient.
 * But accessing elements at other locations is not efficient - you need list iterator
*/

class Employee{
    private String jobTitle;

    // setters
    public void setJobTitle(String newTitle){
        this.jobTitle = newTitle;
    }

    // getters
    public String getJobTitle(){
        return jobTitle;
    }
}


// create a class use Employee as its generic type
class EmployeeInfo{
    public LinkedList<String> getEmployee(){
        LinkedList<String> ll = new LinkedList<>();
        // set jobtitle and add it to linkedlsit
        //instantiate the class
        Employee emp = new Employee();
        emp.setJobTitle("Java Devloper");

        // add employee ot linkedlist, to do it, first retrieve the jobtitle
        String job = emp.getJobTitle();
        ll.addFirst(job);

       return ll;
    }

    public LinkedList<String> add(){
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("MSU Denver");
        ll.addLast("University of Colorado Denver");
        ll.addFirst("Community College of Aurora");
        return ll;
    }
  
}

//main class
public class LinkedLists {
    public static void main(String []args){
        EmployeeInfo ei = new EmployeeInfo();
        LinkedList<String> lls = ei.getEmployee();
        System.out.println(lls);

        // add method of EmployeeInfo class
        LinkedList<String> colleges = ei.add();
        System.out.println("add method linkedlist :- \n" + colleges);
    }
}
