package school.sptech.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (nome.equalsIgnoreCase(produto.getNome())){
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer contador = 0;
        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(nome)) {
                contador++;
            }
        }
        return contador;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removerPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produto);
                break;
            }
        }
    }

    public Produto getPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Double getValorTotal() {
        Double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
}
