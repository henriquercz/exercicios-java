package school.sptech.ex02;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public void matricular(Aluno aluno) {
        if (aluno.getNome().isEmpty() || aluno.getNome() == null) {
            return;
        } else if (aluno.getIdade() < 0 || aluno.getIdade() == null) {
            return;
        } else if (aluno.getNotaAtividade() < 0.0 || aluno.getNotaAtividade() > 10.0 || aluno.getNotaAtividade() == null) {
            return;
        } else if (aluno.getNotaProva() < 0.0 || aluno.getNotaProva() > 10.0 || aluno.getNotaProva() == null) {
            return;
        }
    }

    public List<Aluno> buscarPorParteDoNome(String nome) {
        List<Aluno> buscaAlunos = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().contains(nome)) {
                buscaAlunos.add(aluno);
            }
        }
        return buscaAlunos;
    }

    public List<Aluno> encontrarAlunosComMesmaNota() {
        List<Aluno> listaFinal = new ArrayList<>();

//        for (int i = 0; i < alunos.size(); i++) {
//            for (int j = i+1; j < alunos.size(); j++) {
//                Aluno a1 = alunos.get(i);
//                Aluno a2 = alunos.get(j);
//
//                if (a1.calcularNotaFinal().equals(a2.calcularNotaFinal())) {
//                    if (!listaFinal.contains(a1)) {
//                        listaFinal.add(a1);
//                    }
//                    if (!listaFinal.contains(a2)) {
//                        listaFinal.add(a2);
//                    }
//                }
//            }
//        }

        for (int i = 0; i < alunos.size(); i++) {
            for (int j = 0; j < alunos.size(); j++) {
                Aluno a1 = alunos.get(i);
                Aluno a2 = alunos.get(j);

                if (i != j && a1.calcularNotaFinal().equals(a2.calcularNotaFinal())) {
                    listaFinal.add(a1);
                    break;
                }
            }
        }

        return listaFinal;
    }


}
