package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        System.out.println("-------------------------------");

        // config
        Scanner sc = new Scanner(System.in);

        // data
        String[] Invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Boolean isGuestPresent = false;
        
        
        // logic
        System.out.println("Inserisci il tuo nome: ");

        String guest = sc.nextLine();
        for (int i = 0; i < Invitati.length; i++) {
            if (guest.toLowerCase().equals(Invitati[i].toLowerCase())) {
                System.out.println("Invito trovato alla posizione " + i + " nella lista degli invitati, benvenuto alla festa " + guest + "!");
                break;

            } else if (i == Invitati.length - 1) {
                System.out.println("Invito non trovato nella lista degli invitati");
            }
        }

        
        sc.close();
        System.out.println("-------------------------------");

    }

}
