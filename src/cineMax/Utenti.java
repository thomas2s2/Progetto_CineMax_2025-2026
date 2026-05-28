package cineMax;
public class Utenti {
    private String nome;
    private String cognome;
    private String username;
    private Encript_Password password;          //devo vedere come metterlo
    private int dataNascita;
    private String luogoDomicilio;
    private String ruolo;


    //costruttore
    public Utenti(String nome, String cognome, String username, Encript_Password password, int dataNascita, String luogoDomicilio, String ruolo){
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.dataNascita = dataNascita;
        this.luogoDomicilio = luogoDomicilio;
        this.ruolo = ruolo;
    }

    //metodi get
    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public String getUsername(){
        return username;
    }

    public String password

}
