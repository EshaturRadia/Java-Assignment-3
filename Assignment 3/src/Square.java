
public class Square extends Rectangle 
{
	Square()
	{
		super();
	}
	public Square(double side)
	{
		super(side,side);
	}
	public Square(String color,boolean Filled,double side)
	{
		super(color,Filled,side,side);
	}
	public void setSide(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}
	public double getSide()
	{
		return super.getWidth();
	}
	//public double getArea()
	//{
		//return getSide()*getSide();
	//}
	//public double getPerimeter()
	//{
		//return 2*(getSide()+getSide());
	//}
	public String toString()
	{
		return "A square with side = " +getSide()+ " which is a subclass of " + super.toString();
	}
	   
}
