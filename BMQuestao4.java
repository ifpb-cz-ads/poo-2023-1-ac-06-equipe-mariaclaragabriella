public class BMQuestao4 {
    private float preco = 14.5f;
    private String tipo = "LED";
    private String marca = "Filix";
    private boolean disponibilidade = true;

    boolean verificarDisponibilidade(){
        return disponibilidade;
    }

    boolean atualizarDisponibilidade(){
        return disponibilidade = false;
    }

    float perguntarPreco(){
        return preco;
    }

    String perguntarMarca(){
        return marca;
    }

    String perguntarTipo(){
        return tipo;
    }

    boolean comprarUnidade(){
        if(verificarDisponibilidade()){
            return atualizarDisponibilidade();
        }
        else{
            return false;
        }
    }

}
