package softblue.designpatterns;

public class GerenciadorSecurity3 {
	
	private static GerenciadorSecurity3 instance;
	
	private GerenciadorSecurity3() {
	}
	
	public static GerenciadorSecurity3 getInstance() {
		if (instance == null) {
			synchronized (GerenciadorSecurity3.class) {
				if (instance == null) {
					instance = new GerenciadorSecurity3();
				}
			}
		}
		return instance;
	}

	public void login() {
		
	}
}