package modelo;

public abstract class Pieza {
	private CuadradoParaPieza cuadrados[];
	private boolean activa;
	
	public abstract void cambiarFormaPieza();
	
	public void moverPieza(int lateral,int vertical,long tiempo) {
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < this.cuadrados.length; i++) {
			this.cuadrados[i].desplazarCuadrado(lateral, vertical);
		}
	}
	
	
	public CuadradoParaPieza[] getCuadrados() {
		return cuadrados;
	}
	public void setCuadrados(CuadradoParaPieza[] cuadrados) {
		this.cuadrados = cuadrados;
	}
	public boolean isActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	
}
