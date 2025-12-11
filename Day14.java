import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> cities;
		cities=new Vector<String>();
		
		System.out.println(cities.size());
		
		cities.add("Mumbai");
		cities.add("Pune");
		
		System.out.println(cities);
		
		cities.add(1,"delhi");
		System.out.println(cities);
		
		
		cities.remove(1);
		
		cities.clear();
		
		
		
	}

}
