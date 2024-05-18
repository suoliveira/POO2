import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observer {
    private String nome;
    private List<Canal> canaisInscritos;

    public Usuario(String nome) {
        this.nome = nome;
        this.canaisInscritos = new ArrayList<>();
    }

    public void increverNoCanal(Canal canal) {
        canal.adicionarInscrito(this);
    }

    public void DesinscreverNoCanal(Canal canal) {
        canal.removerInscrito(this);
    }

    @Override
    public void notificacao(String nomeDoCanal, String nomeDoVideo) {
        System.out.println("------" +nome+ "------"+" Um novo video do canal " + nomeDoCanal + " foi publicado: " + nomeDoVideo);
    }
}

