package ptpl;

public class Circle {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to explain Default Constructor 
		
private double radius;
	
	Circle()
	{
		radius = 10.0;
	}
	
	public double area()
	{
		return 3.14 * radius * radius;
	}
} 
 class  CircleConstructor1
{
	public static void main( String args[ ] )
	{ 
		Circle c1 = new Circle(); 
		
		System.out.println(" Area of Circle : " + c1.area()); 

	}
}


