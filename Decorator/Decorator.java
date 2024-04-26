abstract class Decorator implements Musica{

    private Musica musicaAltaDefinicao;

    public Decorator(Musica musicaAltaDefinicao) {
        this.musicaAltaDefinicao = musicaAltaDefinicao;
    }

    @Override
    public void tocar() {
        musicaAltaDefinicao.tocar();
    }
}
