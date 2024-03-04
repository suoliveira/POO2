package Adventurequest;

public abstract class Personagem {
    public String nome;
    public int dano;
    public int vida;
    public int vidaMax;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getDano(){
        return this.dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMax() {
        return this.vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public Personagem(String nome, int dano, int vidaMax){
            this.nome = nome;
            this.dano = dano;
            this.vida = vidaMax;
            this.vidaMax = vidaMax;
        }

        public abstract int atacar();
        public abstract int defender();

    }
