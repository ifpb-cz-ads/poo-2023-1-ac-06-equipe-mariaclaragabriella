import java.util.ArrayList;

public class TimeDeFutebol {
    private String nome;
    private ArrayList<String> jogadores = new ArrayList<>();
    private String tecnico;
    private int pontosAcumulados;
    private int partidasJogadas;
    private int saldoDeGols;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getJogadores() {
        return jogadores;
    }


    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getPontosAcumulados() {
        return pontosAcumulados;
    }

    public void setPontosAcumulados(int pontosAcumulados) {
        this.pontosAcumulados = pontosAcumulados;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }

    public int getSaldoDeGols() {
        return saldoDeGols;
    }

    public void setSaldoDeGols(int saldoDeGols) {
        this.saldoDeGols = saldoDeGols;
    }

    void adicionaJogador(String jogador){
        jogadores.add(jogador);
    }

    int aumentarPontos(int pontos){
        if(pontos > 3 || pontos < 0){
            return 0;
        }
            return pontosAcumulados+=pontos;
        }

    int atualizarSaldoDeGols(int golsMarcados, int golsTomados){
        int total = golsMarcados - golsTomados;
        return saldoDeGols + total;
    }

    int atualizarPartidasJogadas(){
        return partidasJogadas++;
    }

}
