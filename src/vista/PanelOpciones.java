package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Insets;
import javax.swing.JLabel;

public class PanelOpciones extends JPanel{
	private JButton btnNivel;
	private JButton btnTamaopantalla;
	private JButton btnColorFiguras;
	private JButton btnColorDeFondo;
	private JButton btnConfigurarTeclas;
	private JButton btnIniciarJuego;
	private JPanel panelNombreOpcion;
	public PanelOpciones() {
		setLayout(new BorderLayout(0, 0));
		
		panelNombreOpcion = new JPanel();
		panelNombreOpcion.setBackground(Color.BLACK);
		add(panelNombreOpcion, BorderLayout.WEST);
		panelNombreOpcion.setLayout(new BoxLayout(panelNombreOpcion, BoxLayout.Y_AXIS));
		
		btnNivel = new JButton("Nivel inicial");
		btnNivel.setMinimumSize(new Dimension(43, 23));
		btnNivel.setMargin(new Insets(20, 20, 20, 20));
		btnNivel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNivel.setFont(new Font("Pristina", Font.BOLD, 25));
		btnNivel.setMaximumSize(new Dimension(2220, 400));
		btnNivel.setHorizontalTextPosition(SwingConstants.LEADING);
		panelNombreOpcion.add(btnNivel);
		
		btnTamaopantalla = new JButton("Tama\u00F1o tablero");
		btnTamaopantalla.setMinimumSize(new Dimension(43, 23));
		btnTamaopantalla.setMaximumSize(new Dimension(2220, 400));
		btnTamaopantalla.setMargin(new Insets(20, 20, 20, 20));
		btnTamaopantalla.setHorizontalTextPosition(SwingConstants.LEADING);
		btnTamaopantalla.setFont(new Font("Pristina", Font.BOLD, 25));
		panelNombreOpcion.add(btnTamaopantalla);
		
		btnColorFiguras = new JButton("Color figuras");
		btnColorFiguras.setMinimumSize(new Dimension(43, 23));
		btnColorFiguras.setMaximumSize(new Dimension(2220, 400));
		btnColorFiguras.setMargin(new Insets(20, 20, 20, 20));
		btnColorFiguras.setHorizontalTextPosition(SwingConstants.LEADING);
		btnColorFiguras.setFont(new Font("Pristina", Font.BOLD, 25));
		panelNombreOpcion.add(btnColorFiguras);
		
		btnColorDeFondo = new JButton("Color de fondo");
		btnColorDeFondo.setMinimumSize(new Dimension(43, 23));
		btnColorDeFondo.setMaximumSize(new Dimension(2220, 400));
		btnColorDeFondo.setMargin(new Insets(20, 20, 20, 20));
		btnColorDeFondo.setHorizontalTextPosition(SwingConstants.LEADING);
		btnColorDeFondo.setFont(new Font("Pristina", Font.BOLD, 25));
		panelNombreOpcion.add(btnColorDeFondo);
		
		btnConfigurarTeclas = new JButton("Configurar teclas");
		btnConfigurarTeclas.setMinimumSize(new Dimension(43, 23));
		btnConfigurarTeclas.setMaximumSize(new Dimension(2220, 400));
		btnConfigurarTeclas.setMargin(new Insets(20, 20, 20, 20));
		btnConfigurarTeclas.setHorizontalTextPosition(SwingConstants.LEADING);
		btnConfigurarTeclas.setFont(new Font("Pristina", Font.BOLD, 25));
		panelNombreOpcion.add(btnConfigurarTeclas);
		
		btnIniciarJuego = new JButton("INICIAR JUEGO");
		btnIniciarJuego.setMinimumSize(new Dimension(43, 23));
		btnIniciarJuego.setMaximumSize(new Dimension(2220, 400));
		btnIniciarJuego.setMargin(new Insets(20, 20, 20, 20));
		btnIniciarJuego.setHorizontalTextPosition(SwingConstants.LEADING);
		btnIniciarJuego.setFont(new Font("Pristina", Font.BOLD, 24));
		panelNombreOpcion.add(btnIniciarJuego);
	}
	public JPanel getPanelNombreOpcion() {
		return panelNombreOpcion;
	}
	public void setPanelNombreOpcion(JPanel panelNombreOpcion) {
		this.panelNombreOpcion = panelNombreOpcion;
	}	
	
}
