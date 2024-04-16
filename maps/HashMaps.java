package maps;

import java.util.HashMap;
import java.util.Map;

/*
 * To run this program in CLI
 *  javac -d . HashMaps.java
 *  java maps.HashMaps
 */

/*
 * HashMap takes key value pair. It's like object in JS and dictionary in Python
 */

class KeyValuePair{
    /*
     * Static method could be directly called by its class in main method
    */

    // create a global HashMap
    private static Map<String, Integer> globalHashMap = new HashMap<>();

    public static Map<String, String> getHashMap(){
        Map<String, String> hsMap = new HashMap<>();
        hsMap.put("Java", "Spring Boot");
        hsMap.put("JS", "ExpresJS");
        hsMap.put("Python", "Flask");
        return hsMap;
    }

    /*
     * addElement method
     */
    public static Map<String, String> addElement(){
        Map<String, String> newHashMap = new HashMap<>();
        newHashMap.put("JS", "Front End");
        newHashMap.put("Java", "BackEnd language");
        return newHashMap;
    }

    /*
     * isEmpty method
    */
    public static boolean isHashMapEmpty(){
        return globalHashMap.isEmpty();
    }

    //size() method

    // contains();

    // remove method

    // print out all keys

    // pirnt out all values

}


public class HashMaps {
    public static void main(String []args){
        //getHashMap method returns HashMap
        System.out.println("getHashMap function's output is ...\n" + KeyValuePair.getHashMap());
   
        //addElement method
        System.out.println();
        System.out.println("addElement method's output is ... \n" + KeyValuePair.addElement());
        
        //isHashMapEmpty method
        System.out.println();
        System.out.println("isHashMapEmpty method's output is ... \n" + KeyValuePair.isHashMapEmpty());
    
    }
    
}
