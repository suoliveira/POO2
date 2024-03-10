package Adventurequest;
import java.util.Random;

public class Espada implements Coletavel{
    public int danoEspada;
    public Random random = new Random();

    public int getDanoEspada(){
        return danoEspada;
    }

    public void setDanoEspada(int danoEspada){
        this.danoEspada = danoEspada;
    }

    public Espada(int danoEspada){
        this.danoEspada = danoEspada;
    }

    @Override
    public int usar(){
        return this.getDanoEspada() + random.nextInt(20);
    }
}
