package cr.ac.ucenfotec.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Home {

	private JFrame frame;
	private JTextField txtDesarrollosElectricos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
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
		
		txtDesarrollosElectricos = new JTextField();
		txtDesarrollosElectricos.setBounds(89, 6, 262, 26);
		txtDesarrollosElectricos.setHorizontalAlignment(SwingConstants.CENTER);
		txtDesarrollosElectricos.setText("Desarrollos Electricos");
		frame.getContentPane().add(txtDesarrollosElectricos);
		txtDesarrollosElectricos.setColumns(10);
		
		JButton btnAdministrativo = new JButton("Administrativo");
		btnAdministrativo.setBounds(154, 90, 117, 29);
		frame.getContentPane().add(btnAdministrativo);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.setBounds(154, 131, 117, 26);
		frame.getContentPane().add(btnIniciarSesion);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(154, 172, 117, 29);
		frame.getContentPane().add(btnSalir);
	}
}
