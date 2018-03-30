package control;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import modelo.Juego;
import vista.ConfigurarTeclas;
import vista.PanelOpciones;
import vista.panelColorFiguras;
import vista.panelElegirColorFondo;
import vista.panelElegirNivel;
import vista.panelJuego;
import vista.panelTamanhoTablero;

public class ListenerOpciones implements ActionListener{

	private JPanel panelPrincipal;
	private JPanel panelPuntuacion;
	private ConfigurarTeclas configurarTeclas;
	private panelColorFiguras panelColorFiguras ;
	private panelElegirColorFondo panelElegirColorFondo;
	private panelElegirNivel panelElegirNivel;
	private PanelOpciones panelOpciones;
	private panelTamanhoTablero panelTamanhoTablero;
	private panelJuego panelJuego;
	private JPanel panelNombreOpciones;
	private Juego juego;
	private JLabel nivel;
	private JLabel puntos;
	private JLabel tamanioTablero;
	private Iniciador iniciador;
	private ListenerNivel listenerNivel ;
	private ListenerTamanioTablero listenerTamanioTablero ;
	private ListenerColorFondo listenerColorFondo;
	
	
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
		this.panelColorFiguras = new panelColorFiguras();
		this.iniciador = new Iniciador(10, 20);
		
		this.panelElegirColorFondo =  new panelElegirColorFondo();
		this.listenerColorFondo = new ListenerColorFondo(this.panelPrincipal.getParent());
		ponerListenersPanelColor(this.panelElegirColorFondo,this.listenerColorFondo);
		
		this.panelElegirNivel = new panelElegirNivel();
		this.listenerNivel= new ListenerNivel(nivel);
		ponerListenersPanel(this.panelElegirNivel,this.listenerNivel);
		
		this.panelTamanhoTablero = new panelTamanhoTablero();
		this.listenerTamanioTablero = new ListenerTamanioTablero(this.tamanioTablero,this.iniciador);
		ponerListenersPanel(this.panelTamanhoTablero,this.listenerTamanioTablero);
		
		this.panelJuego = new panelJuego(this.iniciador.getFilas(), this.iniciador.getColumnas());
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
			SwingUtilities.updateComponentTreeUI(panelPrincipal);
			break;
		case "Tamaño tablero":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(panelTamanhoTablero,BorderLayout.CENTER);
			SwingUtilities.updateComponentTreeUI(panelPrincipal);
			break;
		case "Color figuras":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(panelColorFiguras,BorderLayout.CENTER);
			SwingUtilities.updateComponentTreeUI(panelPrincipal);
			break;	
		case "Color de fondo":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(panelElegirColorFondo,BorderLayout.CENTER);
			SwingUtilities.updateComponentTreeUI(panelPrincipal);
			break;
		case "Configurar teclas":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelNombreOpciones,BorderLayout.WEST);
			this.panelOpciones.add(configurarTeclas,BorderLayout.CENTER);
			SwingUtilities.updateComponentTreeUI(panelPrincipal);
			break;
		case "INICIAR JUEGO":
			this.panelOpciones.removeAll();
			this.panelOpciones.add(panelJuego,BorderLayout.CENTER);
			SwingUtilities.updateComponentTreeUI(panelPrincipal);
			break;
		}
	}
	
}
