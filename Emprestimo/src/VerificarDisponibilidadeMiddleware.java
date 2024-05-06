public class VerificarDisponibilidadeMiddleware extends Middleware{

    @Override
    public boolean check(Cliente cliente, double emprestimo){
        if (emprestimo > 100000.0){
            System.out.println(" FALHOU - Valor do empréstimo excede o valor financiável pela instituição\n");
            return false;
        }
        System.out.println("OK - Valor do empréstimo está dentro dos limites.\n");
        return checkNext(cliente, emprestimo);
    }
}
