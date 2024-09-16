package Ejercicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ejercicio2 extends JFrame{
	

	private static final long serialVersionUID = 1L;
	private JTextField txt1, txt2, txt3, txtPromedio, txtCondicion;

    public Ejercicio2() {
    	setTitle("Promedio");
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	getContentPane().setLayout(null);
    	setSize(550, 450);
    	setLocationRelativeTo(null);
    	
    	JPanel panelSuperior = new JPanel();
    	panelSuperior.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    	panelSuperior.setBounds(60, 37, 283, 168);
    	getContentPane().add(panelSuperior);
    	panelSuperior.setLayout(null);
    	
    	JLabel lblNota1 = new JLabel("Nota 1:");
    	lblNota1.setBounds(26, 47, 46, 14);
    	panelSuperior.add(lblNota1);
    	
    	JLabel lblNota2 = new JLabel("Nota 2:");
    	lblNota2.setBounds(26, 72, 46, 14);
    	panelSuperior.add(lblNota2);
    	
    	JLabel lblNota3 = new JLabel("Nota 3:");
    	lblNota3.setBounds(26, 97, 46, 14);
    	panelSuperior.add(lblNota3);
    	
    	JLabel lblTPS = new JLabel("TPS");
    	lblTPS.setBounds(26, 131, 46, 14);
    	panelSuperior.add(lblTPS);
    	
    	txt1 = new JTextField();
    	txt1.setBounds(108, 44, 150, 20);
    	panelSuperior.add(txt1);
    	txt1.setColumns(10);
    	
    	txt3 = new JTextField();
    	txt3.setColumns(10);
    	txt3.setBounds(108, 94, 150, 20);
    	panelSuperior.add(txt3);
    	
    	txt2 = new JTextField();
    	txt2.setColumns(10);
    	txt2.setBounds(108, 69, 150, 20);
    	panelSuperior.add(txt2);
    	
    	JComboBox<String> comboBox = new JComboBox<String>();
    	comboBox.addItem("Aprobado");
    	comboBox.addItem("Desaprobado");
    	comboBox.setBounds(108, 127, 150, 22);
    	panelSuperior.add(comboBox);
    	
    	JPanel panelInferior = new JPanel();
    	panelInferior.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
    	panelInferior.setBounds(60, 249, 283, 120);
    	getContentPane().add(panelInferior);
    	panelInferior.setLayout(null);
    	
    	JLabel lblPromedio = new JLabel("Promedio:");
    	lblPromedio.setBounds(40, 44, 65, 14);
    	panelInferior.add(lblPromedio);
    	
    	JLabel lblCondicion = new JLabel("Condicion:");
    	lblCondicion.setBounds(40, 69, 65, 14);
    	panelInferior.add(lblCondicion);
    	
    	txtPromedio = new JTextField();
    	txtPromedio.setBounds(115, 41, 141, 20);
    	panelInferior.add(txtPromedio);
    	txtPromedio.setColumns(10);
    	
    	txtCondicion = new JTextField();
    	txtCondicion.setColumns(10);
    	txtCondicion.setBounds(115, 66, 141, 20);
    	panelInferior.add(txtCondicion);
    	
    	JPanel panelBotones = new JPanel();
    	panelBotones.setBounds(369, 47, 137, 200);
    	getContentPane().add(panelBotones);
    	panelBotones.setLayout(null);
    	
    	JButton btnCalcular = new JButton("CALCULAR");
    	btnCalcular.setBounds(10, 11, 117, 47);
    	panelBotones.add(btnCalcular);
    	
    	JButton btnNuevo = new JButton("NUEVO");
    	btnNuevo.setBounds(10, 69, 117, 47);
    	panelBotones.add(btnNuevo);
    	
    	JButton btnSalir = new JButton("SALIR");
    	btnSalir.setBounds(10, 127, 117, 47);
    	panelBotones.add(btnSalir);

        
    }
}
