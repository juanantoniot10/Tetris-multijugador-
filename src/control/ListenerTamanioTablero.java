package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ListenerTamanioTablero implements ActionListener{
	
	private JLabel tamanio;
	private Iniciador iniciador;
	
	
	public ListenerTamanioTablero(JLabel tamanio, Iniciador iniciador) {
		super();
		this.tamanio = tamanio;
		this.iniciador = iniciador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = ((JButton)e.getSource());
		this.tamanio.setText(obtenerTextoTamano(boton));
		this.iniciador.setFilas(obtenerFilas(boton));
		this.iniciador.setColumnas(obtenerColumnas(boton));
		
	}
	private int obtenerColumnas(JButton boton) {
		int posicionInicio = boton.getText().indexOf('x')+1;
		return Integer.valueOf(String.valueOf(boton.getText()).substring(posicionInicio));
	}

	private int obtenerFilas(JButton boton) {
		int posicionInicio = boton.getText().indexOf(' ')+1;
		int posicionFin = boton.getText().indexOf('x');
		return Integer.valueOf(String.valueOf(boton.getText().substring(posicionInicio,posicionFin)));
	}

	private String obtenerTextoTamano(JButton boton) {
		return String.valueOf(boton.getText());
	}
}
