package cineMax;
import java.util.LinkedList;
public class GestioneProiezioni{
    private LinkedList<Proiezione> proiezioni;

    public GestioneProiezioni(){
        proiezioni = new LinkedList<>();
    }

    //metodi get
    public Proiezione getProiezione(int posizione){
        return proiezioni.get(posizione);
    }

    //metodi set
    public void aggiungiProiezione(Proiezione p){
        for(int i = 0; i < proiezioni.size(); i++) {
            if (p.getDataOraProiezione() == proiezioni.get(i).getDataOraProiezione()){
                //messaggio di errore
            }
        }
        proiezioni.add(p);
    }
    public void rimuoviProiezione(int indice){
        if()
    }

}
