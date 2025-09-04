import java.util.HashMap;
import java.util.Map;

public class Emenda {
    private int id;
    private String autor;
    private int ano;
    private double valorTotal;
    private Map<String, Documento>documentos = new HashMap<>();

public Emenda(int id, String autor, int ano, double valorTotal){
    this.id = id;
    this.autor = autor;
    this.ano = ano;
    this.valorTotal = valorTotal;
}

public int getId(){
    return id;
}

public String getAutor(){
    return autor;
}

public int getAno(){
    return ano;
}

public double getValorTotal(){
    return valorTotal;
}

public Map<String, Documento> getDocumentos(){
    return documentos;
}

public void setId(int id ){
    this.id = id;
}

public void setAutor(String autor){
    this.autor = autor;
}

public void setAno(int ano){
    this.ano = ano;
}

public void setValorTotal(double valorTotal){
    this.valorTotal = valorTotal;
}

public void adicionarDocumento(String nome, Documento doc){
    documentos.put(nome, doc);
}

public double calcularTotalPorFase(String fase){
    return documentos.values().stream()
    .filter(doc -> doc.getFase().equalsIgnoreCase(fase))
    .mapToDouble(Documento::getValor)
    .sum();
}

public void imprimirDocumentos(){
    documentos.forEach((k, v) -> System.out.println(k + ": " + v));
}

public void exibir(){
    System.out.println(this);
    imprimirDocumentos();
}

@Override
public String toString(){
    return "emenda [id=" + id + ",autor=" + autor + ",ano=" + ano + ", valorTotal=" + valorTotal +"]";
}

}
