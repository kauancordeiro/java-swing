package dev.cordeiro.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class CalculadoraForm extends JFrame {

    private static final int TAMANHO_TXT = 10;

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
        this.eventActions();
    }

    public void initComponents(){
        this.setTitle("Calculadora de juros compostos");
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

        // Para não permitir redimensionar a tela
        this.setResizable(false);

        // AJUSTA O TAMANHO DA TELA DE ACORDO COM OS COMPONENTES
        pack();
    }


    //CRIO METODOS ABSTRATOS PARA IMPLEMENTAR O QUE CADA BOTAO VAI FAZER
    protected abstract void btnExitClick(ActionEvent ev);
    protected abstract void btnClearClick(ActionEvent ev);
    protected abstract void btnCalcClick(ActionEvent ev);

    //ADICIONO AS AÇÕES DOS BOTÕES A UM METODO ABSTRATO A SER IMPLEMENTADO
    public void eventActions(){
        btnExit.addActionListener(this::btnExitClick);
        btnClear.addActionListener(this::btnClearClick);
        btnCalc.addActionListener(this::btnCalcClick);

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
            txtCapital = new JTextField(TAMANHO_TXT);

            lblInterestRate = new JLabel("Juros");
            txtInterestRate = new JTextField(TAMANHO_TXT);

            lblPeriod = new JLabel("Period");
            txtPeriod = new JTextField(TAMANHO_TXT);

            lblResult = new JLabel("Montante");
            txtResult = new JTextField(TAMANHO_TXT);
            txtResult.setEnabled(false);

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
