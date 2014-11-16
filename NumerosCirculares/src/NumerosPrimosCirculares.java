import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;


public class NumerosPrimosCirculares {

	private JFrame frame;
	private TextArea Panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumerosPrimosCirculares window = new NumerosPrimosCirculares();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumerosPrimosCirculares() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel = new TextArea();
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 NumerosPrimosThread hiloNumerosPrimos= new NumerosPrimosThread();
			     NumerosCircularesThread hiloNumerosCirculares = new NumerosCircularesThread(Panel);
				 hiloNumerosPrimos.start();
				 hiloNumerosCirculares.start();
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		
		frame.getContentPane().add(Panel, BorderLayout.CENTER);
	}

}
