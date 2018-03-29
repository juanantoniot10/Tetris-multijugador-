package modelo;

public class Tablero {
	Casilla casillas [][];

	public Tablero(int filas,int columnas) {
		super();
		this.casillas = new Casilla [filas][columnas];
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas.length; j++) {
				casillas[i][j] = new Casilla(i,j);
			}
		}
	}
	
}
