import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui_Optimizador {

	JFrame frame = new JFrame();
	JButton botaoInicia = new JButton();
	JPanel painelBotoes = new JPanel();
	JTextField texto = new JTextField();




	//Definir a interface Gráfica com o utilizador
	public Gui_Optimizador() {
		
		frame.setName("Optimizador");
		frame.add(painelBotoes, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(50, 50);
		frame.setSize(500, 500);


	}
	
	
	public void open() {
		frame.setVisible(true);
	}



}
