public class ChemineeAdapter implements Appareil {
    private Cheminee c;
    public ChemineeAdapter(Cheminee c){
        this.c=c;
    }

    public void allumer(){
        this.c.intensite+=10;
    }

    public void eteindre(){
        this.c.intensite=0;
    }

    public boolean isAllumee(){
        return this.c.intensite>0;
    }

    public String toString(){
        return this.c.toString();
    }

}
