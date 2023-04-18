package CBBQuestao04;

public class AppRegistraAluno {
    public static void main(String[] args) {
        //cria 3 objetos registra aluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();

        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");

        System.out.println(ana.getNome());
        //testes:
        System.out.println(beto.getNome());
        System.out.println(carlos.getNome());

        System.out.println("Contador: "+RegistraAluno.getQuantidadeAlunos());
    }
}
