package Ejercicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

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
    	txt1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if((c<'0' || c>'9')&& (c!='.')) {
					e.consume();
				}
				
			}
		});
    	
    	txt1.setBounds(108, 44, 150, 20);
    	panelSuperior.add(txt1);
    	txt1.setColumns(10);
    	
    	txt3 = new JTextField();
    	txt3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if((c<'0' || c>'9')&& (c!='.')) {
					e.consume();
				}
				
			}
		});
    	txt3.setColumns(10);
    	txt3.setBounds(108, 94, 150, 20);
    	panelSuperior.add(txt3);
    	
    	txt2 = new JTextField();
    	txt2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if((c<'0' || c>'9')&& (c!='.')) {
					e.consume();
				}
				
			}
		});
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
    	txtPromedio.setEditable(false);
    	txtPromedio.setBounds(115, 41, 141, 20);
    	panelInferior.add(txtPromedio);
    	txtPromedio.setColumns(10);
    	
    	txtCondicion = new JTextField();
    	txtCondicion.setEditable(false);
    	txtCondicion.setColumns(10);
    	txtCondicion.setBounds(115, 66, 141, 20);
    	panelInferior.add(txtCondicion);
    	
    	JPanel panelBotones = new JPanel();
    	panelBotones.setBounds(369, 47, 137, 200);
    	getContentPane().add(panelBotones);
    	panelBotones.setLayout(null);
    	
    	JButton btnCalcular = new JButton("CALCULAR");
    	
    	btnCalcular.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			
    			
    			//VALIDACION DE LOS CAMPOS COMPLETOS
    			
    			if (txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty()) {
    			    JOptionPane.showMessageDialog(null, "Debe ingresar las tres notas", "Error", JOptionPane.ERROR_MESSAGE);
    			    return;
    			}
    			

    			try {
    	    		double Nota1=Double.parseDouble(txt1.getText());
    	    		double Nota2=Double.parseDouble(txt2.getText());
    				double Nota3= Double.parseDouble(txt3.getText());
    				
    				
    				double notasAlumno[] = new double [3];
    				notasAlumno[0] = Nota1;
    				notasAlumno[1] = Nota2;
    				notasAlumno[2] = Nota3;
    				
    				boolean numeroFueraDeRango = false;
    				
    				for (int i = 0; i < 3 ; i++) {
    					if (notasAlumno[i] < 1.0 || notasAlumno[i] >10.0) {
    						numeroFueraDeRango = true;
    					}
    				}
    				
    				if (numeroFueraDeRango) {
    					JOptionPane.showMessageDialog(null, "Las notas deben ser del 1 al 10", "Error", JOptionPane.ERROR_MESSAGE);
    				}
    				else {
    						if(comboBox.getSelectedItem().equals("Desaprobado")) {
    		    			txtCondicion.setText("Libre");        			
    			    		}
    			    		else if(Nota1<6 || Nota2<6 || Nota3<6) {		
    			    				txtCondicion.setText("Libre");	
    						}
    			    		else if(Nota1>=8 && Nota2>=8 && Nota3>=8) {
    			    			txtCondicion.setText("Promocionado");	
    						}
    			    		else if((Nota1>=6 && Nota1<=8) && (Nota2>=6 && Nota2<=8) && (Nota3>=6 && Nota3<=8) && comboBox.getSelectedItem().equals("Aprobado")) {
    			    			txtCondicion.setText("Regular");
    			    		}
    			    		else {
    			    			txtCondicion.setText("Regular");
    			    		}
    			    		double Promedio =((Nota1+Nota2+Nota3)/3);
    			    		String prom = String.format("%.2f", Promedio);
    			    		txtPromedio.setText(prom);
    			    		
    					}
    				}
    	    		catch(NumberFormatException exc) {
    	    			  JOptionPane.showMessageDialog(null, "Ingresa valores validos", "Error", JOptionPane.ERROR_MESSAGE);
    	    			  
    	    		}}	
    		        		
    		   
    	});
    	btnCalcular.setBounds(10, 11, 117, 47);
    	panelBotones.add(btnCalcular);
    	
    	JButton btnNuevo = new JButton("NUEVO");
    	btnNuevo.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			LimpiarTextField();
    		}
    	});
    	btnNuevo.setBounds(10, 69, 117, 47);
    	panelBotones.add(btnNuevo);
    	
    	JButton btnSalir = new JButton("SALIR");
    	btnSalir.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        dispose(); 
    	    }
    	});
    	btnSalir.setBounds(10, 127, 117, 47);
    	panelBotones.add(btnSalir);

        
    }
    void LimpiarTextField() {
    	txt1.setText("");
    	txt2.setText("");
    	txt3.setText("");
    	txtPromedio.setText("");
    	txtCondicion.setText("");

    }
    String determinarCondicion(double nota1, double nota2, double nota3, String estadoTP) {
        if (estadoTP.equals("Desaprobado")) {
            return "Libre";
        }

        if (nota1 < 6 || nota2 < 6 || nota3 < 6) {
            return "Libre";
        }

        if (nota1 >= 8 && nota2 >= 8 && nota3 >= 8 && estadoTP.equals("Aprobado")) {
            return "Promoción";
        }

        if (nota1 >= 6 && nota1 < 8 && nota2 >= 6 && nota2 < 8 && nota3 >= 6 && nota3 < 8 && estadoTP.equals("Aprobado")) {
            return "Regular";
        }

        return "Libre";
    }

   
}
