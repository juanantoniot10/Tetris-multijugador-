package control;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ListenerColorFondo implements ActionListener {

	private Container padrePrincipal;
	private Color color;
	
	
	public ListenerColorFondo(Container container) {
		super();
		this.padrePrincipal = container;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = ((JButton)e.getSource());
		this.color = boton.getBackground();
		for (int i = 0; i < padrePrincipal.getComponentCount(); i++) {
			((JPanel)padrePrincipal.getComponent(i)).setBackground(color);
		}
	}
	
}
