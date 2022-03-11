package tuyo.designpatterns;

public class Suco extends Bebida {

	@Override
	public void adicionarAgua() {
		System.out.println("Adicionando �gua ao suco");
	}

	@Override
	public void adicionarSubstancia() {
		System.out.println("Adicionando suco");
	}

	@Override
	public boolean colocarAcucar() {
		return true;
	}

	@Override
	public void adicionarAcucar() {
		System.out.println("Adicionando a��car ao suco");
	}

	@Override
	public void mexer() {
		System.out.println("Mexendo o suco");
	}	
}
