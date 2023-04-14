package br.com;

import javax.swing.JOptionPane;

public class Cantina {
    public static void main(String[] args) {
         Pedido p = new Pedido();
        String nome = JOptionPane.showInputDialog("Informe o Nome");
        c.nome = nome;
        p.c = c;

        Massa m = new Massa();
        String nomeMassa = JOptionPane.showInputDialog("Informe o Nome da massa");
        m.tipo= tipoMassa;
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("informe o valor"));
        m.valor = valorMassa;
        p.m = m;
    }
    }
