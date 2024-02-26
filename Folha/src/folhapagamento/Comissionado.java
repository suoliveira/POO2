package folhapagamento;

public class Comissionado extends Funcionario{

    private double valorTotalDeVendas;
    private double percentualComissao;

    public Comissionado(String nome, String cpf, double valorTotalDeVendas, double percentualComissao){
        super(nome, cpf);
        this.valorTotalDeVendas = valorTotalDeVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario(){
        return this.valorTotalDeVendas * this.percentualComissao;
    }
}
