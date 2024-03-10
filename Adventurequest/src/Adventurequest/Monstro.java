package Adventurequest;

import java.util.Random;

public class Monstro extends Personagem{
    public int danoAtaque;

    public Random random = new Random();
    public Monstro(String nome, int vidaMax, int danoAtaque){
        super(nome,vidaMax);
        this.danoAtaque = danoAtaque;
    }

    public int getDanoAtaque(){
        return danoAtaque;
    }

    public void setDanoAtaque(int danoAtaque){
        this.danoAtaque = danoAtaque;
    }

    @Override
    public int getVida(){
        return super.getVida();
    }

    @Override
    public void setVida(int vida){
        super.setVida(vida);
    }

    @Override
    public String getNome(){
        return super.getNome();
    }

    @Override
    public void setNome(String nome){
        super.setNome(nome);
    }

    @Override
    public int atacar(){
        int dano = this.getDanoAtaque() + random.nextInt(20);
        System.out.println("atacando fdp o dano causado é de: " + dano);
        return dano;
    }

    @Override
    public boolean defender(){
        int defesa = random.nextInt(10);
        if (defesa > 8){
            System.out.println("defendendo fdp monstrengo");
            return true;
        }else{
            System.out.println("defesa falhou monstrengo");
            return false;
        }
    }

}
