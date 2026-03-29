import java.util.Random;
import java.util.ArrayList;

public class Senzor {

	private int senzorID;
	private boolean stare;
	private String tipSenzor;
	private ArrayList<DateMeteo> istoricDate;
	
	public Senzor (int senzorID, boolean stare, String tipSenzor) {
		this.senzorID = senzorID;
		this.stare = stare;
		this.tipSenzor = tipSenzor;
		this.istoricDate = new ArrayList<>();
	}
	
	public String obtinetip() {
		return tipSenzor;
	}
	
	public float obtineDate() {
		if(!stare) {
			System.out.println("Senzorul " + senzorID + " nu este activ!");
			return 0;
		}
			//Generam valoare random pentru exemplu
		float valoare =  (float)(20 + new Random().nextGaussian() * 2);
		istoricDate.add(new DateMeteo(valoare, this.tipSenzor));
		return valoare;
		
	}

}
