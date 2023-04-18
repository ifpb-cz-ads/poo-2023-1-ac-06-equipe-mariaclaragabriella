public class CBBQuestao02 {
    public static void main(String[] args) {
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        System.out.println("Frase 3: " + frase3);
        System.out.println("Frase 4: " + frase4);
        System.out.println("Frase 3 e 4 possuem a mesma referência? R: " + (frase3==frase4));
    }
}

/*
* Os conceitos ficaram mais claros com esse exemplo, pois a atribuição por referência/endereço
* mostrou que a comparação por igualdade de fato funciona.
*/
