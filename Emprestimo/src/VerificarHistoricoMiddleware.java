public class VerificarHistoricoMiddleware extends Middleware{

    public boolean check(Cliente cliente, double emprestimo){

        if(cliente.isNomeSujo()){
            return false;
        }
        return checkNext(cliente, emprestimo);
    }
}
