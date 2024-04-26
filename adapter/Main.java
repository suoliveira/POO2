public class Main {
    public static void main(String[] args){
        Banco bancoDeDados = new BancoDados();
        Xml notaFiscalXml = new NotaFiscalXml();
        Json notaFiscalJson = new NotaFiscalJson();

        SistemaFinanceiro sistemaFinanceiro = new SistemaFinanceiro(bancoDeDados, notaFiscalXml);

        sistemaFinanceiro.receberNota("XML");

        AdapterJson adapterJson = new AdapterJson(notaFiscalJson);

        adapterJson.processarNotaFiscalXML("XML");
    }
}
