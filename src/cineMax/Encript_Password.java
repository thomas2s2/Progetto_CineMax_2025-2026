package cineMax;

public class Encript_Password {     //DA RIVEDERE TUTTO

    String password;
    public Encript_Password(String password){
        this.password = password;
    }

    //metodi get
    /*
    public String getPassword(){
        return decrypt(password);
    }
    */

    //metodi set
    public void setPassword(String password){
        this.password = encrypt(password);
    }

    private String encrypt(String pws){
        //togli spazi inizio e fine
        //cripta carattere per carattere e crea un'altra stringa con sta roba
        //returna la nuova stringa
        return "";
    }

    private String decrypt(String pws){
        //leggi da file (penso?)
        //decripta carattere per carattere e crea una stringa
        //restituisci la stringa
        return "";
    }
}

