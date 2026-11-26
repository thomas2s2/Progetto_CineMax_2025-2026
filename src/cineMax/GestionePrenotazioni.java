package cineMax;
import java.util.LinkedList;

public class GestionePrenotazioni extends Gestore<Prenotazione> {
    private LinkedList<Prenotazione> prenotazioni;
    private int numBigl;
    private String codClien;
    private int data;
    public GestionePrenotazioni(LinkedList<Prenotazione> prenotazioni, int numBigl, String codClien){
        this.prenotazioni = new LinkedList<>();
    }

    //getter
    public Prenotazione visualizzaPrenotazione(int i){  //bisogna filtrare per codice cliente o film, non usare i, in tutti dove ho messo i
        return prenotazioni.get(i);
    }

    //setter
    public void modificaPrenotazione(Prenotazione prenModif, int i){
        prenotazioni.set(i,prenModif);
    }

    //altro
    public void creaPrenotazione(int numBiglietti, String codClien, int data){
        //crea codice prenotazione --> lo controlla e se == lancia eccezione
        prenotazioni.add(new Prenotazione(numBiglietti, codClien, data));
    }
    public LinkedList<Prenotazione> cercaPrenotazioni(String Filtro) {
        super();    //chiama la ricerca di Gestore
    }




    public LinkedList<Prenotazione> prenotazioniOggi(String data){
        LinkedList<Prenotazione>  prenOggi = new LinkedList<>();
        cercaPrenotazioni(data);
        return prenOggi;
    }
    public void eliminaPrenotazione(int i){
        //se esiste, se no eccezione
        prenotazioni.remove(i);
    }
}
