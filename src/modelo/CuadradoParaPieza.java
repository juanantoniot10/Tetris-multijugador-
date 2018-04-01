package modelo;

import javax.swing.JLabel;

public class CuadradoParaPieza {
	private JLabel cuadrado;
	private int posicion[];
	private boolean visible;
	
	public void desplazarCuadrado(int lateral,int vertical) {
		this.posicion[0]+=lateral;
		this.posicion[1]+=vertical;
	}

	public JLabel getCuadrado() {
		return cuadrado;
	}

	public void setCuadrado(JLabel cuadrado) {
		this.cuadrado = cuadrado;
	}

	public int[] getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion[]) {
		this.posicion = posicion;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
