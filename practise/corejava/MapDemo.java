
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        
        //HasMap -it is like dictonary like key value pairs stored in random order

        System.out.println("in Hasmap");
        Map<String, String> map = new HashMap<>();

        map.put("name", "pooven");
        map.put("car", "bmw");
        map.put("char", "p");
        map.put("hel", "hello");

        for (String key : map.keySet()) {

            System.out.println(key +"  -"+ map.get(key));
            
        }

        System.out.println();


        System.out.println("in Treemap");
        Map<String, String> treemap = new TreeMap<>();

        treemap.put("same", "pooven");
        treemap.put("car", "bmw");
        treemap.put("char", "p");
        treemap.put("hell", "hello");
        System.out.println();


        for (String key : treemap.keySet()) {

            System.out.println(key +"  -"+ treemap.get(key));
            
        }

        System.out.println();
        System.out.println("in linkedHasmap");
        Map<String, String> linkmap = new TreeMap<>();

        linkmap.put("name", "pooven");
        linkmap.put("car", "bmw");
        linkmap.put("char", "p");
        linkmap.put("hel", "hello");

        for (String key : linkmap.keySet()) {

            System.out.println(key +"  -"+ linkmap.get(key));
            
        }


    }
}
