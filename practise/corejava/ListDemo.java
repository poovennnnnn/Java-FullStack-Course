
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //ArrayList if you add the item in the middle all orders will change
        List<String> list = new ArrayList<>();
        list.add("BMW");  //to add item 
        list.add("audi");  
        list.add("volvo");
        list.add("Benz");
        list.add("Benz");

        list.add(1,"pooven");

        for (String string : list) {
            System.out.println(string);
        }

        System.out.println();



        //LinkedLIST

        List<String> linklist = new LinkedList<>();

        linklist.add("hello");
        linklist.add("hiii");
        linklist.add("welcome");

        linklist.add(1, "poooven");
        linklist.add("hello");

        
        System.out.println(linklist.add("hello"));
        linklist.get(linklist.indexOf("hello"));
        

        for (String string : linklist) {
            System.out.println(string);
        }




    }
}
