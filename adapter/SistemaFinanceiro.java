public class SistemaFinanceiro {
    private Banco bancoDeDados;
    private Xml notaFiscalXml;

    public SistemaFinanceiro(Banco bancoDeDados, Xml notaFiscalXml) {
        this.bancoDeDados = bancoDeDados;
        this.notaFiscalXml = notaFiscalXml;
    }

    public void receberNota(String xml){
        notaFiscalXml.processarNotaFiscalXML(xml);
    }
}
