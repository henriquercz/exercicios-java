package school.sptech;

import com.sun.jdi.DoubleValue;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public Double calcularMediaGeral() {
        Double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularNotaFinal(); // Poliformismo
        }
        return soma / alunos.size();
    }

    public void exibirAlunosPos() {
        IO.println("Alunos Pós Graduação:");
        for (Aluno aluno : alunos) {
            if (aluno instanceof AlunoPos) {
                IO.println(aluno);
            }
        }
    }

    public Double calcularMediaTcc() {
        Double soma = 0.0;
        Integer quantidade = 0;

        for (Aluno aluno : alunos) {
//            if (aluno instanceof AlunoPos) {
//                soma += ((AlunoPos) aluno).getNotaTcc();
//                quantidade++;
//            }
            if (aluno instanceof AlunoPos alunoPos) {
                soma += alunoPos.getNotaTcc();
                quantidade++;
            }
        }

        return soma / quantidade;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Faculdade{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                ", \n mediaGeral=" + calcularMediaGeral() +
                '}';
    }
}
