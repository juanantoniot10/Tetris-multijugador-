package control;

import javax.swing.JButton;
import javax.swing.JPanel;

import modelo.Casilla;
import modelo.Palito;
import modelo.Pieza;
import modelo.Puntuacion;
import modelo.Tablero;
import vista.PanelJuego;

public class Juego {
	private Tablero tablero;
	private Puntuacion puntuacion;
	private PanelJuego panelJuego;
	private JPanel panelPuntuacion;
	private Pieza piezaActiva;
	private boolean finDeJuego = false;
	
	public Juego(Tablero tablero, Puntuacion puntuacion,PanelJuego panelJuego, JPanel panelPuntuacion) {
		super();
		this.tablero = tablero;
		this.puntuacion = puntuacion;
		this.panelJuego = panelJuego;
		this.panelPuntuacion= panelPuntuacion;
	}
	
	public void jugar() {
		this.piezaActiva = new Palito((this.tablero.getCasillas()[0].length/2)+2);
		this.piezaActiva.setActiva(true);
		asignarCuadradosACasillas();
		pintarPieza();
	}

	private void pintarPieza() {
		panelJuego.removeAll();
		
		for (int i = 0; i < this.piezaActiva.getCuadrados().length; i++) {
			JButton espacio = this.panelJuego.getEspacios()[obtenerPosicionX(i)][obtenerPosicionY(i)];
			panelJuego.actualizarEspacios(this.piezaActiva.getCuadrados()[i],this.panelJuego);
		}
		
	}

	/**
	 * @param i
	 * @return
	 */
	private JButton obtenerBotonDeCuadrado(int i) {
		return this.piezaActiva.getCuadrados()[i].getBtncuadrado();
	}

	/**
	 * 
	 */
	private void asignarCuadradosACasillas() {
		for (int i = 0; i < this.piezaActiva.getCuadrados().length; i++) {
			if (obtenerCasilla(i).isOcupada()) finDeJuego = true;
			asignarCuadradoACasilla(i);
			obtenerCasilla(i).setOcupada(true);
		}
	}

	/**
	 * @param i
	 */
	private void asignarCuadradoACasilla(int i) {
		obtenerCasilla(i).setCuadradoParaPieza(this.piezaActiva.getCuadrados()[i]);
	}

	/**
	 * @param i
	 * @return
	 */
	private Casilla obtenerCasilla(int i) {
		return this.tablero.getCasillas()[obtenerPosicionX(i)] [obtenerPosicionY(i)];
	}

	/**
	 * @param i
	 * @return
	 */
	private int obtenerPosicionY(int i) {
		return this.piezaActiva.getCuadrados()[i].getPosicion()[1];
	}

	/**
	 * @param i
	 * @return
	 */
	private int obtenerPosicionX(int i) {
		return this.piezaActiva.getCuadrados()[i].getPosicion()[0];
	}
	
	public boolean comprobarFinDeJuego() {
		return finDeJuego;
	}
		
}
