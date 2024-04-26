public class Main {
    public static void main(String[] args){

        Musica track13 = new MusicaPadrao("iCanDoItWithABrokenHeart");

        track13 = new EfeitosSonoros(track13);
        track13 = new Equalizar(track13);

        track13.tocar();

    }
}
