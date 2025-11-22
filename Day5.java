
//Exception handling with try & catch Block
public class DemoExceptionHandling {

	public static void main(String[] args) {
	
		int num1=2;
		int num2=0;
		try {
			int result= num1/num2;
			System.out.println("Result is"+result);
			
		}
		
		//System.out.println("In");Error
		
		catch(ArithmeticException e) {
			
			System.out.println("Cannot Divide By Zero");
			
			e.printStackTrace();//this prints complete stack trace on console needed for debugging
		}

	}

}

//Exception handling with try and many catch block


public class DemoManyCatches {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.length());
			System.out.println(args[0]);
			System.out.println(1/0);
		}
//		catch(ArithmeticException e){
//			System.out.println("Cannot Divide by zero");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array index out of range");
//		}
//		catch(NullPointerException e) {
//			System.out.println("Cannot invoke method on null");
//		}
		catch(Exception e) {
			System.out.println("Generic");
		}
		System.out.println("After");

	}

}


//Try-Catch With finally block

public class DemoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("in try");
			System.out.println(1/0);
			
		}
		catch(Exception e) {
			System.out.println("In catch");
			
		}
        //Finally block is used When we want to close the opened resources if any . 
        //the execution of this block will happen irrespective of code execution or exception occurs
		finally {
			System.out.println("In Finally");
		}
	}

}

