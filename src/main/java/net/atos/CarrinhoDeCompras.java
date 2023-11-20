package net.atos;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public CarrinhoDeCompras adiciona(Produto produto) {
        produtos.add(produto);
        return this;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public double maiorValor() {
        if (produtos.isEmpty()) {
            return 0;
        }
        double maiorValor = produtos.get(0).getValor();
        for (Produto produto : produtos) {
            if (maiorValor < produto.getValor()) {
                maiorValor = produto.getValor();
            }
        }
        return maiorValor;
    }

}
