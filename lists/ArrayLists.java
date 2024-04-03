package lists;

import java.util.ArrayList;

/*
 * To run this file in CLI
 *      javac -d . ArrayLists.java
 *      java lists.ArrayLists
*/
/**
 * Original size of arraylist is 10, next size could be 10*3/2 + 1
 * 
 * You cannot initialize arraylist ot once with declaration. You have to use add()
 */
class ALImplementation{
    /**
     * 
     * @return ArrayList
     */
    public ArrayList<String> getLanguages(){
        ArrayList<String> al = new ArrayList<>(); // diamond operator
        al.add("Java");
        al.add("Python");
        al.add("JavaScript");

        // add at index 1
        al.add(1, "HTML");

        return al;
    }

    /**
     * takes in an arralist and calculates its size
     * @param alDoubles ArrayList
     * @return integer, lenth of an arraylist
     */
    public int getSize(ArrayList<Double> alDoubles){
        return alDoubles.size();
    }

    /**
     * takes an arraylist, removes even numbers
     * @param numbers ArrayList
     * @return ArrayList
     */
    public ArrayList<Integer> removeEvenNumber(ArrayList<Integer> numbers){
        for(int i = 0; i<numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                numbers.remove(i);
                i--; // b/c AL removes an element and decrements index by 1
            }
        }
        return numbers;
    }

    /**
     * takes in ArrayList and checks if it is empty
     * @param frameworks ArrayList
     * @return true or false
     */
    public boolean checkEmpty(ArrayList<String> frameworks){
        boolean empty = false;
        if(frameworks.isEmpty()){
            empty = true;
        }
        return empty;
    }

    /**
     * takes in arraylist and updates its elements to be CSS at odd index
     * @param names ArrayList
     * @return ArrayList
     */
    public ArrayList<String> updateElement(ArrayList<String> names){
        for(int i = 0; i < names.size(); i++){
            if(i % 2 != 0){
                names.set(i, "CSS");
            }
        }
        return names;
    }
}

public class ArrayLists {
    public static void main(String[]args){
        // instantiate the class
        ALImplementation aListImplemObj = new ALImplementation();
        
        //getLanguages method
        ArrayList<String> alLangs = aListImplemObj.getLanguages();
        System.out.println(alLangs);
        System.out.println();

       //getSize method
        ArrayList<Double> ald = new ArrayList<>();
        ald.add(2.4);
        ald.add(0.9);
        int len = aListImplemObj.getSize(ald);
        System.out.println("Size of arraylist is " + len);
        System.out.println();

        //removeEvenNumber method
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(22);
        nums.add(222);
        ArrayList<Integer> newAL = aListImplemObj.removeEvenNumber(nums);
        System.out.println("Remove method ...");
        System.out.println(newAL);

        //checkEmpty()
        ArrayList<String> emptyAL = new ArrayList<>();
        boolean result = aListImplemObj.checkEmpty(emptyAL);
        System.out.println("checkEmpty method ......");
        System.out.println(result);
        System.out.println();

        //updateElement method
        ArrayList<String> newStrAL = new ArrayList<>();
        newStrAL.add("Java");
        newStrAL.add("JS");
        newStrAL.add("C#");
        newStrAL.add("C++");
        ArrayList<String> updatedAL = aListImplemObj.updateElement(newStrAL);
        System.out.println("updateElement method .......");
        System.out.println(updatedAL);

    }
}
