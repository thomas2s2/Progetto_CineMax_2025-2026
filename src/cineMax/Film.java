package cineMax;

public class Film {
    private String filmId;
    private String titoloFilm;
    private GeneriFilm genere;
    private String regista;
    private int anno;
    private int durataMinuti;
    private int etaMinima;

    public Film(String filmId, String titoloFilm, GeneriFilm genere, String regista, int anno, int durataMinuti, int etaMinima) {
        this.filmId=filmId;
        this.titoloFilm =titoloFilm;
        this.genere =genere;
        this.regista =regista;
        this.anno =anno;
        this.durataMinuti =durataMinuti;
        this.etaMinima =etaMinima;
    }


    public String getTitolo() {
        return titoloFilm;
    }

    public GeneriFilm getGenere() {
        return genere;
    }

    public String getRegista() {
        return regista;
    }

    public int getAnno() {
        return anno;
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }

    public int getEtaMinima() {

        return etaMinima;
    }

    public void setTitoloFilm(String titoloFilm) {

        this.titoloFilm = titoloFilm;
    }

    public void setGenere(GeneriFilm genere) {

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
}
