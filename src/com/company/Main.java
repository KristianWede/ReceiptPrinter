package com.company;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    String[] alleMåneder = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    Scanner sc = new Scanner(System.in);
    LocalDate today = LocalDate.now();
    String spacer = " ";

    //Selve execute.
    public void execute(){

        String navn = introduktionMedNavn();

        double beløb = introduktionMedBeløb();

        String betalingsMetode = introduktionMedMetode();

        String sælger = introduktionMedSælger();

        int recieptNum = randomNum();

        String dato = dateFinder();

        finalMessage(recieptNum, dato, navn, beløb, betalingsMetode, sælger);

    }

    public void finalMessage(int recieptNum, String dato, String navn, double beløb, String betalingsMetode, String sælger) {
        System.out.println();
        System.out.printf("%24s Receipt number: %d", spacer, recieptNum);
        System.out.println();
        System.out.printf("Dato: %40s", dato);
        System.out.println();
        System.out.printf("Navn: %40s", navn);
        System.out.println();
        System.out.printf("Beløb: %33.2f,- Kr.", beløb);
        System.out.println();
        System.out.printf("Betalingsmetode: %29s", betalingsMetode);
        System.out.println();
        System.out.printf("Sælger: %38s", sælger);

    }

    //Spørger om navn med intro.
    public String introduktionMedNavn(){
        System.out.println("Velkommen til reciept printer 2022!");
        System.out.println("Venligst indtast dit navn");
        String inputName = sc.nextLine();
        System.out.print("\n");
        return inputName;
    }

    //Spørger efter beløb.
    public double introduktionMedBeløb(){

        System.out.println("Tak! Venligst indtast det beløb du har betalt.");
        double inputBeløb = sc.nextDouble();
        System.out.print("\n");

        return inputBeløb;
    }

    //Spørger efter betalingsmetode.
    public String introduktionMedMetode(){

        System.out.println("Betalingsmetode?");
        String inputBetaling = sc.next();
        System.out.print("\n");

        return inputBetaling;
    }

    public int randomNum(){
        Random random = new Random();
        int randomNumber = random.nextInt(10000,99999);
        return randomNumber;
    }

    public String dateFinder(){

        int findDay = today.getDayOfMonth();
        int findMonth = today.getMonthValue();
        int findYear = today.getYear();

        //Der bliver minusset 1, da der ikke bliver talt 0 med. Så det er forskudt en smule.
        String date = alleMåneder[findMonth - 1] + " " + findDay + ", " + findYear;

        return date;
    }

    public String introduktionMedSælger(){

        System.out.println("Hvilken sælger?");
        String seller = sc.next();
        System.out.print("\n");

        return seller;
    }



    public static void main(String[] args) {
	Main obj = new Main();
    obj.execute();
    }
}
