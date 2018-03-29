package vista;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import java.awt.Component;

public class VistaPrincipal extends JFrame{
	protected JPanel panelPrincipal;
	protected JPanel panelPuntuacion;
	private JLabel nivelImagen;
	private JLabel puntos;
	public VistaPrincipal() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelCabecera = new JPanel();
		panelCabecera.setBackground(Color.BLACK);
		getContentPane().add(panelCabecera, BorderLayout.NORTH);
		panelCabecera.setLayout(new BoxLayout(panelCabecera, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("T E T R I S");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel.setMaximumSize(new Dimension(3335, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), new Color(220, 20, 60), new Color(255, 0, 0), new Color(139, 0, 0)));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 40));
		lblNewLabel.setBackground(Color.BLACK);
		panelCabecera.add(lblNewLabel);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, SystemColor.textHighlight, SystemColor.activeCaption, Color.BLUE));
		panelPrincipal.setBackground(Color.BLACK);
		getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));
		
		panelPuntuacion = new JPanel();
		panelPuntuacion.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(50, 205, 50), new Color(124, 252, 0), new Color(154, 205, 50)));
		panelPuntuacion.setBackground(Color.BLACK);
		getContentPane().add(panelPuntuacion, BorderLayout.EAST);
		panelPuntuacion.setLayout(new BoxLayout(panelPuntuacion, BoxLayout.Y_AXIS));
		
		JLabel jugador1 = new JLabel("Jugador1");
		jugador1.setMinimumSize(new Dimension(65, 14));
		jugador1.setPreferredSize(new Dimension(200, 14));
		jugador1.setHorizontalAlignment(SwingConstants.CENTER);
		jugador1.setHorizontalTextPosition(SwingConstants.CENTER);
		jugador1.setMaximumSize(new Dimension(445, 44));
		jugador1.setFont(new Font("Tahoma", Font.BOLD, 16));
		jugador1.setForeground(Color.LIGHT_GRAY);
		panelPuntuacion.add(jugador1);
		
		JLabel nivel = new JLabel("nivel");
		nivel.setPreferredSize(new Dimension(200, 14));
		nivel.setMinimumSize(new Dimension(65, 14));
		nivel.setMaximumSize(new Dimension(445, 44));
		nivel.setHorizontalTextPosition(SwingConstants.CENTER);
		nivel.setHorizontalAlignment(SwingConstants.CENTER);
		nivel.setForeground(Color.LIGHT_GRAY);
		nivel.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelPuntuacion.add(nivel);
		
		nivelImagen = new JLabel("1");
		nivelImagen.setMinimumSize(new Dimension(65, 14));
		nivelImagen.setPreferredSize(new Dimension(200, 14));
		nivelImagen.setMaximumSize(new Dimension(445, 44));
		nivelImagen.setHorizontalTextPosition(SwingConstants.CENTER);
		nivelImagen.setHorizontalAlignment(SwingConstants.CENTER);
		nivelImagen.setForeground(Color.LIGHT_GRAY);
		nivelImagen.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelPuntuacion.add(nivelImagen);
		
		JLabel puntuacion = new JLabel("  Puntuacion  ");
		puntuacion.setPreferredSize(new Dimension(200, 14));
		puntuacion.setMaximumSize(new Dimension(445, 44));
		puntuacion.setHorizontalTextPosition(SwingConstants.CENTER);
		puntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		puntuacion.setForeground(Color.LIGHT_GRAY);
		puntuacion.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelPuntuacion.add(puntuacion);
		
		puntos = new JLabel("0");
		puntos.setPreferredSize(new Dimension(200, 14));
		puntos.setMinimumSize(new Dimension(65, 14));
		puntos.setMaximumSize(new Dimension(445, 44));
		puntos.setHorizontalTextPosition(SwingConstants.CENTER);
		puntos.setHorizontalAlignment(SwingConstants.CENTER);
		puntos.setForeground(Color.LIGHT_GRAY);
		puntos.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelPuntuacion.add(puntos);
	}
	
}
