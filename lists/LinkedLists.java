package lists;

import java.util.LinkedList;
import java.util.List;

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

    public LinkedList<String> addElement(){
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("MSU Denver");
        ll.addLast("University of Colorado Denver");
        ll.addFirst("Community College of Aurora");
        return ll;
    }

    public String getElement(){
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("Prinsha");
        ll.addLast("Prabha");
        ll.addLast("Pabi");
        ll.addFirst("Nabin");

        // get them back
        String firstName = ll.getFirst(); // try getLast()
        return firstName;
    }

    public int returnRemovedElement(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(2);
        ll.addLast(4);
        ll.addFirst(8);

        int removedFirstElement = ll.removeFirst();
        return removedFirstElement;
    }

    public boolean isLLEmpty(List<String> list){
        return list.isEmpty();
    }

    // contains
    public boolean doesLLContainElement(LinkedList<Double> llist){
        return llist.contains(24.00);
    }
}

//main class
public class LinkedLists {
    public static void main(String []args){
        EmployeeInfo ei = new EmployeeInfo();
        LinkedList<String> lls = ei.getEmployee();
        System.out.println(lls);

        // add method of EmployeeInfo class
        LinkedList<String> colleges = ei.addElement();
        System.out.println("addElement method linkedlist :- \n" + colleges);

        // get method
        String firstElement = ei.getElement();
        System.out.println("getElement method linkedlist :- \n" + firstElement);

        // remove method
        int removedFirstElement = ei.returnRemovedElement();
        System.out.println("remove method output :- \n" + removedFirstElement);
    
        //isLLEmpty method
        List<String> list = new LinkedList<>();
        list.add("Java");
        System.out.println(ei.isLLEmpty(list));

        //doesLLContainElement method
        LinkedList<Double> ll = new LinkedList<Double>();
        ll.addFirst(24.00);
        System.out.println("doesLLContainElement method ......");
        System.out.println(ei.doesLLContainElement(ll));
    }
}
