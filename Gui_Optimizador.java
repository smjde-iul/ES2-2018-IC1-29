import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gui_Optimizador {


	JFrame frame = new JFrame();
	JButton botaoIniciaOptimizacao = new JButton();
	JPanel painelBotoes = new JPanel();
	JPanel painelNomeProblema = new JPanel();
	JPanel painelDescricaoProblema = new JPanel();
	JTextField nomeProblema = new JTextField(40);
	JTextArea descricaoProblema = new JTextArea(20,20);


	//Definir a interface Gráfica com o utilizador
	public Gui_Optimizador() {

		frame.setName("Optimizer");

		addContent();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(50, 50);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(600, 400));
		frame.pack();

	}


	public void open() {
		frame.setVisible(true);
	}

	public void addContent() {
		nomeProblema.setText("Introduza o nome do problema.");
		botaoIniciaOptimizacao.setText("Start!");
		painelNomeProblema.add(nomeProblema);
		descricaoProblema.setText("Introduza a descrição do problema.");
		painelDescricaoProblema.add(descricaoProblema);
		painelBotoes.add(botaoIniciaOptimizacao);
		frame.add(painelNomeProblema, BorderLayout.NORTH);
		frame.add(painelBotoes, BorderLayout.SOUTH);
		frame.add(painelDescricaoProblema, BorderLayout.WEST);



		botaoIniciaOptimizacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Touched!");
				System.exit(0);
				
			}
		});

	}



}
