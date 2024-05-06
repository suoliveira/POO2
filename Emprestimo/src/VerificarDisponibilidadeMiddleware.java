public class VerificarDisponibilidadeMiddleware extends Middleware{

    @Override
    public boolean check(Cliente cliente, double emprestimo){
        if (emprestimo > 100000.0){
            return false;
        }
        return checkNext(cliente, emprestimo);
    }
}
