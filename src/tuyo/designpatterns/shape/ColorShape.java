package tuyo.designpatterns.shape;

import java.awt.Color;
import java.awt.Graphics;

public class ColorShape extends ShapeDecorator { // Ela herda de ShapeDecorator
													//O ColorShape adiciona um comportamento de cor
	private Color color; // Atributo Color

	public ColorShape(Shape shape, Color color) { // Construtor é criado. Recebe como parâmetros os métodos Shape e Color.
		super(shape); // Chama o construtor da Super-Classe.
		this.color = color;
	}
	
	@Override
	public void draw(Graphics g) { // Sobrescrevo também o método draw.
		Graphics gCopy = g.create(); // Tem a ver com api Swing do java. Para não influenciar as outras cores que sejam criadas. Cria uma cópia.
		
		gCopy.setColor(color); // Chamando o método seColor para por cor em Shape. Lembrando que esse color, é a cor o que foi passado no construtor.
		super.draw(gCopy);
		
		gCopy.dispose(); // livra-se da cópia criada.
	}
}
