package cineMax;
public class Utenti {
    private String nome;
    private String cognome;
    private String username;
    private String password;        //devo vedere come metterlo
    private String dataNascita;
    private String luogoDomicilio;
    private String ruolo;


    //costruttore
    public Utenti(String nome, String cognome, String username, String password, String dataNascita, String luogoDomicilio, String ruolo){
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

    public String password(){
        return password;
    }

    public String getDataNascita(){
        return dataNascita;
    }

    public String luogoDomicilio(){
        return luogoDomicilio;
    }
    public String getRuolo(){
        return ruolo;
    }

    //metrodi set

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void  setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        //metodo della classe Encript_Password che riceverà una stringa, la cripterà e restituirà una stringa criptata
    }

    public void dataNascita(String dataNascita){
        this.dataNascita = dataNascita;
    }

    public void setLuogoDomicilio(String luogoDomicilio){
        this.luogoDomicilio = luogoDomicilio;
    }

    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }

}
