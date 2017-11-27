
package projetoswingpoo.view;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import projetoswingpoo.controller.Navegador;

public class CadastroPronto extends JFrame {
	
	private JButton botaoproximo;

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

		////////////////////////////////////////////////

		// Texto Superior

		JLabel label1 = new JLabel("Parabéns! Você acabou de");
		JLabel label2 = new JLabel("criar sua conta no App!");
		JLabel label3 = new JLabel("esperamos que você tenha");
		JLabel label4 = new JLabel("muitas oportunidades!");

		// ajustando transparencia da janela
		label1.setOpaque(true);
		label2.setOpaque(true);
		label3.setOpaque(true);
		label4.setOpaque(true);

		// Fonte, cor e tamanho
		label1.setFont(new Font("", Font.BOLD, 23));
		label2.setFont(new Font("", Font.BOLD, 23));
		label3.setFont(new Font("", Font.BOLD, 23));
		label4.setFont(new Font("", Font.BOLD, 23));

		// Coordenadas para o Label
		label1.setBounds(24, 6, 400, 40);
		label2.setBounds(41, 37, 400, 40);
		label3.setBounds(23, 68, 400, 40);// (Lado esquerdo, Cima para baixo,
		label4.setBounds(46, 99, 400, 40);// Tamanho largura, Tamanho altura)

		// Adicionando na tela
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);
		painel.add(label4);

		////////////////////////////////////////////

		////////////////////////////////////////////////

		// Texto Medio

		JLabel label5 = new JLabel("Você deseja fazer o");
		JLabel label6 = new JLabel("tutorial de todo o app");
		JLabel label7 = new JLabel("para entender como");
		JLabel label8 = new JLabel("ele funciona?", JLabel.CENTER);

		// ajustando transparencia da janela
		label5.setOpaque(true);
		label6.setOpaque(true);
		label7.setOpaque(true);
		label8.setOpaque(true);

		// Fonte, cor e tamanho
		label5.setFont(new Font("", Font.BOLD, 20));
		label6.setFont(new Font("", Font.BOLD, 20));
		label7.setFont(new Font("", Font.BOLD, 20));
		label8.setFont(new Font("", Font.BOLD, 20));

		// Coordenadas para o Label
		label5.setBounds(75, 205, 200, 40);
		label6.setBounds(67, 235, 210, 40);
		label7.setBounds(73, 265, 210, 40);// (Lado esquerdo, Cima para baixo,
		label8.setBounds(105, 295, 128, 40); // Tamanho largura, Tamanho altura)

		// Adicionando na tela
		painel.add(label5);
		painel.add(label6);
		painel.add(label7);
		painel.add(label8);

		////////////////////////////////////////////

		////////////////////////////////////////////

		// Botão "Sim, Fazer Tutorial!"

		JButton butao1 = new JButton("Sim, Fazer Tutorial!");
		butao1.setBounds(56, 367, 230, 75); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)

		painel.add(butao1);

		/////////////////////////////////////////////

		////////////////////////////////////////////

		// Botão "Ir para Página inicial"

		botaoproximo = new JButton("Ir para página inicial");
		botaoproximo.setBounds(40, 490, 265, 30); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		
		botaoproximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Navegador.toTelaPerfil();
			}
		});

		painel.add(botaoproximo);

		/////////////////////////////////////////////

		/////////////////////////////////////////////

		// JSlider - para mostrar o progresso

		JSlider slider = new JSlider(JSlider.HORIZONTAL, min, max, ini);
		
		slider.setOpaque(false);

		slider.setBounds(30, 550, 280, 40);

		painel.add(slider);

		////////////////////////////////////////////////

		// Texto inferior (Complemento do "mostrar o progresso")

		JLabel label9 = new JLabel("informações");
		JLabel label10 = new JLabel("Foto");
		JLabel label11 = new JLabel("Pronto!");

		// ajustando transparencia da janela
		label9.setOpaque(true);
		label10.setOpaque(true);
		label11.setOpaque(true);

		// Fonte, cor e tamanho
		label9.setFont(new Font("", Font.BOLD, 10));
		label10.setFont(new Font("", Font.BOLD, 10));
		label11.setFont(new Font("", Font.BOLD, 10));

		// Coordenadas para o Label
		label9.setBounds(20, 570, 70, 40);
		label10.setBounds(160, 570, 50, 40);
		label11.setBounds(283, 570, 50, 40);// (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)

		// Adicionando na tela
		painel.add(label9);
		painel.add(label10);
		painel.add(label11);

		add(painel);

	}

}