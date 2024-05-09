public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Adalberto", 5000, 3000, false, 3);

        Middleware middleware = Middleware.link(
                new VerificarDisponibilidadeMiddleware(),
                new VerificarCompatibilidadeMiddleware(),
                new VerificarHistoricoMiddleware());

        double valor = cliente1.getValorFinanciamento()/ cliente1.getParcelas();
        System.out.println("valor da divisão: " +valor);

        if (middleware.check(cliente1, cliente1.getValorFinanciamento())){
            System.out.println("Aprovado para "+cliente1.nome);
        }else{
            System.out.println("Negado para "+cliente1.nome);
        }

    }
}

