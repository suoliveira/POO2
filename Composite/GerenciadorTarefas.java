public class GerenciadorTarefas {
    public static void main(String[] args){

        TarefaSimples tarefa1 = new TarefaSimples("Fazer código", "Fazer código composite java", "24/04");
        TarefaSimples tarefa2 = new TarefaSimples("Fazer código", "Fazer código decorator java", "24/04");

        TarefaComposta tarefaComposta = new TarefaComposta("\n A fazer: ");
        tarefaComposta.adicionarTarefa(tarefa1);
        tarefaComposta.adicionarTarefa(tarefa2);

        tarefaComposta.imprimir();

    }
}
