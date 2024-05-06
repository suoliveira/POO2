public class Cliente {
    public String nome;
    private double rendaMensal;
    private double valorFinanciamento;
    private boolean  nomeSujo;

    public Cliente(String nome, double rendaMensal, double valorFinanciamento, boolean nomeSujo) {
        this.nome = nome;
        this.rendaMensal = rendaMensal;
        this.valorFinanciamento = valorFinanciamento;
        this.nomeSujo = nomeSujo;
    }

    public boolean isNomeSujo(){
        return nomeSujo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public double getValorFinanciamento() {
        return valorFinanciamento;
    }
}
