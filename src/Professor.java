/**
 * @author Carlos.Vieira
 */
public class Professor {

    private String nome;
    private String curso;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimirDadosDoProfessor() {
        System.out.println(this.nome);
        System.out.println(this.curso);
        System.out.println(this.matricula);
    }
}
