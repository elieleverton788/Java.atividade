public class EmendaIndividual extends Emenda{
    private String tipo;
    private String funcao;
    private String subfuncao;
    private String programa;
    private String acao;
    private String planoOrcamentario;

    public EmendaIndividual(int id, String autor, int ano, double valorTotal,
    String tipo, String funcao, String subfuncao, String programa,
    String acao, String planoOrcamentario){

    super(id, autor, ano, valorTotal);
    this.tipo = tipo;
    this.funcao = funcao;
    this.subfuncao = subfuncao;
    this.programa = programa;
    this.acao = acao;
    this.planoOrcamentario = planoOrcamentario;

    }

public String getTipo(){return tipo;}
public void setTipo(String tipo){
    this.tipo = tipo;
}

public String getFuncao(){return funcao;}
public void setFuncao(String funcao){
    this.funcao = funcao;
}

public String getTSubfuncao(){return subfuncao;}
public void setSubfuncao(String subfuncao){
    this.subfuncao = subfuncao;
}

public String getPrograma(){return programa;}
public void setPrograma(String programa){
}

public String getAcao(){return acao;}
public void setAcao(String acao){
    this.acao = acao;
}

public String getPlanoOrcamentario(){return planoOrcamentario;}
public void setPlanoOrcamentario(String planoOrcamentario){
    this.planoOrcamentario = planoOrcamentario;
}

@Override
public String toString() {
    return super.toString() + " [tipo=" + tipo + ", funcao=" + funcao +
        ", subfuncao=" + subfuncao + ", programa=" + programa +
            ", acao=" + acao + ", planoOrcamentario=" + planoOrcamentario + "]";
    }


}
