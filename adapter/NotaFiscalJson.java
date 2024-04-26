public class NotaFiscalJson implements Json {
    @Override
    public void processarNotaFiscalJson(String json) {
        System.out.println("Processando nota fiscal Json e inserindo no banco de dados: " +json);
    }
}
