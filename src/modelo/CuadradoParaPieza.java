package modelo;

import javax.swing.JButton;

public class CuadradoParaPieza {
	private JButton btncuadrado;
	private int posicion[];
	private boolean visible;
	
	
	
	

	public CuadradoParaPieza(JButton btnCuadrado, int[] posicion) {
		super();
		this.btncuadrado = btnCuadrado;
		this.posicion = posicion;
		this.visible = true;
		
	}

	public void desplazarCuadrado(int lateral,int vertical) {
		this.posicion[0]+=lateral;
		this.posicion[1]+=vertical;
	}
	
	public JButton getBtncuadrado() {
		return btncuadrado;
	}

	public void setBtncuadrado(JButton btncuadrado) {
		this.btncuadrado = btncuadrado;
	}

	public int[] getPosicion() {
		return posicion;
	}

	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
