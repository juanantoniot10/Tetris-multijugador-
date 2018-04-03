package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Color;

public class PanelElegirNivel extends JPanel{
	private JButton nivel1;
	private JButton nivel2;
	private JButton nivel3;
	private JButton nivel4;
	private JButton nivel5;
	private JButton nivel6;
	private JButton nivel7;
	private JButton nivel8;
	private JButton nivel9;
	
	public PanelElegirNivel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		nivel1 = new JButton("nivel 1");
		nivel1.setBackground(Color.GREEN);
		nivel1.setName("1");
		nivel1.setMinimumSize(new Dimension(43, 23));
		nivel1.setMaximumSize(new Dimension(2220, 400));
		nivel1.setMargin(new Insets(20, 20, 20, 20));
		nivel1.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel1.setFont(new Font("Pristina", Font.BOLD, 25));
		add(nivel1);
		
		nivel2 = new JButton("nivel 2");
		nivel2.setBackground(new Color(144, 238, 144));
		nivel2.setName("2");
		nivel2.setMinimumSize(new Dimension(43, 23));
		nivel2.setMaximumSize(new Dimension(2220, 400));
		nivel2.setMargin(new Insets(20, 20, 20, 20));
		nivel2.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel2.setFont(new Font("Pristina", Font.BOLD, 25));
		add(nivel2);
		
		nivel3 = new JButton("nivel 3");
		nivel3.setBackground(new Color(152, 251, 152));
		nivel3.setName("3");
		nivel3.setMinimumSize(new Dimension(43, 23));
		nivel3.setMaximumSize(new Dimension(2220, 400));
		nivel3.setMargin(new Insets(20, 20, 20, 20));
		nivel3.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel3.setFont(new Font("Pristina", Font.BOLD, 25));
		add(nivel3);
		
		nivel4 = new JButton("nivel 4");
		nivel4.setBackground(new Color(240, 230, 140));
		nivel4.setName("4");
		nivel4.setMinimumSize(new Dimension(43, 23));
		nivel4.setMaximumSize(new Dimension(2220, 400));
		nivel4.setMargin(new Insets(20, 20, 20, 20));
		nivel4.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel4.setFont(new Font("Pristina", Font.BOLD, 25));
		add(nivel4);
		
		nivel5 = new JButton("nivel 5");
		nivel5.setBackground(new Color(255, 165, 0));
		nivel5.setName("5");
		nivel5.setMinimumSize(new Dimension(43, 23));
		nivel5.setMaximumSize(new Dimension(2220, 400));
		nivel5.setMargin(new Insets(20, 20, 20, 20));
		nivel5.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel5.setFont(new Font("Pristina", Font.BOLD, 25));
		add(nivel5);
		
		nivel6 = new JButton("nivel 6");
		nivel6.setBackground(new Color(233, 150, 122));
		nivel6.setName("6");
		nivel6.setMinimumSize(new Dimension(43, 23));
		nivel6.setMaximumSize(new Dimension(2220, 400));
		nivel6.setMargin(new Insets(20, 20, 20, 20));
		nivel6.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel6.setFont(new Font("Pristina", Font.BOLD, 24));
		add(nivel6);
		
		nivel7 = new JButton("nivel 7");
		nivel7.setBackground(new Color(255, 127, 80));
		nivel7.setName("7");
		nivel7.setMinimumSize(new Dimension(43, 23));
		nivel7.setMaximumSize(new Dimension(2220, 400));
		nivel7.setMargin(new Insets(20, 20, 20, 20));
		nivel7.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel7.setFont(new Font("Pristina", Font.BOLD, 25));
		add(nivel7);
		
		nivel8 = new JButton("nivel 8");
		nivel8.setBackground(new Color(255, 99, 71));
		nivel8.setName("8");
		nivel8.setMinimumSize(new Dimension(43, 23));
		nivel8.setMaximumSize(new Dimension(2220, 400));
		nivel8.setMargin(new Insets(20, 20, 20, 20));
		nivel8.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel8.setFont(new Font("Pristina", Font.BOLD, 25));
		add(nivel8);
		
		nivel9 = new JButton("nivel 9");
		nivel9.setBackground(Color.RED);
		nivel9.setName("9");
		nivel9.setMinimumSize(new Dimension(43, 23));
		nivel9.setMaximumSize(new Dimension(2220, 400));
		nivel9.setMargin(new Insets(20, 20, 20, 20));
		nivel9.setHorizontalTextPosition(SwingConstants.LEADING);
		nivel9.setFont(new Font("Pristina", Font.BOLD, 24));
		add(nivel9);
	}
	
}
