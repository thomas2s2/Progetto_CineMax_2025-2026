package cineMax;

public class Proiezionista extends Utente{

    public Proiezionista(String nome, String cognome, String username, String password, String dataNascita, String luogoDomicilio){
        super(nome,cognome,username,password,dataNascita,luogoDomicilio,"Proiezionista");
    }

}

// aggiunge nuova preoiezione
public void aggiungiPreoiezione(GestioneProiezioni gestore, Proiezione proiezione) {
    gestore.aggiungiProiezione(proiezione);
}

// modifica una proiezione
public void modificaProiezione (GestioneProiezioni gestore, int indice, Proiezione nuovaProiezione) {
    gestione.modificaProiezione(indice, nuovaProiezione);
}

// elimina proiezione
public void eliminaProiezione(Gestione<prenotazioni gestore, int indice) {
    gestione.eliminaProiezione(indice);
}
}
