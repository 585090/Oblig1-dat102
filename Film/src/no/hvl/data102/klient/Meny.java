package no.hvl.data102.klient;

import no.hvl.data102.adt.*;
import no.hvl.data102.*;
import no.hvl.data102.klient.Tekstgrensesnitt;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	public Meny (FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}
	
}
