package modelo;

public class Casilla {
	private boolean ocupada = false;
	private CuadradoParaPieza cuadradoParaPieza;
	
	public Casilla() {
		super();
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	public CuadradoParaPieza getCuadradoParaPieza() {
		return cuadradoParaPieza;
	}
	public void setCuadradoParaPieza(CuadradoParaPieza cuadradoParaPieza) {
		this.cuadradoParaPieza = cuadradoParaPieza;
	}
}
