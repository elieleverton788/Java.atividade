public class EmendaRelator extends Emenda {
    private String relator;
    private String parlamentarBeneficiario;

    public EmendaRelator(int id, String autor, int ano, double valorTotal,
                         String relator, String parlamentarBeneficiario) {
        super(id, autor, ano, valorTotal);
        this.relator = relator;
        this.parlamentarBeneficiario = parlamentarBeneficiario;
    }

    public String getRelator() { return relator; }
    public void setRelator(String relator) { this.relator = relator; }

    public String getParlamentarBeneficiario() { return parlamentarBeneficiario; }
    public void setParlamentarBeneficiario(String parlamentarBeneficiario) { this.parlamentarBeneficiario = parlamentarBeneficiario; }

    @Override
    public String toString() {
        return super.toString() + " [relator=" + relator +
                ", parlamentarBeneficiario=" + parlamentarBeneficiario + "]";
    }
}

