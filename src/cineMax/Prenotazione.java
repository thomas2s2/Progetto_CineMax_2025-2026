package cineMax;

public class Prenotazione {
    private String codPren;  //codice prenotazione
    private String codClien;  //codice del cliente che ha prenotato
    private int numBigl;        //numero dei biglietti per prenotazione
    private double prezBiglUni;//costo del biglietto unitario
    private double prezTot;   //prezzo totale dei biglietti
    private int data;


    public Prenotazione( int numBigl, String codClien, int data){
        this.codPren = creaCodicePrenotazione();
        //codiceCliente
        this.codClien = codClien;
        this.numBigl = numBigl;
        this.prezBiglUni = prezBiglUni; //in base al film, accederà alla classe proiezione
        this.prezTot = numBigl * prezBiglUni;
        this.data = data;
    }


    //getter
    public String getCodicePrenotazione(){
        return codPren;
    }
    public int getNumeroBiglietti(){
        return numBigl;
    }
    public double getPrezzoBigliettoUnitario(){
        return prezBiglUni;
    }
    public double getPrezzoTotale(){
        return prezTot;
    }
    public int getDataProiezione(int data){
        return data;
    }

    //setter
    public void setNumeroBiglietti(int numBigl){
        this.numBigl = numBigl;
        setPrezzoTotale(numBigl);
    }
    private void setPrezzoTotale(int numBigl){
        this.prezTot = numBigl * prezBiglUni;
    }
    //altro
    private String creaCodicePrenotazione(){    //fare
        String codicePrenotazione = "";
        //prende data e ora precisa e ci aggiunge parte del codice utente (dopo vedo come fare)
        return codicePrenotazione;
    }


}
