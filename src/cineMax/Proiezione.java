package cineMax;

public class Proiezione{
    private int dataOraProiezione;      //non so come farlo, devo tipo creare una classe esterna chiamata orrio che estrapola data e ora?
    private  float prezzoBiglietto;
    private static int PostiOccupati;
    private final int POSTI_TOTALI=200;
    private Film film;
    private Prenotazione prenotazione;

    //costruttore
    public Proiezione(String filmId, int dataOraProiezione, String titoloFilm, GeneriFilm genere, String regista, int anno, int durataMinuti, int etaMinima, float prezzoBiglietto, int PostiOccupati, Prenotazione prenotazione){
        this.dataOraProiezione = dataOraProiezione;
        film = new Film(filmId, titoloFilm, genere, regista, anno, durataMinuti, etaMinima);
        this.prezzoBiglietto = prezzoBiglietto;
        this.PostiOccupati=PostiOccupati;
        this.prenotazione=prenotazione;
    }

    //metodi get
    public int getDataOraProiezione(){
        return dataOraProiezione;
    }

    public String getTitoloFilm(){
        return film.getTitolo();
    }

    public GeneriFilm getGenere(){

        return film.getGenere();
    }

    public String getRegista(){
        return film.getRegista();
    }

    public int getAnno(){
        return film.getAnno();
    }

    public int getDurataMinuti(){
        return film.getDurataMinuti();
    }

    public int getEtaMinima(){
        return film.getEtaMinima();
    }

    public float getPrezzoBiglietto(){
        return prezzoBiglietto;
    }


    //metodi set
    public void setDataOraProiezione(int dataOraPoiezione){
        this.dataOraProiezione = dataOraPoiezione;
    }

    public void setTitoloFilm(String titoloFilm) {
        film.setTitoloFilm(titoloFilm);
    }

    public void setGenere( GeneriFilm genere) {
        film.setGenere(genere);
    }

    public void setRegista(String regista) {
        film.setRegista(regista);
    }

    public void setAnno(int anno) {
        film.setAnno(anno);
    }

    public void setDurataMinuti(int durataMinuti) {
        film.setDurataMinuti(durataMinuti);
    }

    public void setEtaMinima(int etaMinima) {
        film.setEtaMinima(etaMinima);
    }

    public void setPrezzoBiglietto(float prezzoBiglietto) {
        this.prezzoBiglietto = prezzoBiglietto;
    }

    public void setPostiOccupati(){
            if(PostiOccupati > prenotazione.getNumeroBiglietti()){
                this.PostiOccupati= PostiOccupati-prenotazione.getNumeroBiglietti();
            }

    }

    public static int getPostiOccupati(){
        return PostiOccupati;
    }
    public int getPostiLiberi(){
        return POSTI_TOTALI-PostiOccupati;
    }



}