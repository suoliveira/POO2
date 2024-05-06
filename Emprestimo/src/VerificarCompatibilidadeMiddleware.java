public class VerificarCompatibilidadeMiddleware extends Middleware{

    @Override
    public boolean check(Cliente cliente, double emprestimo) {
        if ((cliente.getRendaMensal()* 0.25) <= cliente.getValorFinanciamento()){
            System.out.println("FALHOU - Valor do financiamento excede 25% da renda mensal.\n");
            return false;
        }
        System.out.println("OK - Valor do financiamento está dentro dos limites.\n");
        return checkNext(cliente,emprestimo);
    }
}
