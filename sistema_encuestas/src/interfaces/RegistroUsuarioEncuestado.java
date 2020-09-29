package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegistroUsuarioEncuestado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuarioEncuestado frame = new RegistroUsuarioEncuestado();
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
	public RegistroUsuarioEncuestado() {
		setTitle("Sistema de Encuestas - Registro de datos del encuestado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido, registre sus datos.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 603, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(20, 145, 191, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1.setBounds(20, 170, 191, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Estado Civil");
		lblNewLabel_1_1_1.setBounds(20, 193, 191, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nivel de escolaridad");
		lblNewLabel_1_1_1_1.setBounds(20, 278, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Ciudad");
		lblNewLabel_1_1_1_2.setBounds(20, 218, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Nacionalidad");
		lblNewLabel_1_1_1_3.setBounds(20, 246, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Ocupaci\u00F3n");
		lblNewLabel_1_1_1_4.setBounds(20, 308, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Ingresos");
		lblNewLabel_1_1_1_5.setBounds(20, 336, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_5_1 = new JLabel("Cuantas personas hay en su vivienda");
		lblNewLabel_1_1_1_5_1.setBounds(20, 361, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_5_1);
		
		textField = new JTextField();
		textField.setBounds(221, 358, 196, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton radioFemenino = new JRadioButton("Femenino");
		radioFemenino.setBounds(217, 166, 86, 23);
		contentPane.add(radioFemenino);
		
		JRadioButton radioMasculino = new JRadioButton("Masculino");
		radioMasculino.setBounds(305, 166, 86, 23);
		contentPane.add(radioMasculino);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Soltero(a)");
		rdbtnNewRadioButton_2.setBounds(217, 189, 86, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Casado(a)");
		rdbtnNewRadioButton_2_1.setBounds(305, 189, 86, 23);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton("Divorciado(a)");
		rdbtnNewRadioButton_2_2.setBounds(401, 189, 89, 23);
		contentPane.add(rdbtnNewRadioButton_2_2);
		
		JRadioButton rdbtnNewRadioButton_2_2_1 = new JRadioButton("Viudo(a)");
		rdbtnNewRadioButton_2_2_1.setBounds(512, 189, 65, 23);
		contentPane.add(rdbtnNewRadioButton_2_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(221, 215, 200, 20);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Primaria", "Secundaria", "Preparatoria", "Licenciatura", "Posgrado", "Maestria", "Doctorado", "Carrera Trunca", "Ninguna"}));
		comboBox.setBounds(221, 274, 196, 23);
		contentPane.add(comboBox);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(221, 305, 196, 20);
		contentPane.add(textField_4);
		
		JRadioButton rdbtnA = new JRadioButton("$100 a $1,000");
		rdbtnA.setBounds(217, 332, 98, 23);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnA_1 = new JRadioButton("$1,000 a $8,000");
		rdbtnA_1.setBounds(335, 332, 107, 23);
		contentPane.add(rdbtnA_1);
		
		JRadioButton rdbtnEnAdelante = new JRadioButton("$8,000 en adelante");
		rdbtnEnAdelante.setBounds(455, 332, 122, 23);
		contentPane.add(rdbtnEnAdelante);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(264, 404, 89, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		comboBox_1.setBounds(221, 141, 191, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Mexicana", "Estadounidense", "Espa\u00F1ola", "Alemana", "Japonesa", "Italiana", "Francesa", "Inglesa", "Canadiense", "Portuguesa"}));
		comboBox_2.setBounds(221, 242, 196, 23);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_1_1_1_5_1_1 = new JLabel("Correo");
		lblNewLabel_1_1_1_5_1_1.setBounds(20, 64, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_5_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 58, 196, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1_5_1_1_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1_1_1_5_1_1_1.setBounds(20, 95, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_5_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(221, 89, 196, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1_1_1_5_1_1_1_1 = new JLabel("Confirme contrase\u00F1a");
		lblNewLabel_1_1_1_5_1_1_1_1.setBounds(20, 120, 191, 14);
		contentPane.add(lblNewLabel_1_1_1_5_1_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(221, 114, 196, 20);
		contentPane.add(passwordField_1);
	}
}
