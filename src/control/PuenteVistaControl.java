package control;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import vista.PanelOpciones;
import vista.VistaPrincipal;

public class PuenteVistaControl extends VistaPrincipal{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ListenerOpciones listenerOpciones;
	private PanelOpciones panelOpciones= new PanelOpciones();
	
	public PuenteVistaControl() {
		super();
		this.listenerOpciones = new ListenerOpciones(this.panelPrincipal,this.panelPuntuacion,this.panelOpciones,this.nivelImagen,this.puntos,this.tamanioTablero);
		this.panelPrincipal.add(panelOpciones);
		for (int i = 0; i < ((JPanel)panelOpciones.getComponent(0)).getComponentCount(); i++) {
			((JButton)((JPanel)panelOpciones.getComponent(0)).getComponent(i)).addActionListener(listenerOpciones);
		}
		SwingUtilities.updateComponentTreeUI(panelPrincipal);
	}

}
