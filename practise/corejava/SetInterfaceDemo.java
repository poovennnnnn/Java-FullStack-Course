

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set interface
//hashset has unique values only
//treeset is also same and has in sorted fromat

//COMMON METHODS FOR THIS
//contains
//size
//remove
//clear

public class SetInterfaceDemo {
    public static void main(String[] args) {
        


        // HashSet - not maintained insertion order
        Set<String> cars = new HashSet<>();
        
        //note duplicate items is no allowed 
        cars.add("BMW");  //to add item 
        cars.add("audi");  
        cars.add("volvo");
        cars.add("Benz");
        cars.add("Benz");

        System.out.println("in hashset");
        for (String string : cars) {
            System.out.println(string);
            
        }

        // In treeset - sorted in asscending format
        Set<String>  cars1 = new TreeSet<>();
        
        cars1.add("BMW");  
        cars1.add("audi");  
        cars1.add("volvo");
        cars1.add("Benz");
        cars1.add("Benz");

        System.out.println();
        System.out.println("in tree set");

        for (String string : cars1) {
            System.out.println(string);
    
        }

        // in linkedHashSet - insetion order is maintained
        Set<String> cars2 = new LinkedHashSet<>();
        
        //note duplicate items is no allowed 
        cars2.add("BMW");  //to add item 
        cars2.add("audi");  
        cars2.add("volvo");
        cars2.add("Benz");
        cars2.add("Benz");

        System.out.println();


        System.out.println("in Linkedhashset");
        for (String string : cars2) {
            System.out.println(string);
            
        }

    }
}
