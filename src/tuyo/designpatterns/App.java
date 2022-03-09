package tuyo.designpatterns;

import java.awt.Color;

import tuyo.designpatterns.gui.Window;
import tuyo.designpatterns.shape.ColorShape;
import tuyo.designpatterns.shape.DashLineShape;
import tuyo.designpatterns.shape.Shape;
import tuyo.designpatterns.shape.Square;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show()     ;
		
		Shape shape = new DashLineShape(new ColorShape(new Square(), Color.YELLOW));
		
		w.drawShape(shape);
	}
}
