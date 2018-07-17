package cr.ac.ucenfotec.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NuevaTarea {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaTarea window = new NuevaTarea();
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
	public NuevaTarea() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNuevoTarea = new JLabel("NUEVA TAREA");
		lblNuevoTarea.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoTarea.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNuevoTarea.setBounds(149, 32, 151, 16);
		frame.getContentPane().add(lblNuevoTarea);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(192, 71, 130, 26);
		frame.getContentPane().add(textField);
		
		JLabel label = new JLabel("ID");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(119, 76, 61, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("DETALLE");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(119, 146, 61, 16);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(192, 141, 130, 78);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 109, 130, 26);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNumero = new JLabel("NUMERO");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setBounds(119, 114, 61, 16);
		frame.getContentPane().add(lblNumero);
		
		JButton button = new JButton("SIGUIENTE");
		button.setBounds(312, 231, 117, 29);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("CANCELAR");
		button_1.setBounds(16, 231, 117, 29);
		frame.getContentPane().add(button_1);
	}

}
