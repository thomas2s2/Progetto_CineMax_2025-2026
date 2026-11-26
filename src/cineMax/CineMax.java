package cineMax;
import java.util.Scanner;

public class CineMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //scanner per la digitazone

        int scelta;
        boolean controllo = true;

        System.out.println("=== Benvenuto nel Menù di CineMax ===");
        while(controllo){
            System.out.println("\n--- MENU PRINCIPALE ---");
            System.out.println("1) Cercare proiezioni");
            System.out.println("2) Visualizzare dettagli di una proiezione");
            System.out.println("3) Registrarsi");
            System.out.println("4) Login");
            System.out.println("0) Esci");

            System.out.print("Scegli un opzione: ");

            if (!sc.hasNextInt()) {
                System.out.println("Inserisci un numero valido.");
                sc.nextLine();
                continue; //se numero non valido, cancella e riparte
            }
            
            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                case 1 -> {//cerca proiezioni;
                    System.out.println("Ricerca in sviluppo");
                    //metodo classe proiezioni
                    }
                case 2 -> {
                    System.out.println("Dettagli in sviluppo");
                    //visualizza dettagli di una proiezione;
                    }
                case 3 -> {
                     System.out.println("Registrazione in sviluppo");
                    //registrati all'applicazione
                }
                case 4 -> {
                    System.out.println("Login in sviluppo);
                }
                case 0 -> {
                    System.out.println("Arrivederci!"};
                    controllo = false;
            }
                default -> controllo = false;
            }
        }

    }
}
