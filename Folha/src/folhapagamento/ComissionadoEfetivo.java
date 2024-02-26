package folhapagamento;

public class ComissionadoEfetivo extends Comissionado {

    private double salario;

    public ComissionadoEfetivo (String nome, String cpf, double valorTotalDeVendas, double percentualComissao, double salario) {
        super(nome, cpf, valorTotalDeVendas, percentualComissao);
        this.salario = salario;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario() + this.salario;
    }
}
