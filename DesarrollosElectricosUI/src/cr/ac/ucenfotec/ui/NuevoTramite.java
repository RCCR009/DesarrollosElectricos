package cr.ac.ucenfotec.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NuevoTramite {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnSiguiente;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevoTramite window = new NuevoTramite();
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
	public NuevoTramite() {
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
		
		JLabel lblNuevoTramite = new JLabel("NUEVO TRAMITE");
		lblNuevoTramite.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevoTramite.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNuevoTramite.setBounds(149, 28, 151, 16);
		frame.getContentPane().add(lblNuevoTramite);
		
		textField = new JTextField();
		textField.setBounds(208, 74, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(135, 79, 61, 16);
		frame.getContentPane().add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(208, 107, 130, 78);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDetalle = new JLabel("DETALLE");
		lblDetalle.setHorizontalAlignment(SwingConstants.CENTER);
		lblDetalle.setBounds(135, 112, 61, 16);
		frame.getContentPane().add(lblDetalle);
		
		btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setBounds(314, 230, 117, 29);
		frame.getContentPane().add(btnSiguiente);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(18, 230, 117, 29);
		frame.getContentPane().add(btnCancelar);
	}

}
