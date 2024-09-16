package Ejercicio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame{

	private static final long serialVersionUID = 1L;

	private JTextField txtNota1, txtNota2, txtNota3;
    private JComboBox<String> comboBoxEstado;
    private JTextArea resultadoArea;
    private JButton calcularButton, nuevoButton, salirButton;

    public Ejercicio2() {
        setTitle("Promedios");
        setSize(533, 479);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        JPanel panelEntrada = new JPanel(new GridLayout(4, 2));
        panelEntrada.add(new JLabel("Nota 1:"));
        txtNota1 = new JTextField();
        panelEntrada.add(txtNota1);
        panelEntrada.add(new JLabel("Nota 2:"));
        txtNota2 = new JTextField();
        panelEntrada.add(txtNota2);
        panelEntrada.add(new JLabel("Nota 3:"));
        txtNota3 = new JTextField();
        panelEntrada.add(txtNota3);
        panelEntrada.add(new JLabel("Estado TP:"));
        comboBoxEstado = new JComboBox<>(new String[]{"Aprobado", "Desaprobado"});
        panelEntrada.add(comboBoxEstado);

        getContentPane().add(panelEntrada, BorderLayout.NORTH);

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        getContentPane().add(new JScrollPane(resultadoArea), BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();
        calcularButton = new JButton("Calcular");
        nuevoButton = new JButton("Nuevo");
        salirButton = new JButton("Salir");
        panelBotones.add(calcularButton);
        panelBotones.add(nuevoButton);
        panelBotones.add(salirButton);
        getContentPane().add(panelBotones, BorderLayout.SOUTH);

        
    }
}
