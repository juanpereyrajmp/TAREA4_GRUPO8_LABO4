package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(87, 51, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(87, 86, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(87, 112, 46, 45);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setBounds(86, 152, 80, 27);
		contentPane.add(lblFechaNac);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(227, 48, 150, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(227, 83, 150, 20);
		contentPane.add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(227, 124, 150, 20);
		contentPane.add(txtTelefono);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(227, 155, 150, 20);
		contentPane.add(txtFechaNac);
		
		JButton btnMostrar = new JButton("Mostrar");
		
		
		
		btnMostrar.setBounds(293, 198, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron:");
		lblDatos.setBounds(87, 232, 331, 27);
		contentPane.add(lblDatos);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(87, 264, 431, 86);
		contentPane.add(panel);
		
		JLabel lblMostrarDatos = new JLabel("");
		panel.add(lblMostrarDatos);
		lblMostrarDatos.setBackground(new Color(240, 255, 255));
		//BOTON QUE MUESTRA CONTENIDO DE LAS TXT Y VALIDA LOS MISMOS.

		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//validar estado de las txt y set back color.
				
				String input = "Nombre : " + txtNombre.getText() + "   Apellido " + txtApellido.getText() + "  Telefono:" + txtTelefono.getText()+ "  Nacimiento : " + txtFechaNac.getText();
				lblMostrarDatos.setText(input); 
			}
		});
		
	}
}
