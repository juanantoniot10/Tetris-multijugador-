package vista;

import javax.swing.JPanel;

import modelo.CuadradoParaPieza;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Insets;

public class PanelJuego extends JPanel{
	private JButton espacios[][];
	private JPanel panelPiezas;
	private int filas;
	private int columnas;
	public PanelJuego(int filas,int columnas) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		generarEspacios(filas, columnas);
		
	}

	private void generarEspacios(int filas, int columnas) {
		this.filas=filas;
		this.columnas=columnas;
		if(filas>0 &&columnas>0) {
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

	public JButton[][] getEspacios() {
		return espacios;
	}

	public void setEspacios(JButton[][] espacios) {
		this.espacios = espacios;
	}

	public JPanel getPanelPiezas() {
		return panelPiezas;
	}

	public void setPanelPiezas(JPanel panelPiezas) {
		this.panelPiezas = panelPiezas;
	}

	public void actualizarEspacios(CuadradoParaPieza cuadradoParaPieza,PanelJuego panelP) {
		panelP.espacios = new JButton[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (cuadradoParaPieza.getPosicion()[0]==i && cuadradoParaPieza.getPosicion()[1]==j) {
					panelP.espacios[i][j] = cuadradoParaPieza.getBtncuadrado();
				}
				else {
					panelP.espacios[i][j] = new JButton();
					panelP.espacios[i][j].setBackground(new Color(111, 112, 1));
					panelP.espacios[i][j].setMargin(new Insets(0, 0, 0, 0));
					panelPiezas.add(panelP.espacios[i][j]);
				}
				
			}
		}
		
	}

	
}
