package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    boolean apresentouDocsDeMatricula;
    boolean concluiuTodasAsDisciplinas;
    boolean nadaConsta;
    
    public boolean podeSolicitarDiploma() {
        if (apresentouCertificadoEM && apresentouDocsDeMatricula && concluiuTodasAsDisciplinas && nadaConsta) {
            return true;
        } else {
            return false;
        }
    }

}
