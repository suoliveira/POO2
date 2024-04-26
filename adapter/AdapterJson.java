public class AdapterJson implements Xml {

    private Json notaFiscalJson;

    public AdapterJson(Json notaFiscalJson) {
        this.notaFiscalJson = notaFiscalJson;
    }

    @Override
    public void processarNotaFiscalXML(String xml) {
        String json = converterXmlParaJson(xml);
        notaFiscalJson.processarNotaFiscalJson(json);

    }

    private String converterXmlParaJson(String xml) {
        return "\"Nota fiscal convertida de XML para JSON\" ";
    }
}
