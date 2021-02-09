package no.hvl.data102.klient;

import java.util.Scanner;
import no.hvl.data102.*;
import no.hvl.data102.adt.FilmarkivADT;


public class Tekstgrensesnitt {

	public final static Scanner TASTATUR =  new Scanner(System.in);
	
	// lese opplysningene om en FILM fra tastatur
	 public Film lesFilm() {
		
		 System.out.println("Filmnr: ");
		 	int Filmnr = TASTATUR.nextInt();
		 	
		 System.out.println("Produsent: ");
		 	String Produsent = TASTATUR.nextLine();
		 	
		 System.out.println("Tittel: ");
		 	String Tittel = TASTATUR.nextLine();
		 	
		 System.out.println("Årstall: ");
		 	int Arstall = TASTATUR.nextInt();
		 	
		 System.out.println("Sjanger (ACTION, DRAMA, HISTORY, SCIFI): ");
		 	String Strsjanger = TASTATUR.nextLine(); 
		 	Sjanger sjanger = Sjanger.finnSjanger(Strsjanger);
		 	
		 System.out.println("Filmselskap: ");
		 	String Filmselskap = TASTATUR.nextLine();
		
		return new Film(Filmnr, Produsent, Tittel, Arstall, sjanger, Filmselskap);
	 }

	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	 public void visFilm(Film film) {
		 System.out.println
		 			("Filmnr: " + film.getFilmnr() + 
		 			", Produsent: " + film.getProdusent() + 
		 			", Tittel: " + film.getTittel() + 
		 			", Årstall: " + film.getArstall() + 
		 			", Sjanger: " + film.getSjanger() +
		 			", Filmselskap: " + film.getFilmselskap()
		 			);
	 }
	
	 // Skrive ut alle Filmer med en spesiell delstreng i tittelen
	 public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng){
		 for (Film f : filma.soekTittel(delstreng)) {
			 visFilm(f);
		 }
	 }
	
	 // Skriver ut alle Filmer av en produsent / en gruppe
	 public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		 for (Film f : filma.soekProdusent(delstreng)) {
			 visFilm(f);
		 }
		 }
	
	 // Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	 public void skrivUtStatistikk(FilmarkivADT filma){
		System.out.println("Det er " + filma.antall() + "i tabellen");
		System.out.println("Antall action filmer: " + filma.antall(Sjanger.ACTION));
		System.out.println("Antall drama filmer: " + filma.antall(Sjanger.DRAMA));
		System.out.println("Antall historie filmer: " + filma.antall(Sjanger.HISTORY));
		System.out.println("Antall scifi filmer: " + filma.antall(Sjanger.SCIFI));
	 
	 
	 }
	
}
