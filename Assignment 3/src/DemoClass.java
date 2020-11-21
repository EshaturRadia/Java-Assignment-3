
public class DemoClass {

	public static void main(String[] args) {
	Shape S = new Shape("red",true);
	Circle C = new Circle("blue",false,4);
	Rectangle R = new Rectangle("white",true,5,7);
	Square SQ = new Square("Orange",true,5);
	System.out.println(S.toString());
	System.out.println("Area of circle is " + C.getArea());
	System.out.println("perimeter of circle is " + C.getPerimeter());
	System.out.println(C.toString());
	System.out.println("Area of Rectangle is " + R.getArea());
	System.out.println("perimeter of  Rectangle is " + R.getPerimeter());
	System.out.println(R.toString());
	//System.out.println("Area of Square is " + SQ.getArea());
	//System.out.println("perimeter of Square is " + SQ.getPerimeter());
	System.out.println(SQ.toString());
	System.out.println("Area of Square is " + SQ.getArea());
	System.out.println("perimeter of Square is " + SQ.getPerimeter());
	}

}
