package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import modelo.Puntuacion;
import modelo.Tablero;

public class ListenerNivel implements ActionListener{
	
	private JLabel nivel;
	private Puntuacion puntuacion;
	
	public ListenerNivel(JLabel nivel,Puntuacion puntuacion) {
		super();
		this.nivel = nivel;
		this.puntuacion = puntuacion;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		this.nivel.setText(obtenerNumeroNivel(((JButton)e.getSource())));
		this.puntuacion.setNivel(Integer.valueOf(((JButton)e.getSource()).getName()));
		this.puntuacion.setPuntuacion(0);
	}
	
	
	private String obtenerNumeroNivel(JButton boton) {
		int posicionEspacio=String.valueOf(boton.getText()).indexOf(' ');
		return String.valueOf(boton.getText()).substring(posicionEspacio+1);
	}
}
