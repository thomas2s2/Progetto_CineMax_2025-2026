package cineMax;

import java.time.LocalDateTime;

public class Proiezione extends Film{
    private LocalDateTime dataOraProiezione;      //non so come farlo, devo tipo creare una classe esterna chiamata orrio che estrapola data e ora?
    private int id;
    private  double prezzoBiglietto;
    static final int POSTI_TOTALI=200;


    //costruttore
    public Proiezione(int id, LocalDateTime dataOraProiezione, double prezzoBiglietto, int filmId, String titolo, GeneriFilm genere, String regista, int anno, int durata, int etaMinima) {
        super(filmId, titolo, genere, regista, anno, durata, etaMinima);
        this.id = id;
        this.dataOraProiezione = dataOraProiezione;
        this.prezzoBiglietto = prezzoBiglietto;
        if(getAnno() > dataOraProiezione.getYear()) { throw new IllegalArgumentException("l'anno d'uscita del film non può essere successivo al suo anno di proiezione");}
    }

    //metodi get
    public LocalDateTime getDataOraProiezione(){
        return dataOraProiezione;
    }
    public int getId(){ return id;}
    public double getPrezzoBiglietto(){
        return prezzoBiglietto;
    }
    public int getPostiTotali(){ return POSTI_TOTALI;}

    //metodi set
    public void setDataOraProiezione(LocalDateTime dataOraPoiezione){
        this.dataOraProiezione = dataOraPoiezione;
    }
    public void setPrezzoBiglietto(double prezzoBiglietto) {
        this.prezzoBiglietto = prezzoBiglietto;
    }
    public void setId (int id){ this.id=id;}

    /*public int getPostiOccupati() {
        int occupati = 0;

        for (Prenotazione p : prenotazioni) {
            occupati += p.calcolaTotale();
        }

        return occupati;
    }
    public int getPostiLiberi(){
        return POSTI_TOTALI-getPostiOccupati();
    }

   public boolean haPosti(int quantita) {
        if (quantita > 0 && getPostiOccupati() + quantita <= POSTI_TOTALI) {
            return true;
        } else {
            return false;
        }
    }

    public void aggiornaPosti(){
        aspettiamo la classe prenotazione
    }*/
}

