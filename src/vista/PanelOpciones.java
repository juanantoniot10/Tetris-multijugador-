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
	private JPanel panelValorOpcion;
	private JLabel lblNivelInicial;
	private JLabel lblTamañoTablero;
	private JLabel lblColorFiguras;
	private JLabel lblColorFondo;
	private JLabel configurarTeclas;
	public PanelOpciones() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelNombreOpcion = new JPanel();
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
		
		btnConfigurarTeclas = new JButton("Configurar Teclas");
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
		
		panelValorOpcion = new JPanel();
		add(panelValorOpcion, BorderLayout.EAST);
		panelValorOpcion.setLayout(new BoxLayout(panelValorOpcion, BoxLayout.Y_AXIS));
		
		JPanel panelMuestraOpcion = new JPanel();
		panelMuestraOpcion.setMaximumSize(new Dimension(50, 32767));
		add(panelMuestraOpcion, BorderLayout.CENTER);
		panelMuestraOpcion.setLayout(new BoxLayout(panelMuestraOpcion, BoxLayout.Y_AXIS));
		
		lblNivelInicial = new JLabel("");
		lblNivelInicial.setMaximumSize(new Dimension(4400, 400));
		lblNivelInicial.setMinimumSize(new Dimension(50, 23));
		panelMuestraOpcion.add(lblNivelInicial);
		
		lblTamañoTablero = new JLabel("");
		lblTamañoTablero.setMinimumSize(new Dimension(50, 23));
		lblTamañoTablero.setMaximumSize(new Dimension(4400, 400));
		panelMuestraOpcion.add(lblTamañoTablero);
		
		lblColorFiguras = new JLabel("");
		lblColorFiguras.setMinimumSize(new Dimension(50, 23));
		lblColorFiguras.setMaximumSize(new Dimension(4400, 400));
		panelMuestraOpcion.add(lblColorFiguras);
		
		lblColorFondo = new JLabel("");
		lblColorFondo.setMinimumSize(new Dimension(50, 23));
		lblColorFondo.setMaximumSize(new Dimension(4400, 400));
		panelMuestraOpcion.add(lblColorFondo);
		
		configurarTeclas = new JLabel("");
		configurarTeclas.setMinimumSize(new Dimension(50, 23));
		configurarTeclas.setMaximumSize(new Dimension(4400, 400));
		panelMuestraOpcion.add(configurarTeclas);
		
		JLabel rellenoPantalla = new JLabel("");
		rellenoPantalla.setMinimumSize(new Dimension(50, 23));
		rellenoPantalla.setMaximumSize(new Dimension(4400, 400));
		panelMuestraOpcion.add(rellenoPantalla);
	}
	
}
