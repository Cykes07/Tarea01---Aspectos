package Deposito;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Interfaces.PObserve;
import Interfaces.PObserver;
import Sistema.Sistema;

public class Controller extends JPanel implements PObserve{
	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3;	
	private PObserver observador;
	
	public Controller(String name1, String name2, String name3) {

		this.btn1 = new JButton(name1);
		this.btn2 = new JButton(name2);
		this.btn3 = new JButton(name3);	
		
		btn1.addActionListener(new ColorSwitch());
		btn2.addActionListener(new ColorSwitch());
		btn3.addActionListener(new ColorSwitch());
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
	}
	
	public void notificar() {
		Sistema obs = (Sistema) this.observador;
		obs.update(this.getBackground());
	}
	
	public void enlazarObserver(PObserver observador) {
		this.observador = observador;		
	}
	
	
	private final class ColorSwitch implements ActionListener{

		public void actionPerformed(ActionEvent e) {
					
			JButton boton = (JButton) e.getSource();
			Controller contenedor = (Controller) boton.getParent();
			String nombre = boton.getText();

			if(nombre.equals("Rojo")) {
				contenedor.setBackground(Color.RED);
				
			}
			else if(nombre.equals("Azul")) {
				contenedor.setBackground(Color.BLUE);
				
			}
			else if(nombre.equals("Verde")) {
				contenedor.setBackground(Color.GREEN);
				
			}
			contenedor.notificar();
		}		
	}




}

