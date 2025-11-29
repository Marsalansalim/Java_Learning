import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> cities;
		cities = new HashMap<Integer,String>();
		
		cities.put(22,"Mumbai");
		cities.put(11,"Delhi");
		cities.put(33, "Pune");
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.get(22));
		System.out.println(cities.containsKey(11));
		System.out.println(cities.containsValue("Pune"));
		
		//duplicate key not allowed
		cities.put(11,"Banglore");
		System.out.println(cities);
		
		//duplicate value  allowed
		cities.put(20,"Mumbai");
		System.out.println(cities);
		
		cities.remove(33);
		System.out.println(cities);
		
		cities.clear();
		

	}

}
