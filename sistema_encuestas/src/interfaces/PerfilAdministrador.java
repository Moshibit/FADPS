package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class PerfilAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilAdministrador frame = new PerfilAdministrador();
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
	public PerfilAdministrador() {
		setTitle("Sistema de Encuestas - Perfil del Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido Administrador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(83, 11, 270, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ver Encuestados");
		btnNewButton.setBounds(156, 70, 113, 34);
		contentPane.add(btnNewButton);
		
		JButton btnVerEncuestas = new JButton("Ver Encuestas");
		btnVerEncuestas.setBounds(156, 129, 113, 34);
		contentPane.add(btnVerEncuestas);
		
		JButton btnNoticiasmensajes_1_1 = new JButton("Noticias/Anuncios/Mensajes");
		btnNoticiasmensajes_1_1.setBounds(116, 186, 197, 34);
		contentPane.add(btnNoticiasmensajes_1_1);
	}

}
