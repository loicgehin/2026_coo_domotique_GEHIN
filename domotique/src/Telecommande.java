import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Appareil> appareils;

    public Telecommande() {
        this.appareils = new ArrayList<>();
    }

    public void ajouterAppareil(Appareil ap) {
        this.appareils.add(ap);
    }

    public void activerAppareil(int i) {
        this.appareils.get(i).allumer();
    }

    public void desactiverAppareil(int i) {
        this.appareils.get(i).eteindre();
    }

    public void activerTout(){
        for(Appareil i : appareils)
            i.allumer();
    }

    public int getNombre(){
        return this.appareils.size();
    }

}
