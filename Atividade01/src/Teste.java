
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

public class Teste {

    public static void main(String[] args) throws NegocioException {
        AlunoBO bo = new AlunoBO();

        for (Aluno aluno : bo.listar()) {
            System.out.println(aluno.getNome() + " " + aluno.getId());
        }
        
        System.out.println("-------------");
        
        
        Aluno alterarAluno = new Aluno();
        alterarAluno.setId(2);
        bo.alterar(alterarAluno);

        for (Aluno aluno : bo.listar()) {
            System.out.println(aluno.getNome() + " " + aluno.getId());
        }

    }
}
