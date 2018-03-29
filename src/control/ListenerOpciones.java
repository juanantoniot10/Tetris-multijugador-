package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListenerOpciones implements ActionListener{

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botonPulsado = ((JButton)e.getSource());
	}
	
}
