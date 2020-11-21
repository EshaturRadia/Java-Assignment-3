
public class Shape {
	private String color;
	private boolean Filled;
	Shape()
	{
		color = "green";
		Filled = true;
	}
	public Shape(String color,boolean Filled)
	{
		this.color = color;
		this.Filled = Filled;	
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setFilled(boolean Filled)
	{
		this.Filled = Filled;
	}
	public boolean isFilled()
	{
		return this.Filled;
	}
	public String toString()
	{
		return "A shape with color " + getColor() + " and " +isFilled() + "Filled";
	}
}
