public class VerificarHistoricoMiddleware extends Middleware{

    public boolean check(Cliente cliente, double emprestimo){

        if(cliente.isNomeSujo()){
            System.out.println("FALHOU - Cliente possui nome sujo.\n");
            return false;
        }
        System.out.println("OK - Cliente não possui nome sujo.\n");
        return checkNext(cliente, emprestimo);
    }
}
