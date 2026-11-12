package cineMax;
import java.util.Scanner;

public class CineMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

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
            
            scelta = sc.nextInt();

            switch (scelta) {
                case 1 -> {//cerca proiezioni;
                    System.out.println("");
                    //metodo classe proiezioni
                    }
                case 2 -> {//visualizza dettagli di una proiezione;
                    }
                case 3 -> {//registrati all'applicazione

                }
                default -> controllo = false;
            }
        }

    }
}
