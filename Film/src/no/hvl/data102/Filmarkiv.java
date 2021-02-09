package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{

	private Film[] filmTabell;
	private int antall;
	
	public Filmarkiv() {
		
	}
	
	public Filmarkiv (Film[] filmTabell, int antall) {
		this.filmTabell = filmTabell;
		this.antall = antall;
	}
	
	
	public Film[] getFilmTabell() {
		return filmTabell;
	}

	public void setFilmTabell(Film[] filmTabell) {
		this.filmTabell = filmTabell;
	}

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	private Film[] trimTab(Film[] tab, int n) {
		Film[] filmtab2 = new Film[n];
		int i = 0;
		while (i < n) {
			filmtab2[i] = tab[i];
			i++;
		 }
		 
		 return filmtab2;
	}

	@Override
	public Film[] hentFilmTabell() {
		return filmTabell;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		
		if (antall == filmTabell.length) {
			filmTabell = new Film[(int)Math.ceil(1.1*filmTabell.length)]; 
		}
		filmTabell[antall] = nyFilm;
		antall++;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		boolean bool = false;
		for (int i = 0; i <= filmTabell.length; i++) {
			
			if (filmTabell[i].getFilmnr() == filmnr) {
				filmTabell[i] = filmTabell[antall-1];
				filmTabell[i-1] = null;
				antall--;
				bool = true;
			}
		}
		return bool;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		int ant = 0;
		Film[] hjelpetabell = new Film[filmTabell.length];
		for (int i = 0; i <= hjelpetabell.length; i++) {
			if(filmTabell[i].getTittel().toUpperCase().contains(delstreng.toUpperCase())) {
				hjelpetabell[ant] = filmTabell[i];
				ant++;
			}
		}
		trimTab(hjelpetabell, ant);
		return hjelpetabell;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		int ant = 0;
		Film[] hjelpetabell = new Film[filmTabell.length];
		for (int i = 0; i <= hjelpetabell.length; i++) {
			if(filmTabell[i].getProdusent().toUpperCase().contains(delstreng.toUpperCase())) {
				hjelpetabell[ant] = filmTabell[i];
				ant++;
				}
			}
		trimTab(hjelpetabell, ant);
		return hjelpetabell;
	}

	@Override
	public int antall(Sjanger sjanger) {
		int antall = 0;
		
		for (int i = 0; i <= filmTabell.length; i++) {
			if (filmTabell[i].getSjanger() == sjanger) {
				antall++;
			}
		}
		
		return antall;
	}

	@Override
	public int antall() {
		return filmTabell.length;
	}

}
