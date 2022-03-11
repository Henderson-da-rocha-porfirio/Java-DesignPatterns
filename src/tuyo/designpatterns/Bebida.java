package tuyo.designpatterns;

public abstract class Bebida { // Classe Bebida abstrata (genérica).

	public void preparar() { // Método que não é abstrato preparar. Ele é o responsável em preparar a bebida:
		
		adicionarAgua(); 			// 1. prepara adicionando água.
		adicionarSubstancia(); 		// 2. adiciona alguma substância.
		
		if (colocarAcucar()) { 		// 3. Adicionar açúcar se a bebida precisar de açúcar.
			adicionarAcucar();
		}
		
		mexer(); 					// 4. Mexer tudo para misturar.
	}

	// Métodos abstratos definidos:
	public abstract void adicionarAgua();
	public abstract void adicionarSubstancia();
	public abstract boolean colocarAcucar();
	public abstract void adicionarAcucar();
	public abstract void mexer();
}
