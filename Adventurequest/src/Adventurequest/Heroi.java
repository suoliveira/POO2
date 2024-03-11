package Adventurequest;

import java.util.Random;
public class Heroi extends Personagem {

    private int acumulaDano = 0;
    private Espada espada = new Espada(5);
    public Random random = new Random();
    private Pocao pocao = new Pocao();
    private int qtdPocao = 3;


    public Heroi(String nome, int vidaMax){
        super(nome, vidaMax);
    }

    @Override
    public int atacar(){
        int dano = this.espada.usar();
        this.setAcumulaDano(this.acumulaDano + dano);
        System.out.println("⚔⚔ Herói causa " + dano + " de dano");

        if (this.acumulaDano >= 40){
            dano = 48;
            System.out.println("🐱‍👤🐱‍👤 Habilidade especial sendo usada, o dano causado é de " +dano+ "🐱‍👤🐱‍👤");
            this.setAcumulaDano(0);
        }
        return dano;
    }

    @Override
    public boolean defender(){
        int defesa = random.nextInt(10);
        if (defesa > 4) {
            System.out.println("💪💪 Heroi defendeu");
            return true;
        } else {
            System.out.println("👎👎 Heroi não defendeu");
            return false;
        }
    }

    public void curar(){
        if (qtdPocao > 0){
            this.setVida(Math.min(this.getVida() + this.pocao.usar(), this.getVidaMax()));
            System.out.println("💖💖 Herói curado! Vida atual:" + this.getVida()+ " 💖💖");
            qtdPocao--;
        }else{
            System.out.println("💀💀 Herói não possui mais poções!!! 💀💀");
        }
    }

    public int getAcumulaDano(){
        return acumulaDano;
    }

    public void setAcumulaDano(int acumulaDano){
        this.acumulaDano = acumulaDano;
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
    public int getVida(){
        return super.getVida();
    }

    @Override
    public void setVida(int vida){
        super.setVida(vida);
    }

    public Espada getEspada(){
        return espada;
    }

    public void setEspada(Espada espada){
        this.espada = espada;
    }
}


