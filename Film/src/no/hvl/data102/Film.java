package no.hvl.data102;


public class Film {

	private int filmnr;
	private String produsent;
	private String tittel;
	private int arstall;
	private Sjanger sjanger;
	private String filmselskap;

	
	//Tomt objekt, alle variablene har tomme verdier
	public Film() {
		this(0, "", "", 0, null, "");
	}
	
	
	public Film (int filmnr, String produsent, String tittel, int arstall, Sjanger sjanger, String filmselskap) {
		
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.arstall = arstall;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
	}

	
	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getArstall() {
		return arstall;
	}

	public void setArstall(int arstall) {
		this.arstall = arstall;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	
	static Film[] trimTab(Film[] tab, int n) {
		Film[] filmtab2 = new Film[n];
		int i = 0;
		while (i < n) {
			filmtab2[i] = tab[i];
			i++;
		 }
		 
		 return filmtab2;
	}
}