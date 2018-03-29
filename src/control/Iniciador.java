package control;

import modelo.Tablero;

public class Iniciador {
	private Tablero tablero;
	

	public Iniciador(int filas,int columnas) {
		super();
		this.setTablero(new Tablero(filas, columnas));
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}
}
