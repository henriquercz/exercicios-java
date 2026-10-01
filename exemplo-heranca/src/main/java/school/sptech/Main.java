package school.sptech;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Aluno aluno = new Aluno("010101", "Manuel");
        aluno.setNotaAc1(10.0);
        aluno.setNotaAc2(6.0);
        aluno.setNotaAc3(8.0);
        IO.println(aluno);

        Aluno aluno2 = new Aluno("010102", "Alexandre");
        aluno2.setNotaAc1(10.0);
        aluno2.setNotaAc2(10.0);
        aluno2.setNotaAc3(10.0);
        IO.println(aluno2);

        AlunoPos alunoPos = new AlunoPos("010103", "Vera");
        alunoPos.setNotaAc1(9.9);
        alunoPos.setNotaAc2(7.4);
        alunoPos.setNotaAc3(9.5);
        alunoPos.setNotaTcc(5.5);
        IO.println(alunoPos);

        AlunoPos alunoPos2 = new AlunoPos("010104", "Rivello");
        alunoPos2.setNotaAc1(4.3);
        alunoPos2.setNotaAc2(5.6);
        alunoPos2.setNotaAc3(9.5);
        alunoPos2.setNotaTcc(7.5);
        IO.println(alunoPos2);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(alunoPos);
        IO.println(alunos);

        Faculdade faculdade = new Faculdade("SPTech");
        faculdade.matricular(aluno);
        faculdade.matricular(aluno2);
        faculdade.matricular(alunoPos);

        IO.println(faculdade);
        faculdade.exibirAlunosPos();

        IO.println(faculdade.calcularMediaTcc());
    }
}
