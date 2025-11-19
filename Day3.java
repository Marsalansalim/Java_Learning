package geometryapp;

public class Shape {
	protected String color;
	public Shape(String color) {
		System.out.println("InShape");
		
		this.color=color;
	}
	public void draw() {
		
		System.out.println("Shape drawn using color : " + this.color);
	}

}


public class Rectangle extends Shape {
	
	private float length;
	private float breadth;
	//private String color;
	
	
	public Rectangle(float length, float breadth, String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
		//this.color = color;
	}
	
	public float calculateArea() {
		return length*breadth;
	}
	
	public void draw() {
		super.draw();
		System.out.println("With length & Breadth:" + this.length+" & "+this.breadth);
	}
	


}


public class Circle extends Shape {
	float radius;
	//String color;
	
	
	public Circle(float radius, String color) {
		super(color);
		this.radius = radius;
		//this.color = color;
	}
	
	public float CalculateArea() {
		return 3.14f*radius*radius;
	}
	
	@Override //buit-in annotation to check if overriding is appropriate,it's recommended to annotate for overriden methods not mandidate
	public void draw() {
		super.draw();
		System.out.println("With Radius:" + this.radius);
	}

}






public class GeometeryApplication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Circle c= new Circle(6.5f,"RED");
		
		System.out.println("Area of Circle is :"+c.CalculateArea());
		
		c.draw();
		
		Rectangle r= new Rectangle(5f,5f,"BLUE");
		
		System.out.println("Area of Rectangle:"+ r.calculateArea());
		
		r.draw();

	}

}
