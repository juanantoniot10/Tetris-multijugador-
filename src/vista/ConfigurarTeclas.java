package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfigurarTeclas extends JPanel{
	public ConfigurarTeclas() {
		setBackground(new Color(255, 218, 185));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel lblAlgunDiaSi = new JLabel("ALGUN DIA SI TENGO TIEMPO");
		lblAlgunDiaSi.setFont(new Font("Pristina", Font.BOLD, 25));
		add(lblAlgunDiaSi);
		
	}
}
