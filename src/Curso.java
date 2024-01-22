/**
 * @author Carlos.Vieira
 */

public class Curso {
    public static void main (String args[]) {
        Aluno aluno = new Aluno();
        aluno.cadastrarNomeAluno("Eduardo");
        aluno.cadastrarCursoAluno("Back-end Java");
        aluno.cadastrarMatriculaAluno(123456);
        Professor professor = new Professor();
        professor.setNome("Rodrigo");
        professor.setCurso("Back-end Java");
        professor.setMatricula(987654);
        aluno.imprimirDadosDoAluno();
        professor.imprimirDadosDoProfessor();
    }
}
