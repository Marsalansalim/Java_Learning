
//Simple if - else 
class DemoConditionalConstructs{

	public static void main(String[] args){
		int age;
		age=19;
		char nationality;
		nationality='I';
		if(age>18 && nationality =='I'){
			System.out.println("Eligible for voting");	
		}
		else{
			System.out.println("Not Eligible for voting");

			
		}
	}
}




// Nested If - elseif-else  
class DemoSelectionConstructs{
	public static void main(String[] args){
		int num;
		num=1;
		

		if(num==1){
			
			   System.out.println("ONE");
			
		}
		else if(num==2){
			System.out.println("TWO");
		}
		else if(num==3){
			System.out.println("THREE");

		}
		else {
			System.out.println("Incorrect value");


		}
		

		
	}


}


//For Loop
class DemoForLoop{
public static void main(String[] args){

for (int i=1;i<=10;i++){
 for (int j=1;j<=10;j++)
System.out.println(i+"x"+ j+"="+i*j);
}
	
}
}



//While Loop
class DemoWhileLoop{
	public static void main(String[] args){
		int number=97;
		int i=2;
		Boolean isPrime=true;
		while(i<number){
			if(number%i==0){
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}




//Do-While Loop
class DemoDoWhileLoop{
	public static void main(String[] args){
		int choice = 0;
		do{
			System.out.println("--------------------");
   			System.out.println("1.Register");
   			System.out.println("2.Find");
   			System.out.println("3.Find All");
   			System.out.println("4.Delete");
   			System.out.println("5.Update");
   			System.out.println("0.Exit");
   			System.out.println("--------------------");
			switch(choice){
				case 1:
					System.out.println("Register");
					break;
				case 2:	
					System.out.println("Find");
					break;	
				case 3:
					System.out.println("Find All");
					break;	
				case 4:
					System.out.println("Delete");
					break;	
				case 5:
					System.out.println("Update");
					break;	
				case 0:
					System.out.println("Exit");
					break;	
				default:
					System.out.println("Not valid input");
					break;
			}
		}while(choice != 0);
	}
}