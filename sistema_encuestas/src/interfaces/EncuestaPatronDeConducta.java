package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Scrollbar;

public class EncuestaPatronDeConducta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncuestaPatronDeConducta frame = new EncuestaPatronDeConducta();
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
	public EncuestaPatronDeConducta() {
		setTitle("Sistema de Encuesta - Patr\u00F3n de Conducta Uno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 981);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAContinuacinUstede = new JTextPane();
		txtpnAContinuacinUstede.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnAContinuacinUstede.setText("A continuaci\u00F3n ustede leer\u00E1 una serie de \u00EDtems que se refieren a caracter\u00EDsticas personales. Ustede debe responder a cada uno de ellos, seg\u00FAn sea su caso, bas\u00E1ndose en la escala de frecuencia que se presenta:\r\n\r\nS - Siempre      CS - Casi siempre        R - Regularmente      CN - Casi nunca      N - Nunca");
		txtpnAContinuacinUstede.setBounds(52, 55, 581, 92);
		contentPane.add(txtpnAContinuacinUstede);
		
		JLabel lblNewLabel = new JLabel("INSTRUCCIONES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(53, 36, 121, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patr\u00F3n de conducta uno");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(226, 11, 216, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1.- \u00BFEs usted una persona con grandes aspiraciones y esforzada?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(54, 153, 581, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("2.- \u00BFToma usted las cosas como vienen sin disgustarse mucho por ello?");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(52, 198, 581, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("3.- \u00BFLe interesa que otras gentes sepan que usted ha hecho bien un trabajo?");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(52, 242, 581, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("4.- \u00BFLe disgusta que los dem\u00E1s lo apuren?");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(52, 293, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("5.- \u00BFNecesita usted de constante reconocimiento para poder avanzar en el trabajo?");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(53, 338, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("6.- \u00BFPuede usted esperar tranquilo sin impacientarse?");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1.setBounds(53, 385, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("S");
		rdbtnNewRadioButton.setBounds(64, 170, 71, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("N");
		rdbtnN.setBounds(525, 170, 71, 23);
		contentPane.add(rdbtnN);
		
		JRadioButton rdbtnCs = new JRadioButton("CS");
		rdbtnCs.setBounds(183, 170, 71, 23);
		contentPane.add(rdbtnCs);
		
		JRadioButton rdbtnR = new JRadioButton("R");
		rdbtnR.setBounds(294, 170, 71, 23);
		contentPane.add(rdbtnR);
		
		JRadioButton rdbtnCn = new JRadioButton("CN");
		rdbtnCn.setBounds(404, 170, 71, 23);
		contentPane.add(rdbtnCn);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1.setBounds(62, 219, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnCs_1 = new JRadioButton("CS");
		rdbtnCs_1.setBounds(181, 219, 71, 23);
		contentPane.add(rdbtnCs_1);
		
		JRadioButton rdbtnR_1 = new JRadioButton("R");
		rdbtnR_1.setBounds(292, 219, 71, 23);
		contentPane.add(rdbtnR_1);
		
		JRadioButton rdbtnCn_1 = new JRadioButton("CN");
		rdbtnCn_1.setBounds(402, 219, 71, 23);
		contentPane.add(rdbtnCn_1);
		
		JRadioButton rdbtnN_1 = new JRadioButton("N");
		rdbtnN_1.setBounds(523, 219, 71, 23);
		contentPane.add(rdbtnN_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1.setBounds(62, 263, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnCs_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1.setBounds(181, 263, 71, 23);
		contentPane.add(rdbtnCs_1_1);
		
		JRadioButton rdbtnR_1_1 = new JRadioButton("R");
		rdbtnR_1_1.setBounds(292, 263, 71, 23);
		contentPane.add(rdbtnR_1_1);
		
		JRadioButton rdbtnCn_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1.setBounds(402, 263, 71, 23);
		contentPane.add(rdbtnCn_1_1);
		
		JRadioButton rdbtnN_1_1 = new JRadioButton("N");
		rdbtnN_1_1.setBounds(523, 263, 71, 23);
		contentPane.add(rdbtnN_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1.setBounds(64, 406, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1.setBounds(183, 406, 71, 23);
		contentPane.add(rdbtnCs_1_1_1);
		
		JRadioButton rdbtnR_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1.setBounds(294, 406, 71, 23);
		contentPane.add(rdbtnR_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1.setBounds(404, 406, 71, 23);
		contentPane.add(rdbtnCn_1_1_1);
		
		JRadioButton rdbtnN_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1.setBounds(525, 406, 71, 23);
		contentPane.add(rdbtnN_1_1_1);
		
		JRadioButton rdbtnR_1_1_2 = new JRadioButton("R");
		rdbtnR_1_1_2.setBounds(292, 314, 71, 23);
		contentPane.add(rdbtnR_1_1_2);
		
		JRadioButton rdbtnCs_1_1_2 = new JRadioButton("CS");
		rdbtnCs_1_1_2.setBounds(181, 314, 71, 23);
		contentPane.add(rdbtnCs_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_2.setBounds(62, 314, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_2);
		
		JRadioButton rdbtnN_1_1_2 = new JRadioButton("N");
		rdbtnN_1_1_2.setBounds(523, 314, 71, 23);
		contentPane.add(rdbtnN_1_1_2);
		
		JRadioButton rdbtnCn_1_1_2 = new JRadioButton("CN");
		rdbtnCn_1_1_2.setBounds(402, 314, 71, 23);
		contentPane.add(rdbtnCn_1_1_2);
		
		JRadioButton rdbtnR_1_1_2_1 = new JRadioButton("R");
		rdbtnR_1_1_2_1.setBounds(293, 359, 71, 23);
		contentPane.add(rdbtnR_1_1_2_1);
		
		JRadioButton rdbtnCs_1_1_2_1 = new JRadioButton("CS");
		rdbtnCs_1_1_2_1.setBounds(182, 359, 71, 23);
		contentPane.add(rdbtnCs_1_1_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_2_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_2_1.setBounds(63, 359, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_2_1);
		
		JRadioButton rdbtnN_1_1_2_1 = new JRadioButton("N");
		rdbtnN_1_1_2_1.setBounds(524, 359, 71, 23);
		contentPane.add(rdbtnN_1_1_2_1);
		
		JRadioButton rdbtnCn_1_1_2_1 = new JRadioButton("CN");
		rdbtnCn_1_1_2_1.setBounds(403, 359, 71, 23);
		contentPane.add(rdbtnCn_1_1_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("24/09/2020. 12:03");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(532, 11, 134, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(550, 848, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atr\u00E1s");
		btnNewButton_1.setBounds(10, 848, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Guardar Avances");
		btnNewButton_2.setBounds(278, 848, 134, 23);
		contentPane.add(btnNewButton_2);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(659, 0, 17, 882);
		contentPane.add(scrollbar);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("7.- \u00BFTiene usted aspiraciones de ascender socialmente?");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(52, 434, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1.setBounds(63, 455, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1.setBounds(182, 455, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1);
		
		JRadioButton rdbtnR_1_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1.setBounds(293, 455, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1.setBounds(403, 455, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1);
		
		JRadioButton rdbtnN_1_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1.setBounds(524, 455, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("8.- \u00BFToma usted las cosas cuando vienen, en vez de tratar de hacer muchas a la vez?");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(52, 481, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(63, 502, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1.setBounds(182, 502, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1);
		
		JRadioButton rdbtnR_1_1_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1.setBounds(293, 502, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1.setBounds(403, 502, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1);
		
		JRadioButton rdbtnN_1_1_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1.setBounds(524, 502, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("9.- \u00BFEs usted consiente de las presiones del tiempo y de las citas y acuerdos?");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(54, 528, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1_1.setBounds(65, 549, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1_1.setBounds(184, 549, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1_1);
		
		JRadioButton rdbtnR_1_1_1_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1_1.setBounds(295, 549, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1_1.setBounds(405, 549, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1_1);
		
		JRadioButton rdbtnN_1_1_1_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1_1.setBounds(526, 549, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1 = new JLabel("10.- \u00BFEs usted conversador, calmado y tranquilo?");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setBounds(54, 575, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1_1_1.setBounds(65, 596, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1_1_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1_1_1.setBounds(184, 596, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnR_1_1_1_1_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1_1_1.setBounds(295, 596, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1_1_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1_1_1.setBounds(405, 596, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnN_1_1_1_1_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1_1_1.setBounds(526, 596, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1 = new JLabel("13.- \u00BFLogra hacer las cosas r\u00E1pidamente?");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1.setBounds(51, 708, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1.setBounds(67, 728, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1_1_1_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1_1_1_1.setBounds(186, 728, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnR_1_1_1_1_1_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1_1_1_1.setBounds(297, 728, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1_1_1_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1_1_1_1.setBounds(407, 728, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnN_1_1_1_1_1_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1_1_1_1.setBounds(528, 728, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_2 = new JLabel("11.- \u00BFLe molestan las cosas y las personas?");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_2.setBounds(52, 621, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_2 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_2.setBounds(65, 642, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_2);
		
		JRadioButton rdbtnCs_1_1_1_1_1_1_1_2 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1_1_1_2.setBounds(184, 642, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1_1_1_2);
		
		JRadioButton rdbtnR_1_1_1_1_1_1_1_2 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1_1_1_2.setBounds(295, 642, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1_1_1_2);
		
		JRadioButton rdbtnCn_1_1_1_1_1_1_1_2 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1_1_1_2.setBounds(405, 642, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1_1_1_2);
		
		JRadioButton rdbtnN_1_1_1_1_1_1_1_2 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1_1_1_2.setBounds(526, 642, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_2_1 = new JLabel("12.- \u00BFSe encuentra usted satisfecho con sus actividades actuales, sin tener mayores aspiraciones?");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_2_1.setBounds(51, 664, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_2_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_2_1.setBounds(67, 684, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_2_1);
		
		JRadioButton rdbtnCs_1_1_1_1_1_1_1_2_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1_1_1_2_1.setBounds(186, 684, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1_1_1_2_1);
		
		JRadioButton rdbtnR_1_1_1_1_1_1_1_2_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1_1_1_2_1.setBounds(297, 684, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1_1_1_2_1);
		
		JRadioButton rdbtnCn_1_1_1_1_1_1_1_2_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1_1_1_2_1.setBounds(407, 684, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1_1_1_2_1);
		
		JRadioButton rdbtnN_1_1_1_1_1_1_1_2_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1_1_1_2_1.setBounds(528, 684, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("14.- \u00BFSe considera usted una persona f\u00E1cil de tratar?");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1.setBounds(52, 758, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1.setBounds(67, 775, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1_1_1_1_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1_1_1_1_1.setBounds(186, 775, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnR_1_1_1_1_1_1_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1_1_1_1_1.setBounds(297, 775, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1_1_1_1_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1_1_1_1_1.setBounds(407, 775, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnN_1_1_1_1_1_1_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1_1_1_1_1.setBounds(528, 775, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1 = new JLabel("15.- \u00BFSe considera usted una persona de acci\u00F3n?");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(52, 801, 581, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("S");
		rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1.setBounds(67, 822, 71, 23);
		contentPane.add(rdbtnNewRadioButton_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCs_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("CS");
		rdbtnCs_1_1_1_1_1_1_1_1_1_1.setBounds(186, 822, 71, 23);
		contentPane.add(rdbtnCs_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnR_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("R");
		rdbtnR_1_1_1_1_1_1_1_1_1_1.setBounds(297, 822, 71, 23);
		contentPane.add(rdbtnR_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnCn_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("CN");
		rdbtnCn_1_1_1_1_1_1_1_1_1_1.setBounds(407, 822, 71, 23);
		contentPane.add(rdbtnCn_1_1_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnN_1_1_1_1_1_1_1_1_1_1 = new JRadioButton("N");
		rdbtnN_1_1_1_1_1_1_1_1_1_1.setBounds(528, 822, 71, 23);
		contentPane.add(rdbtnN_1_1_1_1_1_1_1_1_1_1);
	}
}
