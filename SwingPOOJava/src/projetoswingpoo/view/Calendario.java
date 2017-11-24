package projetoswingpoo.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXDatePicker;

public class Calendario extends JFrame {
	private JLabel label;

	public Calendario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calendario");
		setSize(360, 678);
		setResizable(false);
		setup();
	}

	private void setup() {
		JPanel painel = new JPanel();
		painel.setSize(360, 678);
		painel.setLayout(null);

		JXDatePicker datepicker = new JXDatePicker();
		datepicker.setBounds(25, 90, 300, 80);
		datepicker.setVisible(true);
		painel.add(datepicker);
		
		JButton butao = new JButton("Ajuda!");
		butao.setBounds(130, 400, 80, 40);
		painel.add(butao);

		add(painel);
		
	}
}
