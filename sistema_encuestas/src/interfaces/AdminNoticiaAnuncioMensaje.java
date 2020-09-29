package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AdminNoticiaAnuncioMensaje extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminNoticiaAnuncioMensaje frame = new AdminNoticiaAnuncioMensaje();
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
	public AdminNoticiaAnuncioMensaje() {
		setTitle("Sistema de Encuestas - Noticia/Anuncio/Mensaje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Noticias/Anuncios/Mensajes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 35);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrNoticiaanunciomensaje = new JTextArea();
		txtrNoticiaanunciomensaje.setText("Noticia/Anuncio/Mensaje");
		txtrNoticiaanunciomensaje.setBounds(186, 70, 207, 150);
		contentPane.add(txtrNoticiaanunciomensaje);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Noticia");
		rdbtnNewRadioButton.setBounds(21, 71, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAnuncio = new JRadioButton("Anuncio");
		rdbtnAnuncio.setBounds(21, 111, 109, 23);
		contentPane.add(rdbtnAnuncio);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Mensaje");
		rdbtnNewRadioButton_1_1.setBounds(21, 150, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JButton btnNewButton = new JButton("Generar");
		btnNewButton.setBounds(87, 198, 89, 23);
		contentPane.add(btnNewButton);
	}
}
