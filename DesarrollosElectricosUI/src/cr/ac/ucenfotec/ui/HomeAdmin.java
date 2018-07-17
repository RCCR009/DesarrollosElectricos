package cr.ac.ucenfotec.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class HomeAdmin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAdmin window = new HomeAdmin();
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
	public HomeAdmin() {
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
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblMenu.setBounds(149, 20, 151, 16);
		frame.getContentPane().add(lblMenu);
		
		JButton btnNuevoTramite = new JButton("NUEVO TRAMITE");
		btnNuevoTramite.setBounds(154, 76, 140, 29);
		frame.getContentPane().add(btnNuevoTramite);
		
		JButton btnListarTramites = new JButton("LISTAR TRAMITES");
		btnListarTramites.setBounds(154, 117, 140, 29);
		frame.getContentPane().add(btnListarTramites);
		
		JButton btnNuevoUsusario = new JButton("NUEVO USUARIO");
		btnNuevoUsusario.setBounds(154, 158, 140, 29);
		frame.getContentPane().add(btnNuevoUsusario);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(154, 230, 140, 29);
		frame.getContentPane().add(btnSalir);
	}

}
