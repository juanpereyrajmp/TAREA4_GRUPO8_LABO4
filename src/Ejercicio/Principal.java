package Ejercicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	// MAIN QUE CORRE EL PROGRAMA
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	// VENTANA PRINCIPAL CON LOS 3 BOTONES
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrupo = new JLabel("GRUPO NRO: 8");
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupo.setBounds(119, 27, 113, 19);
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblGrupo);
		
		JButton btnBoton1 = new JButton("Ejercicio 1");
		//EJERCICIO 1
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 ejer1 = new Ejercicio1();
				ejer1.setVisible(true);
			}
		});
		btnBoton1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBoton1.setBounds(119, 69, 113, 23);
		contentPane.add(btnBoton1);
		
		JButton btnBoton2 = new JButton("Ejercicio 2");
		//EJERCICIO 2
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio2 ejer2 = new Ejercicio2();
				ejer2.setVisible(true);
			}
		});
		
		btnBoton2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBoton2.setBounds(119, 124, 113, 23);
		contentPane.add(btnBoton2);
		
		JButton btnBoton3 = new JButton("Ejercicio 3");
		//EJERCICIO 3 
		btnBoton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBoton3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBoton3.setBounds(119, 185, 113, 23);
		contentPane.add(btnBoton3);
	}
}
