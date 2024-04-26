public class Equalizar extends Decorator{
    public Equalizar(Musica musicaAltaDefinicao){
        super(musicaAltaDefinicao);
    }

    @Override
    public void tocar() {
        super.tocar();
        System.out.println("Equalizando");
    }
}
