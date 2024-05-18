public class Main {
    public static void main(String[] args) {

        Canal canal1 = new Canal("CoisaDeNerd");
        Canal canal2 = new Canal("CadeAChave");

        Usuario usuario1 = new Usuario("Sus");
        Usuario usuario2 = new Usuario("Rafaela");
        Usuario usuario3 = new Usuario("Clara");

        usuario1.increverNoCanal(canal1);
        usuario1.increverNoCanal(canal2);

        usuario2.increverNoCanal(canal1);
        usuario3.increverNoCanal(canal2);


        canal1.publicarVideo("Montando um PC");
        canal2.publicarVideo("Vimos a aurora boreal");

        usuario3.DesinscreverNoCanal(canal2);

        canal2.publicarVideo("Visitando a cidade Ateniense");



    }
}