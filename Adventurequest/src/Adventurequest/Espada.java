package Adventurequest;

public class Espada implements Coletavel{
    public int danoEspada;

    public int getDanoEspada(){
        return danoEspada;
    }

    public void setDanoEspada(int danoEspada){
        this.danoEspada = danoEspada;
    }

    @Override
    public void usar(){
    }

    @Override
    public void descartar(){
    }
}
