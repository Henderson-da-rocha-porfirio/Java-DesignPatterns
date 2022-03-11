package tuyo.designpatterns;

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
	} // retorna false por não ter o método colocar açúcar ainda.

	@Override
	public void adicionarAcucar() { // Este método será ignorado pelo retorno false anterior.
		
	}

	@Override
	public void mexer() {
		System.out.println("Mexendo o chá");
	}	
}
