package CBBQuestao04;

public class RegistraAluno {
    private String nome;
    private String endereço;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    //retorna nome do estudante
    public String getNome(){
        return nome;
    }

    //define ou altera o nome do estudante
    public void setNome(String temp){
        nome = temp;
    }

    // retorna o endereço do estudante
    public String getEndereço(){
        return endereço;
    }

    //define ou altera o endereço do estudante
    public void setEndereço(String temp){
        endereço = temp;
    }
    //retorna a idade do estudante
    public int getIdade(){
        return idade;
    }
    //define ou altera idade do estudante
    public void setEndereço(int temp){
        idade = temp;
    }
    //define ou altera as notas
    public void setNotaMatematica(double temp){
        notaMatematica = temp;
    }

    public void setNotaPortugues(double temp) {
        notaPortugues = temp;
    }

    public void setNotaGeografia(double temp) {
        notaGeografia = temp;
    }

    //retorna media do estudante
    public double getMedia(){
        double resultado =0;
        resultado = (notaGeografia+notaPortugues+notaMatematica)/3;
        return resultado;
    }

    //retorna a quantidade de estudantes cadastrados
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
}
