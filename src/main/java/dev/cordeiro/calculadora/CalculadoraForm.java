package dev.cordeiro.calculadora;

import javax.swing.*;

public class CalculadoraForm extends JFrame {

    protected JPanel panelEnd;
    protected JPanel panelCenter;


    protected JButton btnCalc;
    protected JButton btnClear;
    protected JButton btnExit;

    protected JLabel lblCapital;
    protected JTextField txtCapital;

    protected JLabel lblInterestRate;
    protected JTextField txtInterestRate;


    public CalculadoraForm(){
        this.initComponents();
    }

    public void initComponents(){
        this.setTitle("Calculadora de juros compostos");
    }



}
