package modelo;

public class Tablero {
	Casilla casillas [][];

	public Tablero(int filas,int columnas) {
		super();
		this.casillas = new Casilla [columnas][filas];
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				casillas[i][j] = new Casilla();
			}
		}
	}

	public Casilla[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(Casilla[][] casillas) {
		this.casillas = casillas;
	}
	
}
