package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContaCorrente {

    private String titular;
    private String agencia;
    private String numero;
    private List<Operacao> operacoes = new ArrayList<>();

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Operacao> getOperacoes() {
        return operacoes;
    }

    public void adicionarOperacao(String categoria, String descricao, Double valor) {
        if ((categoria == null || categoria.isBlank()) || (descricao == null || descricao.isBlank())) {
            return;
        }

        if (valor == null || valor <= 0.0) {
            return;
        }

        Operacao novaOperacao = new Operacao(categoria, descricao, valor);

        operacoes.add(novaOperacao);
    }

    public Double obterSaldo() {
        Double saldoTotal = 0.0;
        for (Operacao operacoe : operacoes) {
            saldoTotal += operacoe.getValor();
        }
        return saldoTotal;
    }

    public List<Operacao> buscarOperacoesPorCategoria(String categoria) {
        List<Operacao> listaOperacoes = new ArrayList<>();
        for (Operacao operacoe : operacoes) {
          if (operacoe.getCategoria().equalsIgnoreCase(categoria)) {
              listaOperacoes.add(operacoe);
          }
        }
        return listaOperacoes;
    }

    public List<Operacao> buscarOperacoesPorValor(Double valor){
        List<Operacao> listaOperacoes = new ArrayList<>();
        for (Operacao operacoe : operacoes) {
            if (operacoe.getValor().equals(valor)) {
                listaOperacoes.add(operacoe);
            }
        }
        return listaOperacoes;
    }

    public List<Operacao> buscarOperacoesSaida() {
        List<Operacao> listaOperacao = new ArrayList<>();
        for (Operacao operacoe : operacoes) {
            if (operacoe.getValor() <= 0) {
                listaOperacao.add(operacoe);
            }
        }

        return listaOperacao;
    }

    public List<Operacao> buscarOperacoesPorDescricao(String descricao) {
        List<Operacao> listaOperacao = new ArrayList<>();

        if (descricao == null) {
            return listaOperacao;
        }

        String novaDescricao = descricao.toLowerCase();

        for (Operacao operacoe : operacoes) {
            if (operacoe.getDescricao().toLowerCase().contains(novaDescricao)) {
                listaOperacao.add(operacoe);
            }
        }
        return listaOperacao;
    }

    public Double buscarMenorValor() {
        Double menorValor = 999.99;

        if (operacoes.size() < 1) {
            menorValor = 0.0;
        }

        for (Operacao operacoe : operacoes) {
            if (operacoe.getValor() <= menorValor){
                menorValor = operacoe.getValor();
            }
        }
        return menorValor;
    }

    public Double obterSaldoPorCategoria(String categoria) {
        Double saldoPorCategoria = 0.0;

        if (categoria == null || categoria.isBlank() || operacoes.isEmpty()) {
            return 0.0;
        }

        for (Operacao operacoe : operacoes) {
            if (operacoe.getCategoria().equalsIgnoreCase(categoria)) {
                saldoPorCategoria += operacoe.getValor();
            }
        }
        return saldoPorCategoria;
    }

    public String buscarCategoriaComMaiorGasto(){
        if (operacoes.isEmpty()) {
            return null;
        }

        List<String> categorias = new ArrayList<>();String categoriaCampea = null;
        Double maiorGasto = 0.0;

        for (Operacao op1 : operacoes) {
            if (op1.getValor() < 0) {
                Double totalDessaCategoria = 0.0;

                for (Operacao op2 : operacoes) {
                    if (op2.getCategoria().equalsIgnoreCase(op1.getCategoria()) && op2.getValor() < 0) {
                        totalDessaCategoria += Math.abs(op2.getValor());
                    }
                }

                if (totalDessaCategoria > maiorGasto) {
                    maiorGasto = totalDessaCategoria;
                    categoriaCampea = op1.getCategoria();
                }
            }
        }

        return categoriaCampea;
    }
}
