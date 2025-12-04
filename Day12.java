
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> cities;
		cities = new TreeSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		
		//iterate using advanced for loop, using this for loop u can iterate over collection from begning to end sequentially .we cant modify collection
		//if we want to iterate over collection object and while iterating we remove a specific element from the collection we should use iterator object.
		for(String city : cities) {
			System.out.println(city);//its readonly
		}
		
		
		Iterator<String> i;
		i=cities.iterator();//step1
		
		//Step2
		while(i.hasNext()) {
			//Step3
			String city=i.next();
			System.out.println(city);       //iterator has next,hasnext,remove method.
			
			if(city.equals("Pune"))
				i.remove();
		}
		
		System.out.println(cities);
		
		

	}

}
