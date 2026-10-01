package school.sptech;

public class AlunoPos extends Aluno{

    private Double notaTcc;

    public AlunoPos(String ra, String nome) {
        super(ra, nome);
    }

    @Override
    public Double calcularNotaFinal() {
        return notaAc1 * 0.2 + notaAc2 * 0.2 + notaAc3 * 0.2 + notaTcc * 0.4;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    @Override
    public String toString() {
        return super.toString() + " AlunoPos{" +
                "notaTcc=" + notaTcc +
                '}';
    }
}
