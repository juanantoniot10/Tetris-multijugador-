package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Color;

public class PanelTamanhoTablero extends JPanel{
	private JButton clasico;
	private JButton pequenho;
	private JButton grande;
	private JButton gigante;
	private JButton cuadrado;
	private JButton alargado;
	private JButton aleatorio;
	public PanelTamanhoTablero() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		clasico = new JButton("clasico 10x20");
		clasico.setName("1");
		clasico.setMinimumSize(new Dimension(43, 23));
		clasico.setMaximumSize(new Dimension(2220, 400));
		clasico.setMargin(new Insets(20, 20, 20, 20));
		clasico.setHorizontalTextPosition(SwingConstants.LEADING);
		clasico.setFont(new Font("Pristina", Font.BOLD, 25));
		add(clasico);
		
		pequenho = new JButton("peque\u00F1o 5x10");
		pequenho.setName("2");
		pequenho.setMinimumSize(new Dimension(43, 23));
		pequenho.setMaximumSize(new Dimension(2220, 400));
		pequenho.setMargin(new Insets(20, 20, 20, 20));
		pequenho.setHorizontalTextPosition(SwingConstants.LEADING);
		pequenho.setFont(new Font("Pristina", Font.BOLD, 25));
		add(pequenho);
		
		grande = new JButton("grande 15x30");
		grande.setName("3");
		grande.setMinimumSize(new Dimension(43, 23));
		grande.setMaximumSize(new Dimension(2220, 400));
		grande.setMargin(new Insets(20, 20, 20, 20));
		grande.setHorizontalTextPosition(SwingConstants.LEADING);
		grande.setFont(new Font("Pristina", Font.BOLD, 25));
		add(grande);
		
		gigante = new JButton("gigante 20x40");
		gigante.setName("4");
		gigante.setMinimumSize(new Dimension(43, 23));
		gigante.setMaximumSize(new Dimension(2220, 400));
		gigante.setMargin(new Insets(20, 20, 20, 20));
		gigante.setHorizontalTextPosition(SwingConstants.LEADING);
		gigante.setFont(new Font("Pristina", Font.BOLD, 25));
		add(gigante);
		
		cuadrado = new JButton("cuadrado 10x10");
		cuadrado.setName("5");
		cuadrado.setMinimumSize(new Dimension(43, 23));
		cuadrado.setMaximumSize(new Dimension(2220, 400));
		cuadrado.setMargin(new Insets(20, 20, 20, 20));
		cuadrado.setHorizontalTextPosition(SwingConstants.LEADING);
		cuadrado.setFont(new Font("Pristina", Font.BOLD, 25));
		add(cuadrado);
		
		alargado = new JButton("alargado 4x30");
		alargado.setName("6");
		alargado.setMinimumSize(new Dimension(43, 23));
		alargado.setMaximumSize(new Dimension(2220, 400));
		alargado.setMargin(new Insets(20, 20, 20, 20));
		alargado.setHorizontalTextPosition(SwingConstants.LEADING);
		alargado.setFont(new Font("Pristina", Font.BOLD, 24));
		add(alargado);
		
		aleatorio = new JButton("aleatorio");
		aleatorio.setName("7");
		aleatorio.setMinimumSize(new Dimension(43, 23));
		aleatorio.setMaximumSize(new Dimension(2220, 400));
		aleatorio.setMargin(new Insets(20, 20, 20, 20));
		aleatorio.setHorizontalTextPosition(SwingConstants.LEADING);
		aleatorio.setFont(new Font("Pristina", Font.BOLD, 25));
		add(aleatorio);
	}
	
}
