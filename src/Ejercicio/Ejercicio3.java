package Ejercicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoras;
	private ButtonGroup grupoSO;


	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(464, 340);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelRadio = new JPanel();
		panelRadio.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelRadio.setBounds(32, 25, 387, 48);
		contentPane.add(panelRadio);
		panelRadio.setLayout(null);
		
		JLabel lblSistemaOperativo = new JLabel("Elije un sistema operativo");
		lblSistemaOperativo.setBounds(10, 11, 148, 26);
		panelRadio.add(lblSistemaOperativo);
		
		grupoSO = new ButtonGroup();
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setSelected(true);
		rdbtnWindows.setBounds(154, 13, 85, 23);
		panelRadio.add(rdbtnWindows);
		grupoSO.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(241, 13, 63, 23);
		panelRadio.add(rdbtnMac);
		grupoSO.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(306, 13, 75, 23);
		panelRadio.add(rdbtnLinux);
		grupoSO.add(rdbtnLinux);
		
		JPanel panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEspecialidad.setBounds(32, 84, 387, 91);
		contentPane.add(panelEspecialidad);
		panelEspecialidad.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Elije una especialidad");
		lblEspecialidad.setBounds(31, 40, 153, 14);
		panelEspecialidad.add(lblEspecialidad);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setBounds(209, 7, 126, 23);
		panelEspecialidad.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracion.setBounds(209, 36, 126, 23);
		panelEspecialidad.add(chckbxAdministracion);
		
		JCheckBox chckbxDiseno = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDiseno.setBounds(209, 62, 126, 23);
		panelEspecialidad.add(chckbxDiseno);
		
		JPanel panelHoras = new JPanel();
		panelHoras.setBounds(32, 186, 387, 36);
		contentPane.add(panelHoras);
		panelHoras.setLayout(null);
		
		JLabel lblCantidadHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadHoras.setBounds(10, 11, 240, 14);
		panelHoras.add(lblCantidadHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(260, 8, 86, 20);
		panelHoras.add(txtHoras);
		txtHoras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		//btn para mostrar mensaje.
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//vars a mostrar
				String SelectedSO;
				
				if(rdbtnLinux.isSelected()) {
					SelectedSO= rdbtnLinux.getText();
				}else if(rdbtnMac.isSelected()) {
					SelectedSO=rdbtnMac.getText();
				}else {
					SelectedSO = rdbtnWindows.getText();
				}
				
				
				
				String msj = SelectedSO + " - " + " - "+ " - " ;
				
				//mostrar mediante .. : 
				JOptionPane.showMessageDialog(null, msj);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(323, 244, 96, 29);
		contentPane.add(btnAceptar);
	}
}
