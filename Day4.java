
//  ======LengthRunner Interface===========


package org.ycpait.demointerface;

public interface LenthRunner {
	int calLength(String s);
}


//   ======Searchable  Interface===========

package org.ycpait.demointerface;

public interface Searchable {
	boolean search (String data);
	

}

//  ======Taxable Interface===========

package org.ycpait.demointerface;
@FunctionalInterface
public interface Taxable {
	double Tax(double income);

}



// Main class

package org.ycpait.demointerface;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringJoinner sj = (String s1, String s2)->{return s1+s2;}; 
		//StringJoinner sj = ( s1,  s2)->{return s1+s2;}; 
		
		StringJoinner sj = (s1, s2)->s1+s2; 

		
		System.out.println(sj.join("Arsalan", "Mohammad"));
		
		//Taxable t = (double income)->{return income*0.20;};
		//Taxable t = (income)->{return income*0.20;};
		//Taxable t = income->{return income*0.20;};
		Taxable t = income-> income*0.20;
		
		
		//Searchable s=(String data)->{return false;};
		//Searchable s=( data)->{return false;};
		//Searchable s= data->{return false;};
		Searchable s= data-> false;
		
		LenthRunner lr =(String s)

		
		
		
		System.out.println(t.Tax(5000));

	}

}
