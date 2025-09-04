import java.util.List;

public class EmendaComissao extends Emenda {
    private String area;
    private List<String> parlamentaresComissao;
    private String parlamentarSugestao;
    private String linkComissao;
    private String linkRelatorio;

    public EmendaComissao(int id, String autor, int ano, double valorTotal,
                          String area, List<String> parlamentaresComissao,
                          String parlamentarSugestao, String linkComissao, String linkRelatorio) {
        super(id, autor, ano, valorTotal);
        this.area = area;
        this.parlamentaresComissao = parlamentaresComissao;
        this.parlamentarSugestao = parlamentarSugestao;
        this.linkComissao = linkComissao;
        this.linkRelatorio = linkRelatorio;
    }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public List<String> getParlamentaresComissao() { return parlamentaresComissao; }
    public void setParlamentaresComissao(List<String> parlamentaresComissao) { this.parlamentaresComissao = parlamentaresComissao; }

    public String getParlamentarSugestao() { return parlamentarSugestao; }
    public void setParlamentarSugestao(String parlamentarSugestao) { this.parlamentarSugestao = parlamentarSugestao; }

    public String getLinkComissao() { return linkComissao; }
    public void setLinkComissao(String linkComissao) { this.linkComissao = linkComissao; }

    public String getLinkRelatorio() { return linkRelatorio; }
    public void setLinkRelatorio(String linkRelatorio) { this.linkRelatorio = linkRelatorio; }

    @Override
    public String toString() {
        return super.toString() + " [area=" + area +
                ", parlamentaresComissao=" + parlamentaresComissao +
                ", parlamentarSugestao=" + parlamentarSugestao +
                ", linkComissao=" + linkComissao +
                ", linkRelatorio=" + linkRelatorio + "]";
    }
}
