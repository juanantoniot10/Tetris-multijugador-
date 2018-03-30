package control;

import modelo.Tablero;

public class Iniciador {
	private Tablero tablero;
	private int filas;
	private int columnas;
	
	
	public Iniciador (int filas,int columnas) {
		this.setTablero(new Tablero(filas, columnas));
		this.filas=filas;
		this.columnas=columnas;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
}
