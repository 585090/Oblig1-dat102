package no.hvl.data102;

import no.hvl.data102.adt.*;
import no.hvl.data102.*;
import no.hvl.data102.klient.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;


public class Fil {

	final static String skille = "#";
	
	public static void leseFraFil (FilmarkivADT filmarkiv, String filnavn) {
		
		FileReader fil = null;
		BufferedReader innfil = null;
		
		try {
			fil = new FileReader(filnavn);
		}
		
		catch(FileNotFoundException unntak) {
			System.out.println("Finner ikke filen: " + filnavn);
			System.exit(1);
		}
		
		try {
			innfil = new BufferedReader(fil);
			
			String linje = innfil.readLine();
			int n = Integer.parseInt(linje);
			
			String post = innfil.readLine();
			for (int i = 0; i < n; i++) {
				
				String[] felt = post.split(skille);
				
				int filmnr = Integer.valueOf(felt[0]);
				String produsent = felt[1];
				String tittel = felt[2];
				int arstall = Integer.valueOf(felt[3]);
				String sjanger = felt[4];
					Sjanger sjang = Sjanger.finnSjanger(sjanger);
				String filmselskap = felt[5];
				
				Film film = new Film(filmnr, produsent, tittel, arstall, sjang, filmselskap);
				System.out.println(film);
				
				post = innfil.readLine();
			}
			
			innfil.close();			
		}
		
		catch (IOException e) {
			System.out.println("Feil ved lesing av fil: " + e);

			System.exit(2);
		}
	}
	
	
	public static void skrivTilFil (FilmarkivADT filmarkiv, String filnavn) {
		
		int antall = filmarkiv.antall();
		
		try {
			FileWriter fil = new FileWriter(filnavn, false);
			
			PrintWriter utfil = new PrintWriter(filnavn);
			
			utfil.println(antall);

			
		}

		catch (IOException e) {
			System.out.println("Feil bed skriving til fil: " + e);
			System.exit(3);
		}
		
	}
	
}
