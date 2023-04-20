package CBBQuestao01;

public class TesteIgualdade{
    public static void main(String[] args){
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando Igualdade!");
        System.out.println("Frase 1: "+ frase1);
        System.out.println("Frase 2: "+ frase2);
        System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1==frase2)); 
        
        //O que esse código faz: a instrução lógica de comparação vai retornar falsa, 
        //mesmo que teoricamente os valores das strings sejam iguais. Essa questão ajuda a
        //entender que quando se compara dois objetos com ==, ele vai comparar o espaço 
        //de memória, não o valor em si. 
        //Em outras palavras: ele vai comparar se os objetos são diferentes. 
    }
}
