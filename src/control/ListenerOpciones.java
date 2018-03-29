package control;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import vista.ConfigurarTeclas;
import vista.PanelOpciones;
import vista.panelColorFiguras;
import vista.panelElegirColorFondo;
import vista.panelElegirNivel;
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
	private JPanel panelNombreOpciones;
	
	
	
	public ListenerOpciones(JPanel panelPrincipal, JPanel panelPuntuacion,PanelOpciones panelOpciones) {
		super();
		this.panelPrincipal = panelPrincipal;
		this.panelPuntuacion = panelPuntuacion;
		this.panelOpciones = panelOpciones;
		this.configurarTeclas = new ConfigurarTeclas();
		this.panelColorFiguras = new panelColorFiguras();
		this.panelElegirColorFondo =  new panelElegirColorFondo();
		this.panelElegirNivel = new panelElegirNivel();
		this.panelTamanhoTablero = new panelTamanhoTablero();
		this.panelNombreOpciones = this.panelOpciones.getPanelNombreOpcion();
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
			
		default:
			break;
		}
	}
	
}
