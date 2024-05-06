public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Adalberto", 500000.0, 100000.0, true);

        Middleware middleware = Middleware.link(
                new VerificarDisponibilidadeMiddleware(),
                new VerificarCompatibilidadeMiddleware(),
                new VerificarHistoricoMiddleware());

        if (middleware.check(cliente1, cliente1.getValorFinanciamento())){
            System.out.println("Aprovado para "+cliente1.nome);
        }else{
            System.out.println("Negado para "+cliente1.nome);
        }

    }
}

