package tuyo.designpatterns;

public class App { // Aplicação de preparo de bebidas.

	public static void main(String[] args) {
	
		//Suco s = new Suco();  => Instanciando Suco. E esse objeto é o responsável no preparo do suco
		//s.preparar(); => pedindo para preparar o suco.
		
		Cha c = new Cha(); // Instanciando o Cha.
		c.preparar();
	}
}
