package tuyo.designpatterns.shape;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class DashLineShape extends ShapeDecorator { // Decorator para linhas tracejadas

	public DashLineShape(Shape shape) {
		super(shape);
	} // Construtor passando shape como parâmetro.

	@Override
	public void draw(Graphics g) { // Sobrescrevendo o método draw
		
		Graphics2D g2d = (Graphics2D) g.create(); // transfomando em Graphics 2D para trabalhar com linhas tracejadas.
		
		BasicStroke stroke = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{ 9 }, 0); //api Swing do java
		g2d.setStroke(stroke);
		
		super.draw(g2d);
		
		g2d.dispose();
	}
}
