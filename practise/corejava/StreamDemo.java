
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class StreamDemo {
    public static void main(String[] args) {

//
//        List<String> values = Arrays.asList("a","b","c","d");

        // values.forEach((i)-> {System.out.println(i);});
        // values.forEach(i -> System.out.println(i));

//        List<Integer> ls = Arrays.asList(1,233,45,6);
//       
//         int x = ls.stream().mapToInt(i -> i+1).sum();
//         System.out.println(x);

    //    Integer res = ls.stream().map(i -> i*2).reduce(0, (c,e) -> c+e);
//        ls.stream().map(i -> i*2);
//       System.out.println(ls);
//       values.forEach(i-> System.out.println(i));
    //    System.out.println(res);
    	
    	
    	List<Movie> m = Arrays.asList(new Movie("A","vijay",2013),
    			                  new Movie("B","ajith",2012),
    			                  new Movie("C","Dhanu",2012),
    			                  new Movie("D","VijaySethupathi",2014)); 
    	
    	List<String> actor = new ArrayList<>();
    	
    	m.stream()
    	        .filter(x -> x.getReleaseYear() == 2012)
    	        .map(m1 -> m1.getActor().toLowerCase())
    	        .sorted()
    	        .forEach(i -> actor.add(i));
    	
    	System.out.println(actor.toString());
    	Arrays.stream(new int[] {21,2,3,44,5,6,7,8})
    	      .map(x -> x+1)
    	      .sorted()
    	      .forEach(System.out::println);
    	
    	
    	
 
    }
}
