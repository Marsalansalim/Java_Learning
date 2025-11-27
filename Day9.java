import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities;
		cities=new ArrayList<String>();//By making this we make this generic
		System.out.println(cities.size());
		
		
		cities.add("Mumbai");//Adding a element
		cities.add("Pune");
		
		System.out.println(cities.size());// no of element
		System.out.println(cities);
		
		
		cities.add("Mumbai");//Adding a element
		cities.add("Pune");
		cities.add("Mumbai");//Adding a element
		cities.add("Delhi");
		//cities.add(12);//boxing(primitive to wrapper) 
		
		System.out.println("Before");
		
		Collections.sort(cities);
		
		System.out.println("After");
		
		
		
		
		
		cities.add(1,"delhi");//adding at a given index 
		System.out.println(cities);
		System.out.println(cities.size());//no of element
		System.out.println(cities.get(0));
		
		
		
		cities.remove(1);//removes element from given index
		System.out.println(cities.size());
		System.out.println(cities);
		
		
		cities.clear();//it clear all  the element from arraylist
		System.out.println(cities.size());
		System.out.println(cities);
		
		
	}

}
