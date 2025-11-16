import java.util.Scanner;



public class Employee {
	
	private static int count;
	private int id;
	private String name;
	private double basicSalary;
	
	
	public Employee(String name,double basicSalary) {
		count++;
		this.id=count;
		this.name=name;
		this.basicSalary=basicSalary;
		
	}
	
	public  double calaculateSalary() {
		return basicSalary *2;
	}
	
	void showDetails(String format) {
		System.out.println("ID   \t  NAME   \t  MARKS");
		
		for(int i=1;i<=40;i++) {
			System.out.print(format);
		}
		System.out.println();
		System.out.println(this.id + "\t\t" + this.name + "\t\t"  + this .basicSalary);

	}

}


public class EmployeeCreation {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice ;
		Employee emp= null;
		
		
		do {
			System.out.println("Welcome to Employee Management System");
			System.out.println("=====================================");
			System.out.println("1.Register New Employee");
			System.out.println("2.Display Details");
			System.out.println("-1. Exit");
			System.out.print("Enter Your Choice: ");
			choice=sc.nextInt();
			
			switch(choice){
			case 1:
				emp= new Employee("Arsalan",56789.98f);
				break;
			case 2:
				
				if (emp!=null) {
					emp.showDetails("*");
				}else {
					System.out.println("Enter a Valid Employee");
				}
				break;
				
			case -1:
				System.out.println("Thank you !!!");
				
			}
			
	
			
		}while(choice!=-1);
	
		
		
	}

}
