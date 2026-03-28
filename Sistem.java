import java.util.*;

public class Sistem {
	private String numeSistem;
	private ArrayList<Senzor> senzori;
    private ArrayList<Utilizator> utilizatori;
	public Sistem(String numeSistem) {
		this.numeSistem = numeSistem;
		this.senzori = new ArrayList<Senzor>();
	}
	public void adaugareSenzori(Senzor senzor){
		this.senzori.add(senzor);
	}


/**
 * functionaliattea "actualizare in timp real"
 * @return
 */

	public DateMeteo actualizareDate() {
		DateMeteo date = new DateMeteo();
		for(Senzor senzor: senzori)
		{
			String tip = senzor.obtinetip();
			switch (tip) {
				case "temperatura":
					date.setTemperatura(senzor.obtineDate());
					break;
				case "precipitatii":
					date.setPrecipitatii(senzor.obtineDate());
					break;
				case "umiditate":
					date.setUmiditate(senzor.obtineDate());
					break;
				case "presiune":
					date.setPresiune(senzor.obtineDate());
					break;
				case "punctRoua":
					date.setPunctRoua(senzor.obtineDate());
					break;
			}
		}
	System.out.println(date.toString());
	return date;
	}
	
	public void generareGrafic(DateMeteo date) {
		throw new UnsupportedOperationException();

	}

	public DateMeteo[] incarcareDateVechi(String oras) {
		throw new UnsupportedOperationException();

	}

	public String analizaSaptamanala() {
		throw new UnsupportedOperationException();

	}


}