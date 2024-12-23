import ch.aplu.turtle.*;
import java.awt.Color;

public class TurtleTest{
public static void main(String[]args){
Turtle sean = new Turtle();
sean.setColor(Color.GREEN);
sean.setHeading(90);
sean.setPos(100,100);

Turtle A = new Turtle(sean);
A.setColor(Color.RED);
A.setPos(-50,-50);
A.speed(50);
A.label("A");
for(int i=0; i<4;i++){
	A.right(120);
	A.back(80);
}
System.out.println("A的位置("+A.getX()+","+A.getY()+")");
System.out.println("方向"+A.heading());

Turtle B = new Turtle(sean);
B.setColor(Color.YELLOW);
B.penUp();
B.heading(90);
B.label("surprise mf");
B.right(90);
B.forward(50);
	

System.out.println("B的位置("+B.getX()+","+B.getY()+")");
System.out.println("方向"+A.heading());




}


}