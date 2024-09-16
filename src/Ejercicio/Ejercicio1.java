package Ejercicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ejercicio1 extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;

	private JButton btnMostrar;
	private JLabel lblLosDatos;



	public Ejercicio1() {
		setResizable(false);
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//DISPOSE_ON_CLOSE Cierra solo esta ventana
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
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				char c = arg0.getKeyChar();
				if((c!=' ')&& ((!Character.isLetter(c)))){
					arg0.consume();
				}
			}
		});
		
		
		txtNombre.setBounds(227, 48, 150, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if((c!=' ')&& ((!Character.isLetter(c)))){
					e.consume();
				}
				
			}
		});
		txtApellido.setColumns(10);
		txtApellido.setBounds(227, 83, 150, 20);
		contentPane.add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			int cont = 0; //Contador para que solo se pueda ingresar una vez el "+" en el textfield numero
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c== '+') { 
					if(cont ==0) {
						cont++;
					}
					else {
						e.consume();
					}
				}
				if((c<'0' || c>'9')&& (c!='+') && (c!=' ')) {
					e.consume();
				}
				
			}
		});
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(227, 124, 150, 20);
		contentPane.add(txtTelefono);
		
		txtFechaNac = new JTextField();
		txtFechaNac.addKeyListener(new KeyAdapter() {
			int contBarra = 0;
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				 if (c == '/') {
			            if (contBarra < 2) {
			                contBarra++;
			            } else {
			                e.consume();
			            }
			        } else if ((c < '0' || c > '9')) {
			            e.consume();
			        }
				 
			}
		});
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(227, 155, 150, 20);
		contentPane.add(txtFechaNac);
		
		 btnMostrar = new JButton("Mostrar");
		 btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.RED);
					lblLosDatos.setText("");
				}
				else {
					txtNombre.setBackground(Color.WHITE);
				}
				if(txtApellido.getText().isEmpty()) {
					txtApellido.setBackground(Color.RED);
					lblLosDatos.setText("");
				}
				else {
					txtApellido.setBackground(Color.WHITE);
				}
				if(txtTelefono.getText().isEmpty()) {
					txtTelefono.setBackground(Color.RED);
					lblLosDatos.setText("");
				}
				else {
					txtTelefono.setBackground(Color.WHITE);
				}
				if(txtFechaNac.getText().isEmpty()) {
					txtFechaNac.setBackground(Color.RED);
					lblLosDatos.setText("");
				}
				else {
					txtFechaNac.setBackground(Color.WHITE);
				}
				if(!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtTelefono.getText().isEmpty() && !txtFechaNac.getText().isEmpty()) {
					lblLosDatos.setText("Los datos fueron: "+txtNombre.getText()+" "+txtApellido.getText()+" "+txtTelefono.getText()+" "+txtFechaNac.getText());
					txtNombre.setText("");
					txtApellido.setText("");
					txtTelefono.setText("");
					txtFechaNac.setText("");
					txtNombre.setBackground(Color.WHITE);
					txtApellido.setBackground(Color.WHITE);
					txtTelefono.setBackground(Color.WHITE);
					txtFechaNac.setBackground(Color.WHITE);
				}
				
			}
		});
		btnMostrar.setBounds(241, 205, 89, 23);
		contentPane.add(btnMostrar);
		
		lblLosDatos = new JLabel("");
		lblLosDatos.setBounds(60, 252, 411, 14);
		contentPane.add(lblLosDatos);
		
	}
}
