package cineMax;

public class Bigliettaio extends Utente{

    public Bigliettaio(String nome, String cognome, String username, String password, String dataNascita, String luogoDomicilio){
        super(nome,cognome,username,password,dataNascita,luogoDomicilio,"Bigliettaio");
    }

    // visualizza prenotazioni di oggi
    public list<prenotazione> prenotazioniOggi(GestionePrenotazioni gestore) {
        return gestore.prenotazioniOggi();
    }

    // cerca prenotazione tramite codice
    public Prenotazione cercaPrenotazione(GestionePrenotazioni gestore, String codice) {
        return gestore.cercaPrenotazione(codice);
    }

    // visualizza dettagli di una prenotazione
    public Prenotazione visualizzaPrenotazione(GestionePrenotazioni gestore, String codice) {
        return gestore.cercaPrenotazione(codice); 
    }
}
