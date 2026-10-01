package school.sptech;

public class Aluno {

    private String ra;
    private String nome;
    protected Double notaAc1;
    protected Double notaAc2;
    protected Double notaAc3;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Double calcularNotaFinal() {
        return notaAc1 * 0.25 + notaAc2 * 0.35 + notaAc3 * 0.4;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaAc1() {
        return notaAc1;
    }

    public void setNotaAc1(Double notaAc1) {
        this.notaAc1 = notaAc1;
    }

    public Double getNotaAc2() {
        return notaAc2;
    }

    public void setNotaAc2(Double notaAc2) {
        this.notaAc2 = notaAc2;
    }

    public Double getNotaAc3() {
        return notaAc3;
    }

    public void setNotaAc3(Double notaAc3) {
        this.notaAc3 = notaAc3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", notaAc1=" + notaAc1 +
                ", notaAc2=" + notaAc2 +
                ", notaAc3=" + notaAc3 +
                ", notaFinal=" + calcularNotaFinal() +
                '}';
    }
}
