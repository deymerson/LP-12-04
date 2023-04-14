package br.com;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Cliente c;
    Massa m;
    List<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

    public double CalculaValor(){
        double valorInicial = m.valor;
        int = qtdeIngredientesEscolhidos = listaIngredientes.size();
        double valorTotalIngredientes = qtdeIngredientesEscolhidos * 2;
        double valorTotalPedido = valorInicial + valorTotalIngredientes;
        double valorTotalPedido = valorInicial + valorTotalIngredientes;
        return valorTotalPedido;
    }
}
