package tuyo.designpatterns.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import tuyo.designpatterns.TextObserver;
import tuyo.designpatterns.WeatherForecast;

public class TextPanel extends JPanel {

	public TextPanel() {
		JTextField txtTemperature = new JTextField(20);
		txtTemperature.setEnabled(false);
		add(txtTemperature);
		
		TextObserver observer = new TextObserver(txtTemperature);
		WeatherForecast.getInstance().registerObserver(observer);
	}
}
