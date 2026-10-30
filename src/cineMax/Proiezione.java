package cineMax;

public class Proiezione{
    private int dataOraProiezione;      //non so come farlo, devo tipo creare una classe esterna chiamata orrio che estrapola data e ora?
    private String titoloFilm;
    private String genere;      //sarà un enum poi
    private String regista;
    private int anno;           //controllare che sia valido (data uscita < data proiezione)
    private int durataMinuti;
    private int etaMinima;
    private  float prezzoBiglietto;

    //costruttore
    public Proiezione(int dataOraProiezione, String titoloFilm, String genere, String regista, int anno, int durataMinuti, int etaMinima, float prezzoBiglietto){
        this.dataOraProiezione = dataOraProiezione;
        this.titoloFilm = titoloFilm;
        this.genere = genere;
        this. regista = regista;
        this. anno = anno;
        this. durataMinuti = durataMinuti;
        this.etaMinima = etaMinima;
        this.prezzoBiglietto = prezzoBiglietto;
    }

    //metodi get
    public int getDataOraProiezione(){
        return dataOraProiezione;
    }

    public String getTitoloFilm(){
        return titoloFilm;
    }

    public String getGenere(){
        return genere;
    }

    public String getRegista(){
        return regista;
    }

    public int getAnno(){
        return anno;
    }

    public int getDurataMinuti(){
        return durataMinuti;
    }

    public int getEtaMinima(){
        return etaMinima;
    }

    public float getPrezzoBiglietto(){
        return prezzoBiglietto;
    }


    //metodi set
    public void setDataOraProiezione(int dataOraPoiezione){
        this.dataOraProiezione = dataOraPoiezione;
    }

    public void setTitoloFilm(String titoloFilm) {
        this.titoloFilm = titoloFilm;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setDurataMinuti(int durataMinuti) {
        this.durataMinuti = durataMinuti;
    }

    public void setEtaMinima(int etaMinima) {
        this.etaMinima = etaMinima;
    }

    public void setPrezzoBiglietto(float prezzoBiglietto) {
        this.prezzoBiglietto = prezzoBiglietto;
    }
}