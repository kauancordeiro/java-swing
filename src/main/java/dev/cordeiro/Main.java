package dev.cordeiro;

import dev.cordeiro.calculadora.Calculadora;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Metodo responsavel por não trava a aplicação
        // Chama a tela dentro de uma thread
        // Boa pratica
        SwingUtilities.invokeLater(() -> {
            Calculadora calc = new Calculadora();
            calc.setVisible(true);
        });

    }
}