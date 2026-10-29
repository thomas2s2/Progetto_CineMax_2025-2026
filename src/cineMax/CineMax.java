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
            System.out.println("1) Cercare Proiezioni;\n 2) Registrarsi;");
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
