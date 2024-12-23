public class RectangleTest {
   
	public static void main (String args[]) {
	Rectangle r1 = new Rectangle();
	System.out.println("面積為"+r1.getArea());
	r1.draw();
	System.out.println();
	
	Rectangle r2 = new Rectangle(15,5);
	System.out.println("面積為"+r2.getArea());
	r2.draw();
	System.out.println();
	
	Rectangle r3 = new Rectangle(12);
	System.out.println("面積為"+r3.getArea());
	r3.draw();
	System.out.println();
	
	}}
	