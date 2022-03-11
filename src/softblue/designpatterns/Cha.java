package softblue.designpatterns;

public class Cha extends Bebida {

	@Override
	public void adicionarAgua() {
		System.out.println("Adicionando água ao chá");
	}

	@Override
	public void adicionarSubstancia() {
		System.out.println("Adicionando chá");
	}

	@Override
	public boolean colocarAcucar() {
		return false;
	}

	@Override
	public void adicionarAcucar() {
		
	}

	@Override
	public void mexer() {
		System.out.println("Mexendo o chá");
	}	
}
