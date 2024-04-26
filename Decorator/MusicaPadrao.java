public class MusicaPadrao implements Musica{
    public String titulo;

    public MusicaPadrao(String titulo){
        this.titulo = titulo;
    }
    @Override
    public void tocar() {
        System.out.println("Tocando música: " +titulo);
    }
}
