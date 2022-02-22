package vistas;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Memory extends JFrame{
	public static ArrayList<Color> colores = new ArrayList<Color>();
	JFrame frame;
	JPanel botones;
	public static JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
	public static Container cp;
	
	public Memory() {
		
		frame = new JFrame();
		frame.setTitle("Memory");
		// Definimos el size de la ventana
		frame.setBounds(300, 300, 900, 500);
		// hacemos que la ventana sea visible
		frame.setVisible(true);
		// Operacion que cuando se cierre la ventana terminara la aplicacion
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Creamos el panel
		cp = frame.getContentPane();
		
		btn1 = new JButton();
		btn1.setBackground(Color.WHITE);
		btn1.setName("1");
		btn2 = new JButton();
		btn2.setBackground(Color.WHITE);
		btn2.setName("2");
		btn3 = new JButton();
		btn3.setBackground(Color.WHITE);
		btn3.setName("3");
		btn4 = new JButton();
		btn4.setBackground(Color.WHITE);
		btn4.setName("4");
		btn5 = new JButton();
		btn5.setBackground(Color.WHITE);
		btn5.setName("5");
		btn6 = new JButton();
		btn6.setBackground(Color.WHITE);
		btn6.setName("6");
		btn7 = new JButton();
		btn7.setBackground(Color.WHITE);
		btn7.setName("7");
		btn8 = new JButton();
		btn8.setBackground(Color.WHITE);
		btn8.setName("8");
		btn9 = new JButton();
		btn9.setBackground(Color.WHITE);
		btn9.setName("9");
		btn10 = new JButton();
		btn10.setBackground(Color.WHITE);
		btn10.setName("10");
		btn11 = new JButton();
		btn11.setBackground(Color.WHITE);
		btn11.setName("11");
		btn12 = new JButton();
		btn12.setBackground(Color.WHITE);
		btn12.setName("12");
		btn13 = new JButton();
		btn13.setBackground(Color.WHITE);
		btn13.setName("13");
		btn14 = new JButton();
		btn14.setBackground(Color.WHITE);
		btn14.setName("14");
		btn15 = new JButton();
		btn15.setBackground(Color.WHITE);
		btn15.setName("15");
		btn16 = new JButton();
		btn16.setBackground(Color.WHITE);
		btn16.setName("16");
		
		botones = new JPanel(new GridLayout(4,4));
		botones.add(btn1);
		botones.add(btn2);
		botones.add(btn3);
		botones.add(btn4);
		botones.add(btn5);
		botones.add(btn6);
		botones.add(btn7);
		botones.add(btn8);
		botones.add(btn9);
		botones.add(btn10);
		botones.add(btn11);
		botones.add(btn12);
		botones.add(btn13);
		botones.add(btn14);
		botones.add(btn15);
		botones.add(btn16);
		cp.add(botones);
		
	}

}
