package tuyo.designpatterns;

public class TemperatureObjectAdapter { // Exemplo de Adapter com objeto

	private Temperature temperature; // Atributo do tipo Temperature

	public TemperatureObjectAdapter(Temperature temperature) {
		this.temperature = temperature;
	} // Construtor

	public double getValue() {
		return (temperature.getValue() - 32) * 5 / 9;
	}
	
	public void setValue(double value) {
		temperature.setValue(value * 9 / 5 + 32);
	}
}
