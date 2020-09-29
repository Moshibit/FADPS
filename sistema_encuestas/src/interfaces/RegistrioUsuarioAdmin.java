package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class RegistrioUsuarioAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField regCorreo;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrioUsuarioAdmin frame = new RegistrioUsuarioAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrioUsuarioAdmin() {
		setTitle("Sistema de Encuestas - Registro del Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		regCorreo = new JTextField();
		regCorreo.setText("ejemplo@.mail.com");
		regCorreo.setBounds(167, 113, 175, 20);
		contentPane.add(regCorreo);
		regCorreo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Correo:");
		lblNewLabel.setBounds(79, 119, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(79, 150, 78, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido, registrate con tu correo electronico");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 11, 394, 47);
		contentPane.add(lblNewLabel_1);
		
		JButton regEnviar = new JButton("Enviar");
		regEnviar.setBounds(167, 228, 89, 23);
		contentPane.add(regEnviar);
		
		JLabel lblNewLabel_2 = new JLabel("UserName:");
		lblNewLabel_2.setBounds(79, 87, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(167, 84, 175, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 147, 175, 20);
		contentPane.add(passwordField);
		
		JLabel lblContrasea_1 = new JLabel("Confirme contrase\u00F1a:");
		lblContrasea_1.setBounds(43, 187, 114, 14);
		contentPane.add(lblContrasea_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(167, 184, 175, 20);
		contentPane.add(passwordField_1);
	}
}
