package cineMax;
public class Utente {
    private String nome;
    private String cognome;
    private String username;
    private String password;        //devo vedere come metterlo
    private String dataNascita;         //facoltativa
    private String luogoDomicilio;


    //costruttore
    public Utente(String nome, String cognome, String username, String password, String dataNascita, String luogoDomicilio){
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.dataNascita = dataNascita;
        this.luogoDomicilio = luogoDomicilio;
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

    private String getPassword(){
        return password;
    }

    public String getDataNascita(){
        return dataNascita;
    }

    public String getLuogoDomicilio(){
        return luogoDomicilio;
    }

    //metrodi set

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public void setUsername(String username){
        this.username = username;
    }

   /* public void setPassword(String vecchiaPws,String nuovaPws){
        if(this.password.equals(vecchiaPws)) {
           this.password = Encript_password.encrypt(nuovaPws); //metodo della classe Encript_Password che riceverà una stringa, la cripterà e restituirà una stringa criptata
        }
    }*/

    public void dataNascita(String dataNascita){
        this.dataNascita = dataNascita;
    }

    public void setLuogoDomicilio(String luogoDomicilio){
        this.luogoDomicilio = luogoDomicilio;
    }


}
