package cineMax;
import java.util.Scanner;

public class CineMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int scelta;
        boolean controllo = true;

        System.out.println("----Benvenuto nel Menù del cinema----");
        while(controllo){
            System.out.println("Digitare un numero per scegliere cosa fare:");
            System.out.println("1) Registrati/Accedi;\n 2) Continua come ospite;");
            scelta = sc.nextInt();

            switch (scelta) { //menù per accedere e registrarsi o continuare come ospite
                case 1 ->
                    scelta=0;
                    System.out.println("1) Registrati;\n 2) Accedi:");
                    switch(scelta){
                        case 1 :
                            System.out.println("Inserisci nome: ");
                            //inserimento nome
                            System.out.println("Inserimento cognome:");
                            //inserimento cognome
                            System.out.println("Inserimento data di nascita:");
                            //inserimento data di nascita
                            System.out.println("Inserimento codice fiscale:");
                            //inserimento codice fiscale
                            System.out.println("Inserimento luogo di residenza:");
                            //inserimento luogo di residenza

                            //creazione codice utente
                            //if(codutente);
                        case 2 :
                            System.out.println("Inserisci nome utente: ");
                            //inserimento nome utente
                            System.out.println("Inserisci password: ");
                            //inserimento password
                        break;
                        default :
                            System.err.println("''"); //non dovrebbe succedere
                    }
                    }
                case 2 ->
                    scelta=0;
                    GestioneProiezioni.stampaProiezioni();
                    System.out.println("1) Cerca proiezioni;\n 2) Visualizza proiezioni:");
                    switch(scelta){
                        case 1 ->
                            System.out.println("1) Titolo \n2) Tipologia \n3)Intervallo di date \n4) Costo biglietto \n5)Combinazione dei filtri")
                            int filtri=0;
                            switch(filtri){
                                case 1 ->

                                case 2 ->
                                case 3 ->
                                case 4 ->
                                case 5 ->
                                    switch()
                            }
                    }

                default -> controllo = false;
            }
        }

    }

