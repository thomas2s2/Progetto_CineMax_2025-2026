package cineMax;

import java.lang.classfile.attribute.DeprecatedAttribute;

public class Proiezioni {
    private int dataOraProiezione;
    private String titoloFilm;
    private String genere;
    private String regista;
    private int anno;
    private int durataMinuti;
    private int etaMinima;
    private int prezzoBiglietto;

    //costruttore
    public Proiezioni(int dataOraProiezione, String titoloFilm, String genere, String regista, int anno, int durataMinuti, int etaMinima, int prezzoBiglietto){
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

    public int getPrezzoBiglietto(){
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

    public void setPrezzoBiglietto(int prezzoBiglietto) {
        this.prezzoBiglietto = prezzoBiglietto;
    }
}
