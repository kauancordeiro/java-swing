package dev.cordeiro.calculadora;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class Calculadora extends CalculadoraForm{
    @Override
    protected void btnExitClick(ActionEvent ev) {
        this.setVisible(false);
        this.dispose();
    }

    @Override
    protected void btnClearClick(ActionEvent ev) {
        txtCapital.setText("");
        txtInterestRate.setText("");
        txtPeriod.setText("");
        txtResult.setText("");

    }

    @Override
    protected void btnCalcClick(ActionEvent ev) {
        double capital = Integer.parseInt(txtCapital.getText());
        double interestRate = Integer.parseInt(txtInterestRate.getText());
        double period = Integer.parseInt(txtPeriod.getText());
        double result = calcularJuros(capital,interestRate,period);

        // DEFINO UMA FORMATAÇÃO COM DUAS CASAS DECIMAIS
        DecimalFormat df = new DecimalFormat("#.00");
        // FORMATO O RESULTADO
        String resultFormatadoStr = df.format(result);


        txtResult.setText(resultFormatadoStr);

    }

    public double calcularJuros(double capital, double interestRate, double period){
        return capital * Math.pow((1 + 0.05),period);
    }
}
