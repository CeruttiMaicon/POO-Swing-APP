
package projetoswingpoo.view;


import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class CadastroPronto extends JFrame {
	
	private JButton botaoproximopronto;


	
	

	private int min = 0, max = 2, ini = 2;

	public CadastroPronto() {


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Exibe janela
		setVisible(true);

		// nome janela
		setTitle("Cadastro Pronto");

		// tamanho janela
		setSize(360, 678);

		// trava o tamanho da jenela
		setResizable(true);

		setup();
	}

	private void setup() {
		JPanel painel = new JPanel();
		painel.setLayout(null);
		painel.setSize(300, 470);

		////////////////////////////////////////////

		// Bot�o

		botaoproximopronto = new JButton("Pr�ximo");
		botaoproximopronto.setBounds(40, 555, 265, 30); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)

		painel.add(botaoproximopronto);
		add(painel);

		/////////////////////////////////////////////

		/////////////////////////////////////////////

		// JSlider - para mostrar o progresso

		JSlider slider = new JSlider(JSlider.HORIZONTAL, min, max, ini);

		slider.setBounds(30, 578, 280, 40);

		painel.add(slider);

		////////////////////////////////////////////////

	}

}
