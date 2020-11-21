
public class Rectangle extends Shape {
	double width = 1.0, length = 1.0;
	Rectangle()
	{
		width = 1.0;
		length = 1.0;
		
	}
	Rectangle(double width,double length)
	{
		this.width = width;
		this.length = length;
	}
	Rectangle(String color, boolean Filled,double width, double length)
	{
		super(color,Filled);
		this.width = width;
		this.length= length;
	}
	void setWidth(double width)
	{
		this.width = width;
	}
	double getWidth()
	{
		return this.width;
	}
	void setLength(double length)
	{
		this.length = length;
	}
	double getLength()
	{
		return this.length;
	}
	double getArea()
	{
		return this.width*this.length;
	}
	double getPerimeter()
	{
		return 2*(this.length+this.width);
	}
	public String toString()
	{
		return "A rectangle with width = " +getWidth()+" and length = " +getLength()+ " which is a subclass of " + super.toString();
	}
}
