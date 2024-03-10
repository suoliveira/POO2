package Adventurequest;

public class Main{
    public static void main(String[] args){

        Heroi heroi = new Heroi("Joui", 100);
        Monstro monstro = new Monstro("Enpap",120, 35);


        while(heroi.getVida() > 0 && monstro.getVida() > 0){
            if(heroi.getVida() < 50) {
                heroi.curar();
            }
            if(!monstro.defender()){
                monstro.setVida(monstro.getVida() - heroi.atacar());
            }
            if(!heroi.defender() && monstro.getVida() > 0){
                heroi.setVida(heroi.getVida() - monstro.atacar());
            }
            System.out.println("A vida do heroi é: " +heroi.getVida()+ " o monstro é: " +monstro.getVida());
        }

        if(heroi.getVida() <= 0){
            System.out.println("O herói foi derrotado");
        }else{
            System.out.println("O monstro foi derrotado");
        }
    }
}
