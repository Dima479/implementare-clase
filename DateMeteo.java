import java.time.LocalDateTime;

public class DateMeteo {

	private float temperatura;
	private float precipitatii;
	private float umiditate;
	private float presiune;
	private float punctRoua;
	private String oraData;
	private String Oras;
	
	
	public DateMeteo() {
		this.oraData = java.time.LocalDateTime.now().toString();
	}
	
	public DateMeteo(float valoare, String tip) {
		this();
		switch (tip.toLowerCase()) {
		case "temperatura": this.temperatura = valoare; break;
		case "precipitatii": this.precipitatii = valoare; break;
		case "umiditate": this.umiditate = valoare; break;
		case "presiune": this.presiune = valoare; break;
		case "punctroua": this.punctRoua = valoare; break;
		}
	}
	
	//Seteri
	public void setTemperatura(float temp) {
		this.temperatura = temp;
	}
	public void setPrecipitatii(float prec) {
		this.precipitatii = prec;
	}
	public void setUmiditate(float umid) {
		this.umiditate = umid;
	}
	public void setPresiune(float pres) {
		this.presiune = pres;
	}
	public void setPunctRoua(float pnct) {
		this.punctRoua = pnct;
	}
	
	
	
	public float getTemperatura() { 
		return temperatura;
	}
    public String getOraData() {
    	return oraData;
    }
	
	@Override
	public String toString() {
		return String.format("DateMeteo [%s] -> Temperatura: %.1f, Precipitatii: %.1f, Umiditate: %.1f, Presiune: %.1f, PunctRoua: %.1f", oraData, temperatura, precipitatii, umiditate, presiune, punctRoua);
	}

}