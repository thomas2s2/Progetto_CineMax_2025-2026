package cineMax;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class GestioneUtenti {
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

public LinkedList<Utente> letturaUtenti() throws IOException {
    utenti = new LinkedList<>();
    BufferedReader br = new BufferedReader(new FileReader("data/Utenti.scv"));
    String riga = br.readLine();
    while(riga != null){
        String[] dati = riga.split(",");
        String nome = dati[0];
        String cognome = dati[1];
        String username = dati[2];
        String password = dati[3];
        String dataNascita = dati[4];
        String domicilio = dati[5];
        String ruolo = dati[6];

        Utente u;

        if(ruolo.toUpperCase().equals("CLIENTE")){
            u = new Cliente(nome,cognome,username,password,dataNascita,domicilio);
        }else if(ruolo.toUpperCase().equals("BIGLIETTAIO")){
            u = new Bigliettaio(nome,cognome,username,password,dataNascita,domicilio);
        }else if(ruolo.toUpperCase().equals("PROIEZIONISTA")){
            u = new Proiezionista(nome,cognome,username,password,dataNascita,domicilio);
        }else if(ruolo.toUpperCase().equals("UTENTE")){
            u = new Utente(nome,cognome,username,password,dataNascita,domicilio);
        }else{
            //errore
        }

    }

}
}
