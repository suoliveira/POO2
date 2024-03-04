package Adventurequest;

public class Heroi extends Personagem{
    public Coletavel item;

    public Heroi(String nome, int dano, int vidaMax, Coletavel item){
        super(nome, dano, vidaMax);
    }

    public Coletavel getItem(){
        return item;
    }

    public void setItem(Coletavel item) {
        this.item = item;
    }

    @Override
    public int atacar(){
        System.out.println("atacando fdp");
        return 0;
    }

    @Override
    public int defender(){
        System.out.println("defendendo fdp");
        return 0;
    }

}
