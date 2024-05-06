public class VerificarCompatibilidadeMiddleware extends Middleware{

    @Override
    public boolean check(Cliente cliente, double emprestimo) {
        if ((cliente.getRendaMensal()* 0.25) <= cliente.getValorFinanciamento()) {
            return false;
        }
        return checkNext(cliente,emprestimo);
    }
}
