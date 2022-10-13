import java.util.ArrayList;
import java.util.List;

/**
 * MethodRefeference
 */


public class MethodRefeference {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("BMW");  //to add item 
        list.add("audi");  
        list.add("volvo");
        list.add("Benz");
        list.add("Benz");

    
        list.forEach(MethodRefeference::hello);

        
    }

    public static void hello(String  s){

        System.out.println("Hello "+s);
 
    }
}