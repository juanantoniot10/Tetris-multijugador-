package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class panelColorFiguras extends JPanel{

	public panelColorFiguras() {
		setBackground(new Color(255, 218, 185));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel lblAlgunDiaSi = new JLabel("ALGUN DIA SI TENGO TIEMPO");
		lblAlgunDiaSi.setFont(new Font("Pristina", Font.BOLD, 25));
		add(lblAlgunDiaSi);
		
	}
	
}
