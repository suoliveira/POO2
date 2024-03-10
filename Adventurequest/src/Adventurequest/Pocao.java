package Adventurequest;
public class Pocao implements Coletavel{
    public int cura = 20;
    public int getCura(){
        return cura;
    }
    public void setCura(int cura){
        this.cura = cura;
    }
    @Override
    public int usar(){
        return this.getCura();
    }
}
