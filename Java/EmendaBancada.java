import java.util.List;

public class EmendaBancada extends Emenda {
    private String localidade;
    private List<String> parlamentares;
    private String parlamentarSugestao;

    public EmendaBancada(int id, String autor, int ano, double valorTotal,
                         String localidade, List<String> parlamentares, String parlamentarSugestao) {
        super(id, autor, ano, valorTotal);
        this.localidade = localidade;
        this.parlamentares = parlamentares;
        this.parlamentarSugestao = parlamentarSugestao;
    }


    public String getLocalidade() { return localidade; }
    public void setLocalidade(String localidade) { this.localidade = localidade; }

    public List<String> getParlamentares() { return parlamentares; }
    public void setParlamentares(List<String> parlamentares) { this.parlamentares = parlamentares; }

    public String getParlamentarSugestao() { return parlamentarSugestao; }
    public void setParlamentarSugestao(String parlamentarSugestao) { this.parlamentarSugestao = parlamentarSugestao; }

    @Override
    public String toString() {
        return super.toString() + " [localidade=" + localidade +
                ", parlamentares=" + parlamentares +
                ", parlamentarSugestao=" + parlamentarSugestao + "]";
    }
}
