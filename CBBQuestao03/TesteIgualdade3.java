package CBBQuestao03;

public class TesteIgualdade3 {
    public static void main(String[] args) {
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("Frase 1 e frase 2 possuem o mesmo conteúdo? R: " + (frase1.equals(frase2)));

    }
}

/*
Essa questão ajudou a desmonstar como mesmo que os espaços de memória sejam diferentes,
o método equals permite que as Strings sejam comparadas corretamente por falor.
 */
