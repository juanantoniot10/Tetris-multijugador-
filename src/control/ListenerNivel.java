package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import modelo.Tablero;

public class ListenerNivel implements ActionListener{
	
	private JLabel nivel;
	
	public ListenerNivel(JLabel nivel) {
		super();
		this.nivel = nivel;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		this.nivel.setText(obtenerNumeroNivel(((JButton)e.getSource())));
	}
	
	
	private String obtenerNumeroNivel(JButton boton) {
		int posicionEspacio=String.valueOf(boton.getText()).indexOf(' ');
		return String.valueOf(boton.getText()).substring(posicionEspacio+1);
	}
}
