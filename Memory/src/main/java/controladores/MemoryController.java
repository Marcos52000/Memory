package controladores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import vistas.Memory;

public class MemoryController extends JFrame {
	public static ArrayList<JButton> comprobar = new ArrayList<JButton>();

	int cont = 0;
	static int cont2 = 0, intentos = 0, parejas = 8;
	private static JButton btnTemp;

	public MemoryController() {
		crea_colores();
	}

	// funcion para mezclar los colo
	public static void crea_colores() {
		llenarLista();
		Collections.shuffle(Memory.colores);
		Memory.btn1.addActionListener(voltear);
		Memory.btn2.addActionListener(voltear);
		Memory.btn3.addActionListener(voltear);
		Memory.btn4.addActionListener(voltear);
		Memory.btn5.addActionListener(voltear);
		Memory.btn6.addActionListener(voltear);
		Memory.btn7.addActionListener(voltear);
		Memory.btn8.addActionListener(voltear);
		Memory.btn9.addActionListener(voltear);
		Memory.btn10.addActionListener(voltear);
		Memory.btn11.addActionListener(voltear);
		Memory.btn12.addActionListener(voltear);
		Memory.btn13.addActionListener(voltear);
		Memory.btn14.addActionListener(voltear);
		Memory.btn15.addActionListener(voltear);
		Memory.btn16.addActionListener(voltear);

	}

	public static void darVuelta(JButton boton) {
		
		int id = Integer.parseInt(boton.getName());
		boton.setBackground(Memory.colores.get(id));
		
	}

	public static void llenarLista() {

		Memory.colores.add(Color.yellow);
		Memory.colores.add(Color.blue);
		Memory.colores.add(Color.cyan);
		Memory.colores.add(Color.darkGray);
		Memory.colores.add(Color.gray);
		Memory.colores.add(Color.green);
		Memory.colores.add(Color.lightGray);
		Memory.colores.add(Color.magenta);
		Memory.colores.add(Color.yellow);
		Memory.colores.add(Color.blue);
		Memory.colores.add(Color.cyan);
		Memory.colores.add(Color.darkGray);
		Memory.colores.add(Color.gray);
		Memory.colores.add(Color.green);
		Memory.colores.add(Color.lightGray);
		Memory.colores.add(Color.magenta);

	}

	public static ActionListener voltear = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e);
			JButton button = (JButton) e.getSource();
			darVuelta(button);
			
			comprobar(e);
		}
	};

	public static void comprobar(ActionEvent e) {
		System.out.println("Hola");
		JButton btn = (JButton) e.getSource();

		if (cont2 == 0) {
			btnTemp = btn;
			cont2++;
		} else {
			
			if (btnTemp.getBackground().equals(btn.getBackground()) && btnTemp != btn) {
				System.out.println("son iguales");
				btnTemp.setEnabled(false);
				btn.setEnabled(false);
				parejas--;
				cont2=0;
			} else if (btnTemp != btn) {
				System.out.println("No son iguales");
				
				btnTemp.setEnabled(true);
				btn.setBackground(btn.getBackground());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btnTemp.setBackground(Color.WHITE);
				btn.setEnabled(true);
				btn.setBackground(Color.WHITE);
				cont2 = 0;
				intentos++;
				
			} else {
				JOptionPane.showMessageDialog(null, "Seleccione otra casilla.");
			}
		}

		if (parejas == 0) {
			JOptionPane.showMessageDialog(null, "Enhorabuena has finalizado con " + intentos + " intentos.");
		}

	};
}
