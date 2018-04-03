package control;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import modelo.Puntuacion;
import vista.ConfigurarTeclas;
import vista.PanelOpciones;
import vista.PanelColorFiguras;
import vista.PanelElegirColorFondo;
import vista.PanelElegirNivel;
import vista.PanelJuego;
import vista.PanelTamanhoTablero;

public class ListenerOpciones implements ActionListener{

	private JPanel panelPrincipal;
	private JPanel panelPuntuacion;
	private ConfigurarTeclas configurarTeclas;
	private PanelColorFiguras panelColorFiguras ;
	private PanelElegirColorFondo panelElegirColorFondo;
	private PanelElegirNivel panelElegirNivel;
	private PanelOpciones panelOpciones;
	private PanelTamanhoTablero panelTamanhoTablero;
	private PanelJuego panelJuego;
	private JPanel panelNombreOpciones;
	private Juego juego;
	private JLabel nivel;
	private JLabel puntos;
	private JLabel tamanioTablero;
	private Iniciador iniciador;
	private Puntuacion puntuacion;
	private ListenerNivel listenerNivel ;
	private ListenerTamanioTablero listenerTamanioTablero ;
	private ListenerColorFondo listenerColorFondo;
	private ListenerJuego listenerJuego;
	
	
	public ListenerOpciones(JPanel panelPrincipal, JPanel panelPuntuacion,PanelOpciones panelOpciones, JLabel nivelImagen, JLabel puntos, JLabel tamanioTablero) {
		super();
		this.panelPrincipal = panelPrincipal;
		this.panelPuntuacion = panelPuntuacion;
		this.panelOpciones = panelOpciones;
		this.panelNombreOpciones = this.panelOpciones.getPanelNombreOpcion();
		this.nivel = nivelImagen;
		this.puntos = puntos;
		this.tamanioTablero=tamanioTablero;
		this.configurarTeclas = new ConfigurarTeclas();
		this.panelColorFiguras = new PanelColorFiguras();
		this.iniciador = new Iniciador(10, 20);
		
		this.panelElegirColorFondo =  new PanelElegirColorFondo();
		this.listenerColorFondo = new ListenerColorFondo(this.panelPrincipal.getParent());
		ponerListenersPanelColor(this.panelElegirColorFondo,this.listenerColorFondo);
		
		this.panelElegirNivel = new PanelElegirNivel();
		this.listenerNivel= new ListenerNivel(nivel,puntuacion);
		ponerListenersPanel(this.panelElegirNivel,this.listenerNivel);
		
		this.panelTamanhoTablero = new PanelTamanhoTablero();
		this.listenerTamanioTablero = new ListenerTamanioTablero(this.tamanioTablero,this.iniciador);
		ponerListenersPanel(this.panelTamanhoTablero,this.listenerTamanioTablero);
	}



	private void ponerListenersPanelColor(JPanel panelElegirColorFondo,ListenerColorFondo listenerColorFondo) {
		for (int i = 0; i < panelElegirColorFondo.getComponentCount(); i++) {
			for (int j = 0; j < ((JPanel)panelElegirColorFondo.getComponent(i)).getComponentCount(); j++) {
				((JButton)((JPanel)panelElegirColorFondo.getComponent(i)).getComponent(j)).addActionListener(listenerColorFondo);
			}
		}
		
	}



	/**
	 * 
	 */
	private void ponerListenersPanel(JPanel panel,ActionListener listener) {
		for (int i = 0; i < panel.getComponentCount(); i++) {
			((JButton)panel.getComponent(i)).addActionListener(listener);
		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botonPulsado = ((JButton)e.getSource());
		switch (String.valueOf(botonPulsado.getText())) {
		case "Nivel inicial":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(panelElegirNivel,BorderLayout.CENTER);
			recargarVista(this.panelPrincipal);
			break;
		case "Tamaño tablero":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(panelTamanhoTablero,BorderLayout.CENTER);
			recargarVista(this.panelPrincipal);
			break;
		case "Color figuras":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(panelColorFiguras,BorderLayout.CENTER);
			recargarVista(this.panelPrincipal);
			break;	
		case "Color de fondo":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(panelElegirColorFondo,BorderLayout.CENTER);
			recargarVista(this.panelPrincipal);
			break;
		case "Configurar teclas":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(configurarTeclas,BorderLayout.CENTER);
			recargarVista(this.panelPrincipal);
			break;
		case "INICIAR JUEGO":
			this.panelOpciones.removeAll();
			this.listenerJuego = new ListenerJuego();
			this.panelJuego = new PanelJuego(this.iniciador.getFilas(), this.iniciador.getColumnas());
			this.panelJuego.addKeyListener(listenerJuego);
			this.panelOpciones.add(this.panelJuego,BorderLayout.CENTER);
			recargarVista(this.panelPrincipal);
			this.juego = new Juego(this.iniciador.getTablero(), this.puntuacion,this.panelJuego,this.panelPuntuacion);
			do {
				juego.jugar();
			} while (juego.comprobarFinDeJuego()==false);
			
			break;
		}
	}





	/**
	 * 
	 */
	private void recargarVista(JPanel panel) {
		SwingUtilities.updateComponentTreeUI(panel);
	}
	
}
