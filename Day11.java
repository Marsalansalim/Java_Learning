
//HashSet
import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities;
		cities= new HashSet<String>();
		
		cities.add("Mumbai");
		cities.add("Pune");
		System.out.println(cities);
		System.out.println(cities.size());
		cities.add("Mumbai");//this will not work as duplicate entry is not supported
		
		System.out.println(cities);
		
		System.out.println(cities.contains("Mumbai"));
		
		
		cities.clear();
		

	}

}


//LinkedHashSet
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> cities;
		cities = new LinkedHashSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		
		System.out.println(cities);
		System.out.println(cities.contains("Mumbai"));//Shows the boolean value

	}

}
