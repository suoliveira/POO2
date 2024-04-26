import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa{

    private String titulo;
    private List<Tarefa> tarefas = new ArrayList<>();

    public TarefaComposta(String titulo){
        this.titulo = titulo;
    }


    @Override
    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    @Override
    public void removerTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }

    @Override
    public void imprimir(){
        System.out.println("Tarefas: " +titulo);
        for (Tarefa tarefa : tarefas){
            tarefa.imprimir();
        }
    }
}
