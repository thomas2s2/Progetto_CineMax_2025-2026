package cineMax;
import java.util.LinkedList;
public class GestioneProiezioni{
    private static LinkedList<Proiezione> proiezioni;
    public GestioneProiezioni(){
        proiezioni = new LinkedList<>();
    }

    //metodi get
    public Proiezione getProiezione(int posizione){
        return proiezioni.get(posizione);
    }

    //metodi set

    public LinkedList<Proiezione> getProiezioni(){
        return proiezioni;
    }
    public static void stampaProiezioni(){
        for(Proiezione p: proiezioni){
            System.out.println(p);
        }
    }
    public LinkedList<Proiezione> cercaProiezioni(int r, String s){
        String[] filter = filtriArray(s);
        LinkedList<Proiezione> tmp = proiezioni;
        boolean presente;
        for(int i = 0; i < tmp.size(); ) {
            presente = true;
            if (!tmp.get(i).getTitoloFilm().equals(filter[0])){
                tmp.remove(i);
                presente = false;
            }
            if (presente && !tmp.get(i).getGenere().equals(filter[1])){
                tmp.remove(i);
                presente = false;
            }
            if (presente && !tmp.get(i).getRegista().equals(filter[2])){
                tmp.remove(i);
                presente = false;
            }
            if (presente && !(tmp.get(i).getAnno()==Integer.parseInt(filter[3]))){
                tmp.remove(i);
                presente = false;
            }
        }
        return tmp;
    }

    private String[] filtriArray(String r){
        int inizio=0;
        String[] filtri = {"","","",""};
        int j=0;
        for( int i=0; i<r.length(); i++){
           if(r.charAt(i) ==';'){
               filtri[j]= r.substring(inizio, i-1);
               j++;
               inizio = i+1;
           }
        }
        return filtri;
    }
}
