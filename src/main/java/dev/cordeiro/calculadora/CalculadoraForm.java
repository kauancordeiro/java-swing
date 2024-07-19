package dev.cordeiro.calculadora;

import javax.swing.*;
import java.awt.*;

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

    protected JLabel lblPeriod;
    protected JTextField txtPeriod;

    protected JLabel lblResult;
    protected JTextField txtResult;


    public CalculadoraForm(){
        this.initComponents();
    }

    public void initComponents(){
        this.setTitle("Calculadora de juros compostos");
        this.setSize(640,480);
        //Operacao padrao para quando fechar a janela
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // ContentPane -> minha tela principal
        // Defino que minha tela principal vai seguir o border layout
        // definindo assim paneis de rodapé, centro, esquerda, direita e cabeçalho
        this.getContentPane().setLayout(new BorderLayout());

        // Adiciono a minha tela principal um painel, especificando o local onde ele vai ficar
        // BorderLayout.PAGE_END defino que ira ficar no rodapé
        this.getContentPane().add(getPanelEnd(), BorderLayout.PAGE_END);

        this.getContentPane().add(getPanelCenter(), BorderLayout.CENTER);


    }

    public JPanel getPanelEnd() {
        if(panelEnd == null){
            // inicio o jpanel
            // LAYOUT MANAGER SEMPRE NO CONSTRUTOR DO PAINEL
            // defino um layout para ele
            // o flow layout adiciona um componente atrás do outro
            // FlowLayout.CENTER, defino que o alinhamento é o centro
            panelEnd = new JPanel(new FlowLayout(FlowLayout.CENTER));

            btnCalc = new JButton("Calcular");
            btnClear = new JButton("Limpar");
            btnExit = new JButton("Fechar");

            panelEnd.add(btnCalc);
            panelEnd.add(btnClear);
            panelEnd.add(btnExit);
        }
        return panelEnd;
    }

    public JPanel getPanelCenter() {
        if(panelCenter == null){
            // LAYOUT MANAGER SEMPRE NO CONSTRUTOR DO PAINEL
            // GRID LAYOUT É CRIADO EM FORMATO DE TABELA
            // DEFININDO AS LINHAS E COLUNAS
            // 4 linhas e 2 colunas
            panelCenter = new JPanel(new GridLayout(4,2));

            lblCapital = new JLabel("Capital");
            txtCapital = new JTextField(20);

            lblInterestRate = new JLabel("Juros");
            txtInterestRate = new JTextField(20);

            lblPeriod = new JLabel("Period");
            txtPeriod = new JTextField(20);

            lblResult = new JLabel("Montante");
            txtResult = new JTextField(20);

            panelCenter.add(lblCapital);
            panelCenter.add(txtCapital);

            panelCenter.add(lblInterestRate);
            panelCenter.add(txtInterestRate);

            panelCenter.add(lblPeriod);
            panelCenter.add(txtPeriod);

            panelCenter.add(lblResult);
            panelCenter.add(txtResult);

        }
        return panelCenter;
    }
}
