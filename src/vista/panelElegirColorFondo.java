package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Color;

public class panelElegirColorFondo extends JPanel{
	private JButton verde;
	private JButton cyan;
	private JButton naranja;
	private JButton rojo;
	private JButton azul;
	private JButton magenta;
	private JButton amarillo;
	private JButton rosa;
	private JButton gris;
	public panelElegirColorFondo() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		verde = new JButton("verde");
		verde.setBackground(Color.GREEN);
		verde.setName("1");
		verde.setMinimumSize(new Dimension(43, 23));
		verde.setMaximumSize(new Dimension(2220, 400));
		verde.setMargin(new Insets(20, 20, 20, 20));
		verde.setHorizontalTextPosition(SwingConstants.LEADING);
		verde.setFont(new Font("Pristina", Font.BOLD, 25));
		add(verde);
		
		cyan = new JButton("cyan");
		cyan.setBackground(Color.CYAN);
		cyan.setName("2");
		cyan.setMinimumSize(new Dimension(43, 23));
		cyan.setMaximumSize(new Dimension(2220, 400));
		cyan.setMargin(new Insets(20, 20, 20, 20));
		cyan.setHorizontalTextPosition(SwingConstants.LEADING);
		cyan.setFont(new Font("Pristina", Font.BOLD, 25));
		add(cyan);
		
		naranja = new JButton("naranja");
		naranja.setBackground(Color.ORANGE);
		naranja.setName("3");
		naranja.setMinimumSize(new Dimension(43, 23));
		naranja.setMaximumSize(new Dimension(2220, 400));
		naranja.setMargin(new Insets(20, 20, 20, 20));
		naranja.setHorizontalTextPosition(SwingConstants.LEADING);
		naranja.setFont(new Font("Pristina", Font.BOLD, 25));
		add(naranja);
		
		rojo = new JButton("rojo");
		rojo.setBackground(Color.RED);
		rojo.setName("4");
		rojo.setMinimumSize(new Dimension(43, 23));
		rojo.setMaximumSize(new Dimension(2220, 400));
		rojo.setMargin(new Insets(20, 20, 20, 20));
		rojo.setHorizontalTextPosition(SwingConstants.LEADING);
		rojo.setFont(new Font("Pristina", Font.BOLD, 25));
		add(rojo);
		
		azul = new JButton("azul");
		azul.setBackground(Color.BLUE);
		azul.setName("5");
		azul.setMinimumSize(new Dimension(43, 23));
		azul.setMaximumSize(new Dimension(2220, 400));
		azul.setMargin(new Insets(20, 20, 20, 20));
		azul.setHorizontalTextPosition(SwingConstants.LEADING);
		azul.setFont(new Font("Pristina", Font.BOLD, 25));
		add(azul);
		
		magenta = new JButton("magenta");
		magenta.setBackground(Color.MAGENTA);
		magenta.setName("6");
		magenta.setMinimumSize(new Dimension(43, 23));
		magenta.setMaximumSize(new Dimension(2220, 400));
		magenta.setMargin(new Insets(20, 20, 20, 20));
		magenta.setHorizontalTextPosition(SwingConstants.LEADING);
		magenta.setFont(new Font("Pristina", Font.BOLD, 24));
		add(magenta);
		
		amarillo = new JButton("amarillo");
		amarillo.setBackground(Color.YELLOW);
		amarillo.setName("7");
		amarillo.setMinimumSize(new Dimension(43, 23));
		amarillo.setMaximumSize(new Dimension(2220, 400));
		amarillo.setMargin(new Insets(20, 20, 20, 20));
		amarillo.setHorizontalTextPosition(SwingConstants.LEADING);
		amarillo.setFont(new Font("Pristina", Font.BOLD, 25));
		add(amarillo);
		
		rosa = new JButton("rosa");
		rosa.setBackground(Color.PINK);
		rosa.setName("8");
		rosa.setMinimumSize(new Dimension(43, 23));
		rosa.setMaximumSize(new Dimension(2220, 400));
		rosa.setMargin(new Insets(20, 20, 20, 20));
		rosa.setHorizontalTextPosition(SwingConstants.LEADING);
		rosa.setFont(new Font("Pristina", Font.BOLD, 25));
		add(rosa);
		
		gris = new JButton("gris");
		gris.setBackground(Color.GRAY);
		gris.setName("9");
		gris.setMinimumSize(new Dimension(43, 23));
		gris.setMaximumSize(new Dimension(2220, 400));
		gris.setMargin(new Insets(20, 20, 20, 20));
		gris.setHorizontalTextPosition(SwingConstants.LEADING);
		gris.setFont(new Font("Pristina", Font.BOLD, 24));
		add(gris);
	}
	
}
