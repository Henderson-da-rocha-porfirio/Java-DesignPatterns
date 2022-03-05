package softblue.designpatterns;

public class GerenciadorSecurity {
	
	private static GerenciadorSecurity instance;
	
	private GerenciadorSecurity() {
	}
	
	public static GerenciadorSecurity getInstance() {
		if (instance == null) {
			instance = new GerenciadorSecurity();
		}
		return instance;
	}

	public void login() {
		
	}
}
