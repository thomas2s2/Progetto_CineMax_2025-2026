package cineMax;

public class Cliente extends Utente{

    public Cliente(String nome, String cognome, String username, String password, String dataNascita, String luogoDomicilio){
        super(nome,cognome,username,password,dataNascita,luogoDomicilio,"Cliente");
    }


    // restituisce le prenotazioni del cliente.
    public list<Prenotazione> visualizzaPrenotazioni(GestionePrenotazioni gestore) {
        return gestore.prenotazioniCliente(this);
    }

    // crea prenotazione per una proiezione.
    public Prenotazione creaPrenotazione (GestionePrenotazioni gestore, Proiezione proiezione, int numeroBiglietti) {
        return gestore.creaPrenotazione(this, proiezione, numeroBiglietti);
    }

    // cambia prenotazione
    public void modificaPrenotazione (GestionePrenotazioni gestore, String codice, Proiezione nuovaProiezione) {
        gestore.modificaPrenotazione(this, codice, nuovaPrenotazione);
    }

    // cancella prenotazione
    public void aliminaPrenotazione (GestionePrenotazioni gestore, String codice) {
        gestore.eliminaPrenotazione (this, codice);
    }
}


