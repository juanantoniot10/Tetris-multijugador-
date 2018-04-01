package modelo;

public abstract class Pieza {
	private CuadradoParaPieza cuadrados[][];
	private boolean activa;
	
	public abstract void cambiarFormaPieza();
	
	public void moverPieza(int lateral,int vertical) {
		for (int i = 0; i < this.cuadrados.length; i++) {
			for (int j = 0; j < this.cuadrados[i].length; j++) {
				this.cuadrados[i][j].desplazarCuadrado(lateral, vertical);
			}
		}
	}
	
	
	public CuadradoParaPieza[][] getCuadrados() {
		return cuadrados;
	}
	public void setCuadrados(CuadradoParaPieza[][] cuadrados) {
		this.cuadrados = cuadrados;
	}
	public boolean isActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	
}
