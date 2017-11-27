package projetoswingpoo.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class TelaLocais extends JFrame {

	public TelaLocais() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Exibe janela
		setVisible(true);

		// nome janela
		setTitle("Locais");

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
		
		///////////////////////////////////////////////
		
		// Primeiro texto Superior

		JLabel label1 = new JLabel("Locais");

		// ajustando transparencia da janela
		label1.setOpaque(false);

		// Fonte, cor e tamanho
		label1.setFont(new Font("", Font.BOLD, 33));

		// Coordenadas para o Label
		label1.setBounds(198, 16, 111, 44); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)

		// Adicionando na tela
		painel.add(label1);

		////////////////////////////////////////////////

		////////////////////////////////////////////

		// Botão "Ajuda!"

		JButton butao1 = new JButton("Ajuda!");

		butao1.setBounds(35, 20, 111, 40); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		painel.add(butao1);

		/////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Mudar foto de perfil"

		JButton butao2 = new JButton("Meu Endereço: Casa");

		butao2.setBounds(30, 110, 280, 44); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		painel.add(butao2);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Mudar Endereço"

		JButton butao3 = new JButton("Serviço 1: Nome Contatante\r\n" + 
				"Joinville - Bairro - Rua - Numero");

		butao3.setBounds(17, 195, 310, 55); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		butao3.setFont(new Font("", Font.BOLD, 9));
		painel.add(butao3);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Mudar Telefone"

		JButton butao4 = new JButton("Serviço 2: Nome Contatante\r\n" + 
				"Joinville - Bairro - Rua - Numero");

		butao4.setBounds(17, 280, 310, 55); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		butao4.setFont(new Font("", Font.BOLD, 9));
		painel.add(butao4);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Mudar Email"

		JButton butao5 = new JButton("Serviço 3: Nome Contatante\r\n" + 
				"Joinville - Bairro - Rua - Numero");

		butao5.setBounds(17, 365, 310, 55); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		
		butao5.setFont(new Font("", Font.BOLD, 9));
		painel.add(butao5);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Mudar Email"

		JButton butao6 = new JButton("Serviço 4: Nome Contatante\r\n" + 
				"Joinville - Bairro - Rua - Numero");

		butao6.setBounds(17, 450, 310, 55); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		
		butao6.setFont(new Font("", Font.BOLD, 9));
		painel.add(butao6);

		////////////////////////////////////////////////

		add(painel);

	}
}