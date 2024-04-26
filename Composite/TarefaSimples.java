public class TarefaSimples implements Tarefa{

    private String titulo;
    private String descricao;
    private String prazo;

    public TarefaSimples(String titulo, String descricao, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    @Override
    public void adicionarTarefa(Tarefa tarefa) {

    }

    @Override
    public void removerTarefa(Tarefa tarefa) {

    }

    @Override
    public void imprimir() {
        System.out.println("Título: " +titulo);
        System.out.println("Descrição: " +descricao);
        System.out.println("Prazo: " +prazo);
        System.out.println("----------------------");

    }
}
