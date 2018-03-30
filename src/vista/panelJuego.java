package vista;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Insets;

public class panelJuego extends JPanel{
	private JButton espacios[][];
	private JPanel panelPiezas;
	public panelJuego(int filas,int columnas) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		generarEspacios(filas, columnas);
		
	}

	private void generarEspacios(int filas, int columnas) {
		espacios = new JButton[filas][columnas];
		panelPiezas = new JPanel();
		GridLayout layout = new GridLayout( columnas,filas);
		layout.setHgap(0);
		layout.setVgap(0);
		panelPiezas.setLayout(layout);
		panelPiezas.setBorder(null);
		panelPiezas.setBackground(Color.BLACK);
		add(panelPiezas);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				espacios[i][j] = new JButton();
				espacios[i][j].setBackground(new Color(111, 112, 1));
				espacios[i][j].setMargin(new Insets(0, 0, 0, 0));
				panelPiezas.add(espacios[i][j]);
			}
		}
	}

	
}
