public class BancoDados implements Banco{
    @Override
    public void inserir(String mensagem){
        System.out.println("Inserindo no banco: " +mensagem);

    }
}

