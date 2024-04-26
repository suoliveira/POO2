public class EfeitosSonoros extends Decorator{
    public EfeitosSonoros(Musica musicaAltaDefinicao){
        super(musicaAltaDefinicao);
    }

    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Adicionando efeitos sonoros");
    }
}

