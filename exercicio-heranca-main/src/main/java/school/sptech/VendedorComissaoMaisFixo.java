package school.sptech;

public class VendedorComissaoMaisFixo extends VendedorComissao {

    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Double calcularSalario() {
        return getVendas() * getTaxa() + salarioFixo;
    }
}
