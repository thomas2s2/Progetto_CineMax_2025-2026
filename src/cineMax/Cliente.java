package cineMax;

public class Cliente extends Utente{

    public Cliente(String nome, String cognome, String username, String password, String dataNascita, String luogoDomicilio){
        super(nome,cognome,username,password,dataNascita,luogoDomicilio,"Cliente");
    }
}
