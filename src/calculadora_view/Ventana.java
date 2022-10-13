package calculadora_view;

import calculadora_controller.CalculadoraController;
import calculadora_model.Division;
import calculadora_model.Multiplicacion;
import calculadora_model.OperacionMatematica;
import calculadora_model.Resta;
import calculadora_model.Suma;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    private JPanel mainPanel;
    JTextField numeroAField, numeroBField;
    JLabel operacionLabel;
    JButton botonSuma, botonResta, botonMultiplicacion, botonDivision, botonMostrarResultado;
    private OperacionMatematica operacionMatematica;

    HashMap<String, Integer> operacionDiccionario = new HashMap();

    public Ventana() {
        this.setSize(500, 200);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Mi Calculadora");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        operacionDiccionario.put("+", 1);
        operacionDiccionario.put("-", 2);
        operacionDiccionario.put("*", 3);
        operacionDiccionario.put("/", 4);
        
        construirPanel();
    }

    private void construirPanel() {
        //this.setLayout(null);
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        numeroAField = new JTextField();
        numeroAField.setBounds(10, 10, 200, 40);
        numeroAField.setFont(new Font("arial", Font.PLAIN, 24));

        mainPanel.add(numeroAField);

        numeroBField = new JTextField();
        numeroBField.setBounds(250, 10, 200, 40);
        numeroBField.setFont(new Font("arial", Font.PLAIN, 24));

        mainPanel.add(numeroBField);

        operacionLabel = new JLabel("+");
        operacionLabel.setBounds(220, 10, 40, 40);
        operacionLabel.setFont(new Font("arial", Font.PLAIN, 24));

        mainPanel.add(operacionLabel);

        botonSuma = new JButton("+");
        botonSuma.setBounds(10, 60, 50, 50);
        botonSuma.setFont(new Font("arial", Font.BOLD, 16));

        ActionListener botonSumaActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacionLabel.setText("+");
            }
        };

        botonSuma.addActionListener(botonSumaActionListener);

        mainPanel.add(botonSuma);

        botonResta = new JButton("-");
        botonResta.setBounds(150, 60, 50, 50);
        botonResta.setFont(new Font("arial", Font.BOLD, 16));

        ActionListener botonRestaActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacionLabel.setText("-");
            }
        };

        botonResta.addActionListener(botonRestaActionListener);
        mainPanel.add(botonResta);

        botonMultiplicacion = new JButton("*");
        botonMultiplicacion.setBounds(280, 60, 50, 50);
        botonMultiplicacion.setFont(new Font("arial", Font.BOLD, 16));

        ActionListener botonMultiplicacionActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacionLabel.setText("*");
            }
        };

        botonMultiplicacion.addActionListener(botonMultiplicacionActionListener);
        mainPanel.add(botonMultiplicacion);

        botonDivision = new JButton("/");
        botonDivision.setBounds(400, 60, 50, 50);
        botonDivision.setFont(new Font("arial", Font.BOLD, 16));

        ActionListener botonDivisionActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacionLabel.setText("/");
            }
        };

        botonDivision.addActionListener(botonDivisionActionListener);
        mainPanel.add(botonDivision);

        botonMostrarResultado = new JButton("Mostrar resultado");
        botonMostrarResultado.setBounds(120, 120, 200, 50);
        botonMostrarResultado.setFont(new Font("arial", Font.BOLD, 16));

        ActionListener botonMostrarResultadoActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double numeroA = Double.parseDouble(numeroAField.getText());
                    double numeroB = Double.parseDouble(numeroBField.getText());

                    CalculadoraController controller = new CalculadoraController(numeroA, numeroB, operacionDiccionario.get(operacionLabel.getText()));

                    JOptionPane.showMessageDialog(null, controller.realizarCalculo());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Ocurrió un error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        botonMostrarResultado.addActionListener(botonMostrarResultadoActionListener);
        mainPanel.add(botonMostrarResultado);

        this.getContentPane().add(mainPanel);

    }
}
