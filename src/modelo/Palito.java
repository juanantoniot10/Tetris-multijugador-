package modelo;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.JButton;

public class Palito extends Pieza {
	private final int tamanio=4;
	public Palito(int posicionY) {
		super();
		this.setCuadrados(new CuadradoParaPieza[tamanio]);
		for (int i = 0; i < this.getCuadrados().length; i++) {
			JButton boton=new JButton();
			boton.setBackground(new Color(011, 11, 1));
			boton.setMargin(new Insets(0, 0, 0, 0));
			int posicion [] = {0,posicionY};
			this.getCuadrados()[i]= new CuadradoParaPieza(boton,posicion);
		}
	}

	@Override
	public void cambiarFormaPieza() {
		if (isVertical()) {
			ponerHorizontal();
		}
		else {
			ponerVertical();
		}
	}

	/**
	 * 
	 */
	private void ponerVertical() {
		for (int i = 0; i < this.getCuadrados().length; i++) {
			this.getCuadrados()[i].desplazarCuadrado(-3+i, 3-i);
		}
	}

	/**
	 * 
	 */
	private void ponerHorizontal() {
		for (int i = 0; i < this.getCuadrados().length; i++) {
		this.getCuadrados()[i].desplazarCuadrado(3-i, -3+i);
		}
	}

	/**
	 * @return
	 */
	private boolean isVertical() {
		return this.getCuadrados()[0].getPosicion()[0]!=this.getCuadrados()[1].getPosicion()[0];
	}

}
