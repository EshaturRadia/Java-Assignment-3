
public class Circle extends Shape {
	double radius = 1.0;
	Circle()
	{
		radius = 1.0;
	}
	Circle(double radius)
	{
		this.radius = radius;
	}
	Circle(String color,boolean Filled,double radius)
	{
		super(color,Filled);
		this.radius = radius;	
	}
	void setRadius(double radius)
	{
		this.radius = radius;
	}
	double getRadius()
	{
		return this.radius;
		
	}
	double getArea()
	{
		return 3.14*this.radius*this.radius;
	}
	double getPerimeter()
	{
		return 2*3.14*this.radius;
	}
	public String toString()
	{
		return "A circle with radius = " +getRadius() + " which is a subclass of " + super.toString();
		
	}

}
