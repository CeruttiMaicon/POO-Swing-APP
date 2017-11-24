package projetoswingpoo.view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import projetoswingpoo.controller.Navegador;

public class TelaContinueAoCadastro extends JFrame {
	
	private JButton botaoretorno;
	private JButton botaocontinuar;
	
	
private JLabel label;
	
	public TelaContinueAoCadastro() {

		// comando necessario para fechar o processo da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Exibe janela
		setVisible(true);

		// nome janela
		setTitle("Tela Continue ao Cadastro");

		// tamanho janela
		setSize(360, 678);

		// trava o tamanho da jenela
		setResizable(true);

		setup();
		
		
		

	}
	
	private void setup() {
		JPanel painel = new JPanel();
		painel.setLayout(null);
		painel.setSize(360, 378);
		
		
		
		//////////////////////////////////////////////////
		
		// Letras Palavra 'Selecione a'
		JLabel label2 = new JLabel("Deseja registrar", JLabel.CENTER);

		// ajustando transparencia da janela
		label2.setOpaque(true);

		label2.setFont(new Font("", Font.BOLD, 25));

		// Coordenadas para o Label
		label2.setBounds(35, 269, 280, 40);
		painel.add(label2);
		
		///////////////////////////////////////////////////
		
		// Letras Palavra 'opção desejada'
		JLabel label3 = new JLabel("uma nova conta?", JLabel.CENTER);

		// ajustando transparencia da janela
		label3.setOpaque(true);

		label3.setFont(new Font("", Font.BOLD, 25));

		// Coordenadas para o Label
		label3.setBounds(35, 299, 280, 40);
		painel.add(label3);
		
		
		////////////////////////////////////////////////////
		
		//Botão Login
		botaocontinuar = new JButton("Continuar");
		botaocontinuar.setBounds(35, 400, 280, 40);
		botaocontinuar.setFont(new Font("", Font.BOLD, 15));
		botaocontinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Navegador.toCadastro();
			}
		});
		
		painel.add(botaocontinuar);
		
		//////////////////////////////////////////////////////
		
		//Botão Registro
		botaoretorno = new JButton("Retornar");
		botaoretorno.setBounds(35, 450, 280, 40);
		botaoretorno.setFont(new Font("", Font.BOLD, 15));
		botaoretorno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Navegador.toTelaInicio();
			}
		});

		
		painel.add(botaoretorno);
		
		
		add(painel);
	}

}
