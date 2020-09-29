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

public class IdentificaAdminUsuarioEncustado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdentificaAdminUsuarioEncustado frame = new IdentificaAdminUsuarioEncustado();
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
	public IdentificaAdminUsuarioEncustado() {
		setTitle("Sistema de Encuestas - Identificaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identificate");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 11, 229, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Administador");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(109, 73, 107, 36);
		contentPane.add(btnNewButton);
		
		JButton btnEncuestado = new JButton("Encuestado");
		btnEncuestado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEncuestado.setBounds(109, 132, 107, 36);
		contentPane.add(btnEncuestado);
	}
}
