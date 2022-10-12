
public class Test1 {
public static void main(String args[]) {
	if(args.length == 0) {
		System.out.println("quitting program");
		System.exit(1);
	}
	
	for(String x: args) {
		System.out.println(x);
	}
}
}
