package softblue.designpatterns;

public class GerenciadorSecurity2 {
	
	private static GerenciadorSecurity2 instance;
	
	static {
		try {
			instance = new GerenciadorSecurity2();
		} catch (Exception e) {
			//tratar exce��o
		}
	}
	
	private GerenciadorSecurity2() {
	}
	
	public static GerenciadorSecurity2 getInstance() {
		return instance;
	}

	public void login() {
		
	}
}
