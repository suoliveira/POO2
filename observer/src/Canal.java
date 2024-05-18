import java.util.ArrayList;
import java.util.List;

public class Canal {
    private List<Observer> inscritos;
    private String nomeCanal;
    private String video;

    public Canal (String nomeCanal){
        this.nomeCanal = nomeCanal;
        this.inscritos = new ArrayList<>();
    }

    public void adicionarInscrito(Observer observer){
        inscritos.add(observer);
    }

    public void removerInscrito(Observer observer){
        inscritos.remove(observer);
    }

    public void notificar(){
        for (Observer observer : inscritos){
            observer.notificacao(nomeCanal, video);
        }
    }

    public void publicarVideo(String nomeDoVideo){
        this.video = nomeDoVideo;
        System.out.println("\n" +nomeCanal + " publicou " +nomeDoVideo+ "\n");
        notificar();
    }

    public String getNomeCanal() {
        return nomeCanal;
    }
}
