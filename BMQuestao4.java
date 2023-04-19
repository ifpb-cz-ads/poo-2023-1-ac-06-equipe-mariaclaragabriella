public class BMQuestao4 {
    private float preco;
    private String tipo;
    private String marca;
    private boolean disponibilidade;
    private int quantidade;

    boolean getDisponibilidade(){
        return disponibilidade;
    }

    float getPreco(){
        return preco;
    }

    String getMarca(){
        return marca;
    }

    String getTipo(){
        return tipo;
    }
    
    int getQuantidade(){
        return quantidade;
    }
    
    void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }

    void setPreco(float preco){
        this.preco = preco;
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    void atualizarDisponibilidade(){
        if(disponibilidade)
            disponibilidade = false;
        else 
            disponibilidade = true;
    }

    boolean comprarUnidades(int qtdd){
        if(disponibilidade==true&&qtdd<=quantidade){
            quantidade -= qtdd;
            if(quantidade==0){
                atualizarDisponibilidade();
            }
            return true;
        }
        else
            return false;
    }
    

}
