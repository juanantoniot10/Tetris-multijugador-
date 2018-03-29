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
	private JPanel panelPrincipal;
	private JPanel panelPuntuacion;
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
		panelPrincipal.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panelPuntuacion = new JPanel();
		panelPuntuacion.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GREEN, new Color(50, 205, 50), new Color(124, 252, 0), new Color(154, 205, 50)));
		panelPuntuacion.setBackground(Color.BLACK);
		getContentPane().add(panelPuntuacion, BorderLayout.EAST);
		panelPuntuacion.setLayout(new BoxLayout(panelPuntuacion, BoxLayout.X_AXIS));
	}
	
}
