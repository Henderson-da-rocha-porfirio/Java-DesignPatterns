package tuyo.designpatterns.shape;

import java.awt.Graphics;

public abstract class ShapeDecorator implements Shape { // Todos os comportamentos que eu permitir serem atrelados ao Shapes vão herdar de ShapeDecorator.
															// O fato de ShapeDecorator implementar os métodos da interface Shape, ele se torna um Shape.
	private Shape shape; 	// Atributo Shape = O Decorator dentro dele, se faz necessário o objeto que ele vai influenciar no comportamento, neste caso, é o Shape. Por isso, esse atributo é criado.
	
	public ShapeDecorator(Shape shape) { // Construtor que recebe como parâmetro um shape.

		this.shape = shape; // E copia a referência para o atributo Shape.
	}

	@Override
	public void draw(Graphics g) {
		shape.draw(g);
	} 										// Por ele ser um Shape, eu consigo implementar também o método draw da interface Shape.
}
