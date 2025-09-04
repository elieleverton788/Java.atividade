import java.time.LocalDate;

public class Documento{
    private LocalDate data;
    private String fase;
    private double valor;

public Documento(LocalDate data, String fase, double valor){
    this.data = data;
    this.fase = fase;
    this.valor = valor;
}

public String getFase(){
    return fase;
}

public double getValor(){
    return valor;
}

public LocalDate getLocalDate(){
    return data;
}

public void setData(LocalDate data){
    this.data = data;
}

public void setFase(String fase){
    this.fase = fase;
}

public void setValor(double valor){
    this.valor = valor;
}

@Override
public String toString(){
    return "Documento [data=" + data + ", fase=" + fase +",valor=" + valor +"]";
}

}