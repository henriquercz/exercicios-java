package school.sptech;

import java.util.Objects;

public class Operacao {

    private String categoria;
    private String descricao;
    private Double valor;

    public Operacao(String categoria, String descricao, Double valor) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "categoria='" + categoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Operacao operacao = (Operacao) o;
        return Objects.equals(categoria, operacao.categoria) && Objects.equals(descricao, operacao.descricao) && Objects.equals(valor, operacao.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria, descricao, valor);
    }
}
