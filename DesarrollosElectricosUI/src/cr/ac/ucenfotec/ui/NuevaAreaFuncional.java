package cr.ac.ucenfotec.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NuevaAreaFuncional {

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
					NuevaAreaFuncional window = new NuevaAreaFuncional();
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
	public NuevaAreaFuncional() {
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
		
		JLabel lblNuevaAreaFuncional = new JLabel("NUEVA AREA FUNCIONAL");
		lblNuevaAreaFuncional.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaAreaFuncional.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNuevaAreaFuncional.setBounds(115, 26, 220, 16);
		frame.getContentPane().add(lblNuevaAreaFuncional);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(188, 73, 130, 26);
		frame.getContentPane().add(textField);
		
		JLabel label = new JLabel("ID");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(115, 78, 61, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("NUMERO");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(115, 116, 61, 16);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(188, 111, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(188, 143, 130, 78);
		frame.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("DETALLE");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(115, 148, 61, 16);
		frame.getContentPane().add(label_2);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(20, 233, 117, 29);
		frame.getContentPane().add(btnSalir);
		
		JButton btnNuevoTramite = new JButton("NUEVO TRAMITE");
		btnNuevoTramite.setBounds(286, 233, 147, 29);
		frame.getContentPane().add(btnNuevoTramite);
	}

}
