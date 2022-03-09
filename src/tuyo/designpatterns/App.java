package tuyo.designpatterns;

public class App {

	public static void main(String[] args) {

//		TemperatureClassAdapter adapter = new TemperatureClassAdapter();
//		adapter.setValue(30);
//																			// Exemplo de uso do adapter com Herança
//		System.out.println(adapter.getValue());
//		System.out.println(adapter.getValueInFahrenheit());
		
		Temperature temperature = new Temperature(); 						// Parte descomentada, exemplo de uso de adapter com objeto
		
		TemperatureObjectAdapter adapter = new TemperatureObjectAdapter(temperature);
		adapter.setValue(30);
		
		System.out.println(adapter.getValue());
		System.out.println(temperature.getValue());
	}
}
