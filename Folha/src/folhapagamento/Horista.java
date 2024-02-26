package folhapagamento;

public class Horista extends MensalFixo{

    private double quantidadeHorasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, double salario, double qtdhoras, double valorHora){
        super(nome, cpf, salario);
        this.quantidadeHorasTrabalhadas = qtdhoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        if(this.quantidadeHorasTrabalhadas > 40){
            return super.calcularSalario() + (this.quantidadeHorasTrabalhadas - 40) * this.valorHora;
        }

        return super.calcularSalario();
    }
}
