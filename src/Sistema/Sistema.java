package Sistema;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import Deposito.Controller;

public class Sistema extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Color panelColor;

	public Sistema() {
		this.setSize(600, 400);
		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				close();
			}
		});
	}
	
	private void close() {
		this.dispose();
	}
	
	public Color getColor() {
		return panelColor;
	}

	public void setColor(Color color) {
		this.panelColor = color;
	}
	
	public static void main(String[] args) {
		Sistema ventana = new Sistema();
		Controller pan1 = new Controller("Rojo", "Azul", "Verde");
		pan1.setAlignmentY(100);
		ventana.add(pan1);
		ventana.setVisible(true);
	}
}
