package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Window.Type;

public class AdvertenciaEncuestaIncompleta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertenciaEncuestaIncompleta frame = new AdvertenciaEncuestaIncompleta();
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
	public AdvertenciaEncuestaIncompleta() {
		setTitle("Sistemas de Encuestas - Encuesta incompleta");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADVERTENCIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(131, 11, 165, 38);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnCompleteLaEncuesta = new JTextPane();
		txtpnCompleteLaEncuesta.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnCompleteLaEncuesta.setText("Complete la encuesta o si lo desea guarde para posteriormente continuar contestando");
		txtpnCompleteLaEncuesta.setBounds(49, 60, 338, 50);
		contentPane.add(txtpnCompleteLaEncuesta);
	}
}
