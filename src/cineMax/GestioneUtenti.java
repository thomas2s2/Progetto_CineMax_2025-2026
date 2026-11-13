package cineMax;
import java.util.LinkedList;

public class GestioneUtenti extends Gestore<Utente>{
    private LinkedList<Utente> utenti;

    public GestioneUtenti(){
        utenti = new LinkedList<>();
    }

    public LinkedList<Utente> caricaUtenti(){
        return utenti;
    }
    public void salvaUtenti(){

    }
    public Utente cercaUtente(Utente u){
        super(u);
        }
    }
    //utile se il sito fa modificare gli utenti,cancellarli o farli registrare senza usare il file csv
    /*public void registraUtente(Utente u) {
        utenti.add(u);
    }
    public void modificaUtente(Utente u){
        super(u);
    }
    public void eliminaUtente(Utente u){
        super(u);
    }*/
}
