package softblue.designpatterns;

public class Application {

	public static void main(String[] args) {
		
		GerenciadorSecurity sm1 = GerenciadorSecurity.getInstance();
		sm1.login();
		
		GerenciadorSecurity sm2 = GerenciadorSecurity.getInstance();
		sm2.login();

	}
}
