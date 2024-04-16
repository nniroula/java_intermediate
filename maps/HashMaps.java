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

    public static Map<String, String> getHashMap(){
        Map<String, String> hsMap = new HashMap<>();
        hsMap.put("Java", "Spring Boot");
        hsMap.put("JS", "ExpresJS");
        hsMap.put("Python", "Flask");
        return hsMap;
    }
}


public class HashMaps {
    public static void main(String []args){
        //getHashMap method
        System.out.println("getHashMap function's output is ...\n" + KeyValuePair.getHashMap());
    }
    
}
