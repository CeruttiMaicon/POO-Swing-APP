package projetoswingpoo.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import projetoswingpoo.controller.Navegador;

	public class TelaPerfil extends JFrame {
		
		private JButton botaotutorial;
		private JButton botaoajuda;
		private JButton botaooportunidade;
		private JButton botaochat;
		private JButton botaoeditar;
		private JButton botaohistorico;
		private JButton botaoagenda;
		private JButton botaolocais;
		

		public TelaPerfil() {

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// Exibe janela
			setVisible(true);

			// nome janela
			setTitle("Tela de Perfil");

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
			/*JLabel label = new JLabel(obterImagem("usuario-imagem.png"));
			label.setSize(100,400);*/

		
		/*private ImageIcon obterImagem(String path) {
				ImageIcon icon= null;
				try {
						BufferedImage img = ImageIO.read(new File(path));
						icon = new ImageIcon(img);
				}catch(Exception e) {
						e.printStackTrace();
				}
				return icon; */
		
		
		
		/////////////////////////////////////////
		
		// Primeiro texto Superior

		botaotutorial = new JButton("Fazer tutorial por todo o aplicativo");
		
		botaotutorial.setFont(new Font("", Font.BOLD, 9));

		// Coordenadas para o Label
		botaotutorial.setBounds(10, 23, 200, 44); 

		// Adicionando na tela
		painel.add(botaotutorial);
		

		////////////////////////////////////////////////

		////////////////////////////////////////////

		// Botão "Ajuda!"

		botaoajuda = new JButton("Ajuda");

		botaoajuda.setBounds(215, 23, 111, 44); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		painel.add(botaoajuda);

		/////////////////////////////////////////////
		
		/////////////////////////////////////////////
		
		// "Nome sobrenome"

		JLabel label1 = new JLabel("Nome Sobrenome");

		label1.setFont(new Font("", Font.BOLD, 16));

		label1.setBounds(105, 220, 220, 44); // (Lado esquerdo, Cima para baixo,
												// Tamanho largura, Tamanho altura)
		painel.add(label1);
		
		/////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Oportunidades"

		botaooportunidade = new JButton("Oportunidades");
		
		botaooportunidade.setFont(new Font("", Font.BOLD, 22));

		// Coordenadas para o Label
		botaooportunidade.setBounds(35, 270, 275, 44); 

		// Adicionando na tela
		painel.add(botaooportunidade);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Chat"

		botaochat = new JButton("CHAT");

		botaochat.setFont(new Font("", Font.BOLD, 19));

		botaochat.setBounds(230, 340, 90, 115); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		painel.add(botaochat);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Editar Perfil"

		botaoeditar = new JButton("Editar Perfil");

		botaoeditar.setFont(new Font("", Font.BOLD, 10));

		botaoeditar.setBounds(25, 340, 92, 55); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		painel.add(botaoeditar);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Histórico"

		botaohistorico = new JButton("Histórico");

		botaohistorico.setFont(new Font("", Font.BOLD, 13));

		botaohistorico.setBounds(123, 340, 92, 55); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		painel.add(botaohistorico);

		////////////////////////////////////////////////

		////////////////////////////////////////////////

		// Botão "Agenda"

		botaoagenda = new JButton("Agenda");

		botaoagenda.setFont(new Font("", Font.BOLD, 13));

		botaoagenda.setBounds(25, 400, 92, 55); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		
		botaoagenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Navegador.toTelaCalendario();
			}
		});
		
		
		painel.add(botaoagenda);

		////////////////////////////////////////////////
		
		////////////////////////////////////////////////
		
		// Botão "Locais"
		
		botaolocais = new JButton("Locais");
		
		botaolocais.setFont(new Font("", Font.BOLD, 13));
		
		botaolocais.setBounds(123, 400, 92, 55); // (Lado esquerdo, Cima para baixo,
		// Tamanho largura, Tamanho altura)
		
		botaolocais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Navegador.toTelaLocais();
			}
		});
		
		painel.add(botaolocais);
		
		////////////////////////////////////////////////
		
		////////////////////////////////////////////////
			
		// Botão "Mudar para o modo contratante"
		
		JButton butao8 = new JButton("Mudar para o modo contratante");
		
		butao8.setFont(new Font("", Font.BOLD, 13));
		
		butao8.setBounds(35, 550, 275, 44); // (Lado esquerdo, Cima para baixo,
											// Tamanho largura, Tamanho altura)
		painel.add(butao8);
		
		////////////////////////////////////////////////

			add(painel);
		}
	}

}
